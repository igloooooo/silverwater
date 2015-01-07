package au.com.iglooit.silverwater.controller;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import au.com.iglooit.silverwater.service.search.BrokerAllService;
import au.com.iglooit.silverwater.service.search.SuggestBrokerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class BrokerController {
    private static final Logger LOG = LoggerFactory.getLogger(BrokerController.class);
    @Resource
    private BrokerDAO brokerDAO;
    @Resource
    private BrokerAllService brokerAllService;
    @Resource
    private SuggestBrokerService suggestBrokerService;

    /**
     * broker list page
     *
     * @return
     */
    @RequestMapping(value = "/broker", method = RequestMethod.GET)
    public ModelAndView brokerList() {
        ModelAndView modelAndView = new ModelAndView("broker/brokerAll");
        modelAndView.addObject("brokerList", brokerAllService.loadBrokers());
        return modelAndView;
    }

    @RequestMapping(value = "/broker/{canonicalSlugId}", method = RequestMethod.GET)
    public ModelAndView brokerList(@PathVariable String canonicalSlugId) {
        ModelAndView modelAndView = new ModelAndView("broker/brokerDetails");
        Broker broker = brokerDAO.findByCanonicalSlugId(canonicalSlugId);
        modelAndView.addObject("broker", broker);
        modelAndView.addObject("similarBrokers", suggestBrokerService.similarBrokers(broker));
        return modelAndView;
    }
}
