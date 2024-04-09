package com.JN.service;

import com.JN.dto.ScenicSpotDTO;


import java.util.List;

public interface ScenicSpotService {
    List<ScenicSpotDTO> ScenicSpotList(int page, int limit);
    Integer ScenicSpotListCount();

    void addScenicSpot(String name,String address,String adname, Double x, Double y, String type, String introduction);
    void updateScenicSpot(Integer id,String name,String address,String adname, Double x, Double y, String type, String introduction);

    void deleteScenicSpot(Integer id);
}
