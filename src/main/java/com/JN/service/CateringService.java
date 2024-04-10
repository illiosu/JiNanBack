package com.JN.service;

import com.JN.dto.FoodDTO;

import java.util.List;

public interface CateringService {
    List<FoodDTO> getCatering(int page, int limit);

}
