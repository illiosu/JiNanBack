package com.JN.service;

import com.JN.dto.FoodDTO;
import com.JN.dto.TravelDTO;
import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;
import com.JN.entity.UserEntity;

import java.util.List;

public interface PointService {
    List<TravelDTO> getTravelPointsList(int page, int limit);
    List<Object> getFoodPoints();
    List<JiaoTongEntity> getJiaoTongPoints();
    Integer getTravelPointsCount();
}
