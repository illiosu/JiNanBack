package com.JN.controller;

import com.JN.common.Result;
import com.JN.dto.FoodDTO;
import com.JN.dto.TravelDTO;
import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;
import com.JN.entity.UserEntity;
import com.JN.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PointController {
    @Autowired
    private PointService pointService;

    @GetMapping("/getTravelPoints")
    public Result getTravelPoints(@RequestParam(value = "page", defaultValue = "1") int page,
                                  @RequestParam(value = "limit", defaultValue = "3") int limit)
    {
        return Result.ok(pointService.getTravelPointsList(page,limit)) ;
    }

    @GetMapping("/getTravelPointsCounts")
    public Result getTravelPointsCounts()
    {
        return Result.ok(pointService.getTravelPointsCount());
    }

//    @RequestMapping(value = "/getFoodPoints", method = RequestMethod.GET)
//    public List<FoodEntity> getFoodPoints() {
//        return pointService.getFoodPoints();
//    }

    @RequestMapping(value = "/getFoodPoints", method = RequestMethod.GET)
    public List<Object> getFoodPoints() {
        return pointService.getFoodPoints();
    }


    @RequestMapping(value = "/getJitaoTongPoints", method = RequestMethod.GET)
    public List<JiaoTongEntity> getJitaoTongPoints() {
        return pointService.getJiaoTongPoints();
    }


}
