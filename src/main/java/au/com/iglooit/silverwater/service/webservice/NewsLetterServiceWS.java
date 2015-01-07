package au.com.iglooit.silverwater.service.webservice;

import au.com.iglooit.silverwater.model.vo.JsonResponse;
import au.com.iglooit.silverwater.model.vo.NewsLetterClientVO;
import au.com.iglooit.silverwater.service.dao.NewsLetterClientDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
@Controller
public class NewsLetterServiceWS {
    @Resource
    private NewsLetterClientDAO newsLetterClientDAO;

    @RequestMapping(value = "/ws/newsletter", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResponse addNewsLetterClient(@RequestBody NewsLetterClientVO vo) {
        newsLetterClientDAO.createNewsLetter(vo.toNewsLetterClient());
        return new JsonResponse();
    }
}
