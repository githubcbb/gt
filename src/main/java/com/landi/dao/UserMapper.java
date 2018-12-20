package com.landi.dao;

import com.landi.entity.User;
import com.landi.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}