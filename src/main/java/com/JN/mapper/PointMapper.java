package com.JN.mapper;

import com.JN.entity.FoodEntity;
import com.JN.entity.JiaoTongEntity;
import com.JN.entity.TravelEntity;
import com.JN.entity.pointEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PointMapper {
    @Select("select * from travel")
    List<pointEntity> getPoints();

    @Select("select * from travel")
    List<TravelEntity> getTravelPointsM();

    @Select("select * from food")
    List<FoodEntity> getFoodPointsM();

    @Select("select * from jiaotong")
    List<JiaoTongEntity> getJiaoTongPointsM();
}
