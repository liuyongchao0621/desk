package com.desk.project.db.mapper;

import com.desk.project.db.pojo.Pet;

public interface PetMapper {
    int insert(Pet record);

    int insertSelective(Pet record);
}