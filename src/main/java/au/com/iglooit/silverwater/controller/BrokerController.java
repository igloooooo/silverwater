package au.com.iglooit.silverwater.controller;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class BrokerController {
    private static final Logger LOG = LoggerFactory.getLogger(BrokerController.class);
    @Resource
    private BrokerDAO brokerDAO;

    /**
     * broker list page
     *
     * @return
     */
    @RequestMapping(value = "/broker", method = RequestMethod.GET)
    public ModelAndView brokerList() {
        ModelAndView modelAndView = new ModelAndView("broker/brokerAll");
        modelAndView.addObject("brokerList", brokerDAO.findAllBrokers());
        return modelAndView;
    }

    @RequestMapping(value = "/broker/{canonicalSlugId}", method = RequestMethod.GET)
    public ModelAndView brokerList(String canonicalSlugId) {
        ModelAndView modelAndView = new ModelAndView("broker/brokerDetails");
        Broker broker = brokerDAO.findByCanonicalSlugId(canonicalSlugId);
        modelAndView.addObject("broker", broker);
        return modelAndView;
    }
}
