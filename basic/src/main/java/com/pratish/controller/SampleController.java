package com.pratish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {
        LOGGER.debug("-------------------------------------");
        LOGGER.debug("---------User page requested---------");
        LOGGER.debug("-------------------------------------");
        return "user";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        LOGGER.debug("-------------------------------------");
        LOGGER.debug("---------Admin page requested--------");
        LOGGER.debug("-------------------------------------");
        return "admin";
    }

    @RequestMapping(value = "/dba", method = RequestMethod.GET)
    public String dba() {
        LOGGER.debug("-------------------------------------");
        LOGGER.debug("----------DBA page requested---------");
        LOGGER.debug("-------------------------------------");
        return "dba";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String accessDenied() {
        LOGGER.debug("-------------------------------------");
        LOGGER.debug("------------Access denied------------");
        LOGGER.debug("-------------------------------------");
        return "accessDenied";
    }

}
