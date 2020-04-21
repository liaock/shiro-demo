package com.example.shirodemo.infrastructure.repository;

import com.example.shirodemo.domain.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}