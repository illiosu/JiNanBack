package com.JN.service.impl;

import com.JN.dto.ScenicSpotDTO;
import com.JN.mapper.ScenicSpotMapper;
import com.JN.service.ScenicSpotService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {
    @Autowired
    ScenicSpotMapper scenicSpotManager;

    @Override
    public List<ScenicSpotDTO> ScenicSpotList(int page, int limit) {
        int pageSize = (page - 1) * limit;
        return scenicSpotManager.getScenicSpotList(pageSize, limit);
    }

    @Override
    public Integer ScenicSpotListCount() {
        return scenicSpotManager.ScenicSpotListCount();
    }

    @Override
    public void addScenicSpot(String name, String address, String adname, Double x, Double y, String type, String introduction) {
        scenicSpotManager.addScenicSpot(name, address, adname, x, y, type, introduction);
    }

    @Override
    public void updateScenicSpot(Integer id, String name, String address, String adname, Double x, Double y, String type, String introduction) {
        scenicSpotManager.updateScenicSpot(id, name, address, adname, x, y, type, introduction);
    }

    @Override
    public void deleteScenicSpot(Integer id) {
        scenicSpotManager.deleteScenicSpot(id);
    }



}
