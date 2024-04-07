package com.JN.controller;

import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;
import com.JN.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointController {
    @Autowired
    private PointService pointService;
    @RequestMapping(value = "/getTravelPoints", method = RequestMethod.GET)
    public List<TravelEntity> getTravelPoints() {
        return pointService.getTravelPoints();
    }

    @RequestMapping(value = "/getFoodPoints", method = RequestMethod.GET)
    public List<FoodEntity> getFoodPoints() {
        return pointService.getFoodPoints();
    }

    @RequestMapping(value = "/getJitaoTongPoints", method = RequestMethod.GET)
    public List<JiaoTongEntity> getJitaoTongPoints() {
        return pointService.getJiaoTongPoints();
    }


}
