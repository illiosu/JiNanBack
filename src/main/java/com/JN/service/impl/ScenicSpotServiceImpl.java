package com.JN.service.impl;

import com.JN.dto.ScenicSpotDTO;
import com.JN.mapper.ScenicSpotMapper;
import com.JN.service.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {
    @Autowired
    ScenicSpotMapper scenicSpotManager;
    @Override
    public List<ScenicSpotDTO> ScenicSpotList(int page, int limit) {
        int pageSize = (page - 1)*limit;
        return scenicSpotManager.getScenicSpotList(pageSize, limit);
    }

    @Override
    public Integer ScenicSpotListCount() {
        return scenicSpotManager.ScenicSpotListCount();
    }


}
