package com.JN.mapper;

import com.JN.dto.JiaoTongDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TransportationMapper {
    @Select("SELECT * FROM jiaotong ORDER BY gid ASC LIMIT #{limit} OFFSET #{pageSize}")
    List<JiaoTongDTO> getTransportation(@Param("pageSize") int pageSize, @Param("limit") int limit);
}
