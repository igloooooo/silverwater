package au.com.iglooit.silverwater.controller;

import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import au.com.iglooit.silverwater.service.search.BrokerFTSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class SearchController {
    private static final Logger LOG = LoggerFactory.getLogger(SearchController.class);
    @Resource
    private BrokerFTSearch brokerFTSearch;

    /**
     * broker list page
     *
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET, params = "q")
    public ModelAndView quickSearch(@RequestParam("q") String key) {
        ModelAndView modelAndView = new ModelAndView("broker/brokerSearch");
        modelAndView.addObject("brokerList", brokerFTSearch.searchByKeyWord(key, 0, 20));
        return modelAndView;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, params = {"q", "suburb"})
    public ModelAndView fullSearch(@RequestParam("q") String key, @RequestParam("suburb") String suburb) {
        ModelAndView modelAndView = new ModelAndView("broker/brokerSearch");
        modelAndView.addObject("brokerList", brokerFTSearch.searchByKeyWord(key, suburb, 0, 20));
        return modelAndView;
    }
}
