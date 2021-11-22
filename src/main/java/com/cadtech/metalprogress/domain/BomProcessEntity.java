package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "BOM_Process")
@IdClass(BomProcessEntityPK.class)
public class BomProcessEntity {
    private int bpId;
    private int bpItemid;
    private int bpNo;
    private String bpProcess;
    private String bpDepartment;
    private String bpMethod;
    private String bpSeq;
    private BigDecimal bpCost;
    private BigDecimal bpStandardtime;
    private BigDecimal bpMm;
    private String bpMemo;
    private Double bpThroughput;
    private BigDecimal bpPreworktime;
    private Integer bpStrokes;
    private BigDecimal bpWorktime;
    private String bpPicfilename;
    private Double bpThroughputDd;

    @Id
    @Column(name = "bp_id", nullable = false)
    public int getBpId() {
        return bpId;
    }

    public void setBpId(int bpId) {
        this.bpId = bpId;
    }

    @Id
    @Column(name = "bp_itemid", nullable = false)
    public int getBpItemid() {
        return bpItemid;
    }

    public void setBpItemid(int bpItemid) {
        this.bpItemid = bpItemid;
    }

    @Basic
    @Column(name = "bp_no", nullable = false)
    public int getBpNo() {
        return bpNo;
    }

    public void setBpNo(int bpNo) {
        this.bpNo = bpNo;
    }

    @Basic
    @Column(name = "bp_process", nullable = true, length = 20)
    public String getBpProcess() {
        return bpProcess;
    }

    public void setBpProcess(String bpProcess) {
        this.bpProcess = bpProcess;
    }

    @Basic
    @Column(name = "bp_department", nullable = true, length = 20)
    public String getBpDepartment() {
        return bpDepartment;
    }

    public void setBpDepartment(String bpDepartment) {
        this.bpDepartment = bpDepartment;
    }

    @Basic
    @Column(name = "bp_method", nullable = true, length = 10)
    public String getBpMethod() {
        return bpMethod;
    }

    public void setBpMethod(String bpMethod) {
        this.bpMethod = bpMethod;
    }

    @Basic
    @Column(name = "bp_seq", nullable = true, length = 50)
    public String getBpSeq() {
        return bpSeq;
    }

    public void setBpSeq(String bpSeq) {
        this.bpSeq = bpSeq;
    }

    @Basic
    @Column(name = "bp_cost", nullable = false, precision = 4)
    public BigDecimal getBpCost() {
        return bpCost;
    }

    public void setBpCost(BigDecimal bpCost) {
        this.bpCost = bpCost;
    }

    @Basic
    @Column(name = "bp_standardtime", nullable = false, precision = 4)
    public BigDecimal getBpStandardtime() {
        return bpStandardtime;
    }

    public void setBpStandardtime(BigDecimal bpStandardtime) {
        this.bpStandardtime = bpStandardtime;
    }

    @Basic
    @Column(name = "bp_mm", nullable = false, precision = 4)
    public BigDecimal getBpMm() {
        return bpMm;
    }

    public void setBpMm(BigDecimal bpMm) {
        this.bpMm = bpMm;
    }

    @Basic
    @Column(name = "bp_memo", nullable = true, length = 200)
    public String getBpMemo() {
        return bpMemo;
    }

    public void setBpMemo(String bpMemo) {
        this.bpMemo = bpMemo;
    }

    @Basic
    @Column(name = "bp_throughput", nullable = true, precision = 0)
    public Double getBpThroughput() {
        return bpThroughput;
    }

    public void setBpThroughput(Double bpThroughput) {
        this.bpThroughput = bpThroughput;
    }

    @Basic
    @Column(name = "bp_preworktime", nullable = true, precision = 4)
    public BigDecimal getBpPreworktime() {
        return bpPreworktime;
    }

    public void setBpPreworktime(BigDecimal bpPreworktime) {
        this.bpPreworktime = bpPreworktime;
    }

    @Basic
    @Column(name = "bp_strokes", nullable = true)
    public Integer getBpStrokes() {
        return bpStrokes;
    }

    public void setBpStrokes(Integer bpStrokes) {
        this.bpStrokes = bpStrokes;
    }

    @Basic
    @Column(name = "bp_worktime", nullable = true, precision = 4)
    public BigDecimal getBpWorktime() {
        return bpWorktime;
    }

    public void setBpWorktime(BigDecimal bpWorktime) {
        this.bpWorktime = bpWorktime;
    }

    @Basic
    @Column(name = "bp_picfilename", nullable = true, length = 400)
    public String getBpPicfilename() {
        return bpPicfilename;
    }

    public void setBpPicfilename(String bpPicfilename) {
        this.bpPicfilename = bpPicfilename;
    }

    @Basic
    @Column(name = "bp_throughput_DD", nullable = true, precision = 0)
    public Double getBpThroughputDd() {
        return bpThroughputDd;
    }

    public void setBpThroughputDd(Double bpThroughputDd) {
        this.bpThroughputDd = bpThroughputDd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomProcessEntity that = (BomProcessEntity) o;
        return bpId == that.bpId && bpItemid == that.bpItemid && bpNo == that.bpNo && Objects.equals(bpProcess, that.bpProcess) && Objects.equals(bpDepartment, that.bpDepartment) && Objects.equals(bpMethod, that.bpMethod) && Objects.equals(bpSeq, that.bpSeq) && Objects.equals(bpCost, that.bpCost) && Objects.equals(bpStandardtime, that.bpStandardtime) && Objects.equals(bpMm, that.bpMm) && Objects.equals(bpMemo, that.bpMemo) && Objects.equals(bpThroughput, that.bpThroughput) && Objects.equals(bpPreworktime, that.bpPreworktime) && Objects.equals(bpStrokes, that.bpStrokes) && Objects.equals(bpWorktime, that.bpWorktime) && Objects.equals(bpPicfilename, that.bpPicfilename) && Objects.equals(bpThroughputDd, that.bpThroughputDd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bpId, bpItemid, bpNo, bpProcess, bpDepartment, bpMethod, bpSeq, bpCost, bpStandardtime, bpMm, bpMemo, bpThroughput, bpPreworktime, bpStrokes, bpWorktime, bpPicfilename, bpThroughputDd);
    }
}
