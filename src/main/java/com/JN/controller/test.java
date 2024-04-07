package com.JN.controller;

import com.JN.entity.pointEntity;
import com.JN.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<pointEntity> test() {
        List<pointEntity> p = testService.getPoints();
        return p;
    }
}
