package au.com.iglooit.silverwater.service.webservice;

import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.model.vo.EnquireVO;
import au.com.iglooit.silverwater.model.vo.JsonResponse;
import au.com.iglooit.silverwater.model.vo.OKResponse;
import au.com.iglooit.silverwater.service.dao.EnquireDAO;
import au.com.iglooit.silverwater.service.queue.EnquireEmailQueue;
import au.com.iglooit.silverwater.service.queue.GenerateQueue;
import au.com.iglooit.silverwater.utils.DateUtils;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import static com.google.appengine.api.taskqueue.TaskOptions.Builder.withUrl;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
@Controller
public class EnquireServiceWS {
    @Resource
    private EnquireDAO enquireDAO;

    @RequestMapping(value = "/ws/enquire", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResponse createEnquire(@RequestBody EnquireVO enquireVO) {
        Enquire enquire = enquireVO.toEnquire();
        enquire.setEnquireDate(DateUtils.getNow());
        enquireDAO.createEnquire(enquire);
        Queue queue = QueueFactory.getQueue(EnquireEmailQueue.ENQUIRE_EMAIL_QUEUE_NAME);
        queue.add(withUrl(GenerateQueue.GENERATE_QUEUE_URL)
                .param("keyString", enquire.getKeyString()));
        return new OKResponse();
    }
}
