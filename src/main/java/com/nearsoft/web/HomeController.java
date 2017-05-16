package com.nearsoft.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    private static Logger LOG = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        LOG.debug("DEBUG level");
        LOG.info("INFO to index");
        LOG.warn("WARN level");
        LOG.error("ERROR level");
        return new ModelAndView("index");
    }
}
