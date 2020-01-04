package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Tcomment;

public interface TcommentMapper {
    int insert(Tcomment record);

    int insertSelective(Tcomment record);
}