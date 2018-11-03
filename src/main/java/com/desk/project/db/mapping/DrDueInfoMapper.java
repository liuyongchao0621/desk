package com.desk.project.db.mapping;

import com.desk.project.db.pojo.DrDueInfo;

public interface DrDueInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrDueInfo record);

    int insertSelective(DrDueInfo record);

    DrDueInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrDueInfo record);

    int updateByPrimaryKey(DrDueInfo record);
}