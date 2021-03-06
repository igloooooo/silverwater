package au.com.iglooit.silverwater.service.webservice;

import au.com.iglooit.silverwater.model.vo.SuburbResponse;
import au.com.iglooit.silverwater.service.dao.SuburbDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 25/09/2014
 * Time: 1:28 PM
 */
@Controller
public class GeoServiceWS {
    @Resource
    private SuburbDAO suburbDAO;

    @RequestMapping(value = "/ws/geo/suburb",
            method = RequestMethod.GET)
    public
    @ResponseBody
    SuburbResponse addMerchant(@RequestParam("q") String keyword) {
        SuburbResponse response = new SuburbResponse();
        response.setSuburbVOList(suburbDAO.findByKeyword(keyword));
        return response;
    }
}
