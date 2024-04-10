package com.example.jinan;

import com.JN.dto.ScenicSpotDTO;
import com.JN.dto.TravelDTO;
import com.JN.entity.TravelEntity;
import com.JN.mapper.PointMapper;
import com.JN.mapper.ScenicSpotMapper;
import com.JN.service.impl.ScenicSpotServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@MapperScan(basePackages = "com.JN.mapper")
class IUserInfoMapperTest {

    @Autowired
    private ScenicSpotMapper scenicSpotMapper;

    @Test
    public void testSelectUser(){

    }
}

