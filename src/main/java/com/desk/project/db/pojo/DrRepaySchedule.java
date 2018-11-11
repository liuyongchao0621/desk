package com.desk.project.db.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@Data
@ToString
public class DrRepaySchedule implements java.io.Serializable{


    private static final long serialVersionUID = 6565427970907972712L;
    private Long id;

    private String bizId;

    private String bizType;

    private String infoOpType;

    private String bizYearmonth;

    private String dueNo;

    private String acNo;

    private BigDecimal ttlAmt;

    private Long ttlCnt;

    private BigDecimal currAmt;

    private BigDecimal currIntst;

    private Long currCnt;

    private String wrkDate;

    private String begDate;

    private String endDate;

    private String payInd;

    private String tel;

    private String perUpdCode;

    private String updOpNo;

    private String updDate;

    private String occDate;

    private Date createTime;

    private Date updateTime;

    private String reportDate;


}