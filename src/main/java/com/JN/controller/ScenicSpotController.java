package com.JN.controller;

import com.JN.common.Result;
import com.JN.dto.ScenicSpot;
import com.JN.service.ScenicSpotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scenicSpot")
public class ScenicSpotController {
    @Autowired
    ScenicSpotService scenicSpotService;
    @GetMapping("/getScenicSpot")
    public Result getScenicSpot(@RequestParam(value = "page", defaultValue = "1") int page,
                                  @RequestParam(value = "limit", defaultValue = "3") int limit)
    {
        return Result.ok(scenicSpotService.ScenicSpotList(page, limit));
    }
    @GetMapping("/getScenicSpotCount")
    public Result getScenicSpotCount()
    {
        return Result.ok(scenicSpotService.ScenicSpotListCount());
    }
//    @PostMapping("/addScenicSpot")
//    public void addScenicSpot(@RequestParam(value = "name", defaultValue = "1") String name,
//                                @RequestParam(value = "address", defaultValue = "3") String address,
//                                @RequestParam(value = "adname", defaultValue = "1") String adname,
//                                @RequestParam(value = "x", defaultValue = "3") Double x,
//                                @RequestParam(value = "y", defaultValue = "1") Double y,
//                                @RequestParam(value = "type", defaultValue = "3") String type,
//                                @RequestParam(value = "introduction", defaultValue = "3") String introduction)
//    {
//        scenicSpotService.addScenicSpot(name,address,adname,x,y,type,introduction);
//    }

    @PostMapping("/addScenicSpot")
    public void addScenicSpot(@RequestBody ScenicSpot scenicSpot) {
        scenicSpotService.addScenicSpot(scenicSpot.getName(), scenicSpot.getAddress(),
                scenicSpot.getAdname(), scenicSpot.getX(), scenicSpot.getY(),
                scenicSpot.getType(), scenicSpot.getIntroduction());
    }
    @PostMapping("/addScenicSpot/{id}")
    public void updateScenicSpot(@PathVariable(value = "id") Integer id, @RequestBody ScenicSpot scenicSpot) {
        System.out.println(id);
        // 在这里调用你的Service方法来更新ScenicSpot
        scenicSpotService.updateScenicSpot(id, scenicSpot.getName(), scenicSpot.getAddress(), scenicSpot.getAdname(),
                scenicSpot.getX(), scenicSpot.getY(), scenicSpot.getType(), scenicSpot.getIntroduction());
    }
    @PostMapping("/deleteScenicSpot/{id}")
    public void deleteScenicSpot(@PathVariable(value = "id") Integer id) {
        // 在这里调用你的Service方法来删除ScenicSpot
        scenicSpotService.deleteScenicSpot(id);
    }
}
