package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}