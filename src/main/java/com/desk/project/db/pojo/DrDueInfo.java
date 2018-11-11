package com.desk.project.db.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@Data
@ToString
public class DrDueInfo implements java.io.Serializable{


    private static final long serialVersionUID = -992766018344367737L;
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

    private String dueNo;

    private String curNo;

    private BigDecimal dueAmt;

    private BigDecimal bal;

    private String begDate;

    private String endDate;

    private String occurType;

    private String loanType;

    private String lnTradeNo;

    private String loanKind;

    private String expFlag;

    private String fourSts;

    private String fiveSts;

    private String baseRate;

    private BigDecimal lnRate;

    private BigDecimal overRate;

    private BigDecimal fineRate;

    private BigDecimal cmpdRate;

    private BigDecimal expRate;

    private BigDecimal innerIntst;

    private BigDecimal outerIntst;

    private String returnCount;

    private BigDecimal accFee;

    private BigDecimal accTolFee;

    private String lnType;

    private String repayType;

    private String graceDay;

    private String verificaFlag;

    private String loanStatus;

    private Date createTime;

    private Date updateTime;

    private Integer loanTerm;

    private String reportDate;

   }