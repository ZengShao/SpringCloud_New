package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Register;

public interface RegisterMapper {
    int insert(Register record);

    int insertSelective(Register record);
}