package com.JN.mapper;

import com.JN.dto.FoodDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface CateringMapper {
    @Select("SELECT * FROM food ORDER BY gid ASC LIMIT #{limit} OFFSET #{pageSize}")
    List<FoodDTO> getCatering(@Param("pageSize") int pageSize, @Param("limit") int limit);
    @Select("SELECT count(*) FROM food")
    Integer getCateringCount();
}
