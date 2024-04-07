package com.JN.mapper;

import com.JN.entity.pointEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PointMapper {
    @Select("select * from travel")
    List<pointEntity> getPoints();
}
