package au.com.iglooit.silverwater.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage(Locale locale) {
        ModelAndView modelAndView = new ModelAndView("home");
        LOG.info("Welcome home! The client locale is {}.", locale);
        return modelAndView;
    }

    @RequestMapping(value = "/about-us", method = RequestMethod.GET)
    public ModelAndView aboutUsPage() {
        ModelAndView modelAndView = new ModelAndView("about-us");
        return modelAndView;
    }

    @RequestMapping(value = "/contact-us", method = RequestMethod.GET)
    public ModelAndView contactUsPage() {
        ModelAndView modelAndView = new ModelAndView("contact-us");
        return modelAndView;
    }

    @RequestMapping(value = "/how-it-works", method = RequestMethod.GET)
    public ModelAndView howItWorksPage() {
        ModelAndView modelAndView = new ModelAndView("how-it-works");
        return modelAndView;
    }
}
