package com.JN.service;

import com.JN.dto.ScenicSpotDTO;


import java.util.List;

public interface ScenicSpotService {
    List<ScenicSpotDTO> ScenicSpotList(int page, int limit);
    Integer ScenicSpotListCount();
}
