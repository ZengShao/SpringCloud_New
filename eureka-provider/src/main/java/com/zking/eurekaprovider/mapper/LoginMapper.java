package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Login;

public interface LoginMapper {
    int insert(Login record);

    int insertSelective(Login record);
}