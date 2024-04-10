package com.JN.service.impl;

import com.JN.dto.FoodDTO;
import com.JN.mapper.CateringMapper;
import com.JN.service.CateringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CateringServiceImpl implements CateringService {
@Autowired CateringMapper cateringMapper;
    @Override
    public List<FoodDTO> getCatering(int page, int limit) {
        int pageSize = (page - 1) * limit;
        return cateringMapper.getCatering(pageSize, limit);
    }
}
