package com.sharding.mapper;

import com.sharding.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface User1Mapper {

    List<UserEntity> getAll();

    void insert (UserEntity user);

    UserEntity getById(Long id);
}
