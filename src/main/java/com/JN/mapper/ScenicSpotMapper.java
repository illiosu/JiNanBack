package com.JN.mapper;

import com.JN.dto.ScenicSpotDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ScenicSpotMapper {
    List<ScenicSpotDTO> getScenicSpotList(@Param("pageSize") int pageSize, @Param("limit") int limit);

    @Select("select count(*) from travel")
    Integer ScenicSpotListCount();
}
