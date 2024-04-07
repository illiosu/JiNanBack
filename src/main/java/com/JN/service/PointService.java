package com.JN.service;

import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;

import java.util.List;

public interface PointService {
    List<TravelEntity> getTravelPoints();
    List<FoodEntity> getFoodPoints();
    List<JiaoTongEntity> getJiaoTongPoints();
}
