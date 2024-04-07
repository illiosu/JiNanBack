package com.JN.service.impl;

import com.JN.entity.pointEntity;
import com.JN.mapper.PointMapper;
import com.JN.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private PointMapper pointMapper;
    @Override
    public List<pointEntity> getPoints() {
        List<pointEntity> points = pointMapper.getPoints();
        return points;
    }
}
