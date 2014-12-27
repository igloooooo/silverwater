package au.com.iglooit.silverwater.service.webservice;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.model.vo.EnquireVO;
import au.com.iglooit.silverwater.model.vo.JsonResponse;
import au.com.iglooit.silverwater.service.dao.EnquireDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        enquireDAO.createEnquire(enquire);
        return new JsonResponse();
    }
}
