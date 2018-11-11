package com.desk.project.db.pojo;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;


@Data
@ToString
public class DrContractInfo implements java.io.Serializable{

    private static final long serialVersionUID = -7264078257180394727L;
    private Long id;

    private String bizType;

    private String bizYear;

    private String bizMonth;

    private String cifName;

    private String infoOpType;

    private String idType;

    private String idNo;

    private String pactNo;

    private String occDate;

    private String infoType;

    private String curNo;

    private String authId;

    private String begDate;

    private String endDate;

    private String ifYt;

    private String vouType;

    private String pactSts;

    private String signDate;

    private String lnTradeNo;

    private BigDecimal pactAmt;

    private BigDecimal bal;

    private String loanKind;

    private String termMon;

    private BigDecimal lnRate;

    private String lnType;

    private Date createTime;

    private Date updateTime;

    private String reportDate;

    }