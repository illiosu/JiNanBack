package com.JN.mapper;

import com.JN.dto.ScenicSpotDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScenicSpotMapper {
    List<ScenicSpotDTO> getScenicSpotList(@Param("pageSize") int pageSize, @Param("limit") int limit);

    @Select("select count(*) from travel")
    Integer ScenicSpotListCount();

    void addScenicSpot(@Param("name") String name, @Param("address") String address, @Param("adname") String adname, @Param("x") Double x, @Param("y") Double y, @Param("type") String type, @Param("introduction") String introduction);

    void updateScenicSpot(@Param("id") Integer id, @Param("name") String name, @Param("address") String address, @Param("adname") String adname, @Param("x") Double x, @Param("y") Double y, @Param("type") String type, @Param("introduction") String introduction);

    @Delete("DELETE FROM travel\n" +
            "    WHERE gid = #{id};")
    void deleteScenicSpot(@Param("id") Integer id);
}
