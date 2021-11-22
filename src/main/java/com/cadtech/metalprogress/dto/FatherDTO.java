package com.cadtech.metalprogress.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Data
public class FatherDTO {

    private Double o_qty;
    private String o_prodno;
    private Short o_status;
    private String o_custbillcode;
    private Date o_targetdate;
    private String o_code;
    private Date o_date;
    private Double o_billqty;
    private boolean mp_over;
    private BigDecimal o_makeOrderQty;
    private String c_sname;
    private String p_name;
    private String b_process;
}
