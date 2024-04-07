package com.JN.service.impl;

import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;
import com.JN.mapper.PointMapper;
import com.JN.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PointServiceImpl implements PointService {
    @Autowired
    private PointMapper pointMapper;
    @Override
    public List<TravelEntity> getTravelPoints() {
        return pointMapper.getTravelPointsM();
    }

    @Override
    public List<FoodEntity> getFoodPoints() {
        return pointMapper.getFoodPointsM();

    }

    @Override
    public List<JiaoTongEntity> getJiaoTongPoints() {
        return pointMapper.getJiaoTongPointsM();
    }
}
