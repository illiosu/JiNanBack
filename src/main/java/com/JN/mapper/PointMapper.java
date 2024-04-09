package com.JN.mapper;

import com.JN.dto.FoodDTO;
import com.JN.dto.TravelDTO;
import com.JN.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PointMapper {
    @Select("select * from travel")
    List<pointEntity> getPoints();


    List<TravelDTO> getTravelPointsMList(@Param("page") int page, @Param("limit") int limit);
    @Select("select count(*) from travel")
    Integer getTravelPointsCount();
    @Select("SELECT json_build_object(\n" +
            "    'type', 'FeatureCollection',\n" +
            "    'features', json_agg(\n" +
            "        json_build_object(\n" +
            "            'type', 'Feature',\n" +
            "            'geometry', ST_AsGeoJSON(ST_Transform(t.geom,4490))::json,\n" +
            "            'properties', row_to_json(t)\n" +
            "        )\n" +
            "    )\n" +
            ")\n" +
            "FROM public.food t;")
    List<Object> getFoodPointsM();

    @Select("select * from jiaotong")
    List<JiaoTongEntity> getJiaoTongPointsM();


}
