package com.ram.controller;

import com.ram.controller.service.MyService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by morer on 12/09/16.
 */
@RestController
@RequestMapping("/rest/v1")
public class MyController {

    @Resource
    private MyService service;

    @RequestMapping(method = RequestMethod.GET,value = "/print/{msg}")
    public String printMessage(@PathVariable("msg") String msg){
        return service.getMessage(msg);
    }
}
