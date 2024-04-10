package com.JN.service;

import com.JN.dto.JiaoTongDTO;

import java.util.List;

public interface TransportationService {
    List<JiaoTongDTO> getTransportation(int page, int limit);

    Integer TransportationCount();
}
