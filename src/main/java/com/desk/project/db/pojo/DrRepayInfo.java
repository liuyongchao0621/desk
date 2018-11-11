package com.desk.project.db.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@Data
@ToString
public class DrRepayInfo implements java.io.Serializable{

    private static final long serialVersionUID = 2509834148270350199L;
    private Long id;

    private String bizNo;

    private String bizType;

    private String bizYear;

    private String bizMonth;

    private String infoOpType;

    private String cifName;

    private String idType;

    private String idNo;

    private String pactNo;

    private String occDate;

    private String infoType;

    private String dueNo;

    private String returnDate;

    private String counts;

    private String returnType;

    private BigDecimal returnAmt;

    private BigDecimal returnCapital;

    private BigDecimal returnInterest;

    private BigDecimal returnOther;

    private String isOverpay;

    private Date createTime;

    private Date updateTime;

    private String reportDate;


}