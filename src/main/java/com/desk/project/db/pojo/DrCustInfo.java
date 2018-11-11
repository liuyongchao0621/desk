package com.desk.project.db.pojo;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class DrCustInfo implements java.io.Serializable {

    private static final long serialVersionUID = -8559383869108813563L;
    private Long id;

    private String bizType;

    private String infoOpType;

    private String idType;

    private String idNo;

    private String cifName;

    private String sex;

    private String birthDay;

    private String marrige;

    private String edu;

    private String degree;

    private String resideTel;

    private String cell;

    private String corpTel;

    private String email;

    private String commAddr;

    private String commPostCode;

    private String censAddr;

    private String indivSpsName;

    private String indivSpsIdTyp;

    private String indivSpsIdCode;

    private String indivScomName;

    private String indivSpsPhn;

    private String occDate;

    private String infoTypeC;

    private String infoTypeD;

    private String workType;

    private String corpName;

    private String corpTradeName;

    private String corpAddr;

    private String corpPostCode;

    private String workBegDate;

    private String duty;

    private String workTitle;

    private BigDecimal income;

    private String wageAcNo;

    private String wageBrNo;

    private String resideAddr;

    private String residePostCode;

    private String resideSts;

    private String cifArea;

    private Date createTime;

    private Date updateTime;

    private String reportDate;

}