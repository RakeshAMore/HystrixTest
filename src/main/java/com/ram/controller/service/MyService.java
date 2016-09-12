package com.ram.controller.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by morer on 12/09/16.
 */
@Service
public class MyService {

    @HystrixCommand
    public String getMessage(String msg){
        return msg;
    }
}
