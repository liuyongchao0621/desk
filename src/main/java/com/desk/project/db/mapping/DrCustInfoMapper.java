package com.desk.project.db.mapping;

import com.desk.project.db.pojo.DrCustInfo;

public interface DrCustInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrCustInfo record);

    int insertSelective(DrCustInfo record);

    DrCustInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrCustInfo record);

    int updateByPrimaryKey(DrCustInfo record);
}