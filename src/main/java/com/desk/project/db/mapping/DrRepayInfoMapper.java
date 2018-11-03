package com.desk.project.db.mapping;

import com.desk.project.db.pojo.DrRepayInfo;

public interface DrRepayInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrRepayInfo record);

    int insertSelective(DrRepayInfo record);

    DrRepayInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrRepayInfo record);

    int updateByPrimaryKey(DrRepayInfo record);
}