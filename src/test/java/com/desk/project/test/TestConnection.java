package com.desk.project.test;

import com.alibaba.fastjson.JSONObject;
import com.desk.project.db.mapper.DrCustInfoMapper;
import com.desk.project.db.pojo.DrCustInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config/application-context.xml"})
@Slf4j
public class TestConnection {

    @Autowired
    DrCustInfoMapper drCustInfoMapper;


    @Test
    public void test(){

        int id = 657720;

        DrCustInfo drCustInfo = drCustInfoMapper.selectByPrimaryKey(Long.valueOf(id));

        log.info("返回参数：" + JSONObject.toJSONString(drCustInfo));
    }
}
