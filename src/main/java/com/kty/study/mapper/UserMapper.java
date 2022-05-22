package com.kty.study.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    String selectUser();
}
