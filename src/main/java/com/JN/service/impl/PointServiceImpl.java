package com.JN.service.impl;

import com.JN.dto.TravelDTO;
import com.JN.entity.JiaoTongEntity;
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
    public List<TravelDTO> getTravelPointsList(int page, int limit) {
        int pageSize = (page - 1)*limit;
        return pointMapper.getTravelPointsMList(pageSize, limit);
    }

    @Override
    public List<Object> getFoodPoints() {
        return pointMapper.getFoodPointsM();

    }

    @Override
    public List<JiaoTongEntity> getJiaoTongPoints() {
        return pointMapper.getJiaoTongPointsM();
    }

    @Override
    public Integer getTravelPointsCount() {

        return pointMapper.getTravelPointsCount();
    }


}
