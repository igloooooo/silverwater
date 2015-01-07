package au.com.iglooit.silverwater.controller;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.service.dao.EnquireDAO;
import com.google.appengine.api.datastore.KeyFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
@Controller
public class EnquireController {
    @Resource
    private EnquireDAO enquireDAO;

    @RequestMapping(value = "/enquire/{keyString}", method = RequestMethod.GET)
    public ModelAndView enquireDetails(@PathVariable String keyString) {
        ModelAndView modelAndView = new ModelAndView("enquire/enquire-details");
        Enquire enquire = enquireDAO.findByKey(KeyFactory.stringToKey(keyString));
        modelAndView.addObject("enquire", enquire);
        return modelAndView;
    }

}
