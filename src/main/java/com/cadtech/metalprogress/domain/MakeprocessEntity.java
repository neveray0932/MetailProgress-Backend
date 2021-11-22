package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "makeprocess")
public class MakeprocessEntity {
    private String mpNo;
    private String mpName;
    private String mpMemo;
    private Integer mpDepart;
    private Short mpSort;
    private String mpMethod;
    private Boolean mpIsPrintLabel;
    private Boolean mpDesigndemand;
    private BigDecimal mpGprofit;
    private BigDecimal mpLowprofit;
    private String mpOrderno;
    private String mpOrdername;
    private Short mpOrdersort;
    private boolean mpOrderdefault;
    private Integer mpDepartidAcc;
    private Boolean mpIsStatMm;
    private Double mpWorkhoursDays;
    private Double mpThroughput;
    private BigDecimal mpPreworktime;
    private BigDecimal mpWorktime;
    private Integer mpStrokes;
    private Boolean mpIsshowerrmsg;
    private BigDecimal mpFinashdays;

    @Id
    @Column(name = "mp_no", nullable = false, length = 10)
    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    @Basic
    @Column(name = "mp_name", nullable = false, length = 20)
    public String getMpName() {
        return mpName;
    }

    public void setMpName(String mpName) {
        this.mpName = mpName;
    }

    @Basic
    @Column(name = "mp_memo", nullable = true, length = 60)
    public String getMpMemo() {
        return mpMemo;
    }

    public void setMpMemo(String mpMemo) {
        this.mpMemo = mpMemo;
    }

    @Basic
    @Column(name = "mp_depart", nullable = true)
    public Integer getMpDepart() {
        return mpDepart;
    }

    public void setMpDepart(Integer mpDepart) {
        this.mpDepart = mpDepart;
    }

    @Basic
    @Column(name = "mp_sort", nullable = true)
    public Short getMpSort() {
        return mpSort;
    }

    public void setMpSort(Short mpSort) {
        this.mpSort = mpSort;
    }

    @Basic
    @Column(name = "mp_method", nullable = true, length = 10)
    public String getMpMethod() {
        return mpMethod;
    }

    public void setMpMethod(String mpMethod) {
        this.mpMethod = mpMethod;
    }

    @Basic
    @Column(name = "mp_IsPrintLabel", nullable = true)
    public Boolean getMpIsPrintLabel() {
        return mpIsPrintLabel;
    }

    public void setMpIsPrintLabel(Boolean mpIsPrintLabel) {
        this.mpIsPrintLabel = mpIsPrintLabel;
    }

    @Basic
    @Column(name = "mp_designdemand", nullable = true)
    public Boolean getMpDesigndemand() {
        return mpDesigndemand;
    }

    public void setMpDesigndemand(Boolean mpDesigndemand) {
        this.mpDesigndemand = mpDesigndemand;
    }

    @Basic
    @Column(name = "mp_gprofit", nullable = true, precision = 4)
    public BigDecimal getMpGprofit() {
        return mpGprofit;
    }

    public void setMpGprofit(BigDecimal mpGprofit) {
        this.mpGprofit = mpGprofit;
    }

    @Basic
    @Column(name = "mp_lowprofit", nullable = true, precision = 4)
    public BigDecimal getMpLowprofit() {
        return mpLowprofit;
    }

    public void setMpLowprofit(BigDecimal mpLowprofit) {
        this.mpLowprofit = mpLowprofit;
    }

    @Basic
    @Column(name = "mp_orderno", nullable = true, length = 10)
    public String getMpOrderno() {
        return mpOrderno;
    }

    public void setMpOrderno(String mpOrderno) {
        this.mpOrderno = mpOrderno;
    }

    @Basic
    @Column(name = "mp_ordername", nullable = true, length = 20)
    public String getMpOrdername() {
        return mpOrdername;
    }

    public void setMpOrdername(String mpOrdername) {
        this.mpOrdername = mpOrdername;
    }

    @Basic
    @Column(name = "mp_ordersort", nullable = true)
    public Short getMpOrdersort() {
        return mpOrdersort;
    }

    public void setMpOrdersort(Short mpOrdersort) {
        this.mpOrdersort = mpOrdersort;
    }

    @Basic
    @Column(name = "mp_orderdefault", nullable = false)
    public boolean isMpOrderdefault() {
        return mpOrderdefault;
    }

    public void setMpOrderdefault(boolean mpOrderdefault) {
        this.mpOrderdefault = mpOrderdefault;
    }

    @Basic
    @Column(name = "mp_departid_acc", nullable = true)
    public Integer getMpDepartidAcc() {
        return mpDepartidAcc;
    }

    public void setMpDepartidAcc(Integer mpDepartidAcc) {
        this.mpDepartidAcc = mpDepartidAcc;
    }

    @Basic
    @Column(name = "mp_IsStat_mm", nullable = true)
    public Boolean getMpIsStatMm() {
        return mpIsStatMm;
    }

    public void setMpIsStatMm(Boolean mpIsStatMm) {
        this.mpIsStatMm = mpIsStatMm;
    }

    @Basic
    @Column(name = "mp_workhours_days", nullable = true, precision = 0)
    public Double getMpWorkhoursDays() {
        return mpWorkhoursDays;
    }

    public void setMpWorkhoursDays(Double mpWorkhoursDays) {
        this.mpWorkhoursDays = mpWorkhoursDays;
    }

    @Basic
    @Column(name = "mp_throughput", nullable = true, precision = 0)
    public Double getMpThroughput() {
        return mpThroughput;
    }

    public void setMpThroughput(Double mpThroughput) {
        this.mpThroughput = mpThroughput;
    }

    @Basic
    @Column(name = "mp_preworktime", nullable = true, precision = 4)
    public BigDecimal getMpPreworktime() {
        return mpPreworktime;
    }

    public void setMpPreworktime(BigDecimal mpPreworktime) {
        this.mpPreworktime = mpPreworktime;
    }

    @Basic
    @Column(name = "mp_worktime", nullable = true, precision = 4)
    public BigDecimal getMpWorktime() {
        return mpWorktime;
    }

    public void setMpWorktime(BigDecimal mpWorktime) {
        this.mpWorktime = mpWorktime;
    }

    @Basic
    @Column(name = "mp_strokes", nullable = true)
    public Integer getMpStrokes() {
        return mpStrokes;
    }

    public void setMpStrokes(Integer mpStrokes) {
        this.mpStrokes = mpStrokes;
    }

    @Basic
    @Column(name = "mp_isshowerrmsg", nullable = true)
    public Boolean getMpIsshowerrmsg() {
        return mpIsshowerrmsg;
    }

    public void setMpIsshowerrmsg(Boolean mpIsshowerrmsg) {
        this.mpIsshowerrmsg = mpIsshowerrmsg;
    }

    @Basic
    @Column(name = "mp_finashdays", nullable = true, precision = 2)
    public BigDecimal getMpFinashdays() {
        return mpFinashdays;
    }

    public void setMpFinashdays(BigDecimal mpFinashdays) {
        this.mpFinashdays = mpFinashdays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MakeprocessEntity that = (MakeprocessEntity) o;
        return mpOrderdefault == that.mpOrderdefault && Objects.equals(mpNo, that.mpNo) && Objects.equals(mpName, that.mpName) && Objects.equals(mpMemo, that.mpMemo) && Objects.equals(mpDepart, that.mpDepart) && Objects.equals(mpSort, that.mpSort) && Objects.equals(mpMethod, that.mpMethod) && Objects.equals(mpIsPrintLabel, that.mpIsPrintLabel) && Objects.equals(mpDesigndemand, that.mpDesigndemand) && Objects.equals(mpGprofit, that.mpGprofit) && Objects.equals(mpLowprofit, that.mpLowprofit) && Objects.equals(mpOrderno, that.mpOrderno) && Objects.equals(mpOrdername, that.mpOrdername) && Objects.equals(mpOrdersort, that.mpOrdersort) && Objects.equals(mpDepartidAcc, that.mpDepartidAcc) && Objects.equals(mpIsStatMm, that.mpIsStatMm) && Objects.equals(mpWorkhoursDays, that.mpWorkhoursDays) && Objects.equals(mpThroughput, that.mpThroughput) && Objects.equals(mpPreworktime, that.mpPreworktime) && Objects.equals(mpWorktime, that.mpWorktime) && Objects.equals(mpStrokes, that.mpStrokes) && Objects.equals(mpIsshowerrmsg, that.mpIsshowerrmsg) && Objects.equals(mpFinashdays, that.mpFinashdays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mpNo, mpName, mpMemo, mpDepart, mpSort, mpMethod, mpIsPrintLabel, mpDesigndemand, mpGprofit, mpLowprofit, mpOrderno, mpOrdername, mpOrdersort, mpOrderdefault, mpDepartidAcc, mpIsStatMm, mpWorkhoursDays, mpThroughput, mpPreworktime, mpWorktime, mpStrokes, mpIsshowerrmsg, mpFinashdays);
    }
}
