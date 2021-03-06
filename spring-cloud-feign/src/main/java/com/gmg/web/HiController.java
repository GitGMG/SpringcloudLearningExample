package com.gmg.web;

import com.gmg.service.ConsumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
public class HiController {
    private final Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    ConsumeService consumeService;
    @RequestMapping(value = "/consumer",method = RequestMethod.GET)
    public String consumer(){
        logger.info("service-feign invoke service-server");
        return consumeService.sayHi();
    }

    @RequestMapping(value = "/noToken",method = RequestMethod.GET)
    public String noToken(){
        return  "我没有noToken";
    }
}
