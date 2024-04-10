package com.JN.controller;

import com.JN.common.Result;
import com.JN.service.CateringService;
import com.JN.service.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/Transportation")
public class TransportationController {
    @Autowired
    TransportationService transportationService;
    @GetMapping("/getTransportation")
    public Result getTransportation(@RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "limit", defaultValue = "3") int limit)
    {
        return Result.ok(transportationService.getTransportation(page, limit));
    }
}
