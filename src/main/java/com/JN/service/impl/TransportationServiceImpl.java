package com.JN.service.impl;

import com.JN.dto.JiaoTongDTO;
import com.JN.mapper.TransportationMapper;
import com.JN.service.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransportationServiceImpl implements TransportationService {
    @Autowired
    TransportationMapper transportationMapper;
    @Override
    public List<JiaoTongDTO> getTransportation(int page, int limit) {
        int pageSize = (page - 1) * limit;
        return transportationMapper.getTransportation(pageSize, limit);
    }
}
