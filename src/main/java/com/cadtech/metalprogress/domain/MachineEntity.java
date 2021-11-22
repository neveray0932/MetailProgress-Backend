package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "machine")
public class MachineEntity {
    private String mNo;
    private String mName;
    private String mMemo;
    private String mMpno;
    private BigDecimal mMonthweight;
    private BigDecimal mMonthlaser;
    private BigDecimal mMonthPcs;
    private Integer mEmpid;
    private double mThroughput;
    private Short mSort;
    private String mAnalysiskind;
    private Double mThroughputPcs;
    private boolean mIscount;

    @Id
    @Column(name = "m_no", nullable = false, length = 20)
    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    @Basic
    @Column(name = "m_name", nullable = false, length = 20)
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Basic
    @Column(name = "m_memo", nullable = true, length = 60)
    public String getmMemo() {
        return mMemo;
    }

    public void setmMemo(String mMemo) {
        this.mMemo = mMemo;
    }

    @Basic
    @Column(name = "m_mpno", nullable = true, length = 10)
    public String getmMpno() {
        return mMpno;
    }

    public void setmMpno(String mMpno) {
        this.mMpno = mMpno;
    }

    @Basic
    @Column(name = "m_monthweight", nullable = true, precision = 4)
    public BigDecimal getmMonthweight() {
        return mMonthweight;
    }

    public void setmMonthweight(BigDecimal mMonthweight) {
        this.mMonthweight = mMonthweight;
    }

    @Basic
    @Column(name = "m_monthlaser", nullable = true, precision = 4)
    public BigDecimal getmMonthlaser() {
        return mMonthlaser;
    }

    public void setmMonthlaser(BigDecimal mMonthlaser) {
        this.mMonthlaser = mMonthlaser;
    }

    @Basic
    @Column(name = "m_monthPcs", nullable = true, precision = 2)
    public BigDecimal getmMonthPcs() {
        return mMonthPcs;
    }

    public void setmMonthPcs(BigDecimal mMonthPcs) {
        this.mMonthPcs = mMonthPcs;
    }

    @Basic
    @Column(name = "m_empid", nullable = true)
    public Integer getmEmpid() {
        return mEmpid;
    }

    public void setmEmpid(Integer mEmpid) {
        this.mEmpid = mEmpid;
    }

    @Basic
    @Column(name = "m_throughput", nullable = false, precision = 0)
    public double getmThroughput() {
        return mThroughput;
    }

    public void setmThroughput(double mThroughput) {
        this.mThroughput = mThroughput;
    }

    @Basic
    @Column(name = "m_sort", nullable = true)
    public Short getmSort() {
        return mSort;
    }

    public void setmSort(Short mSort) {
        this.mSort = mSort;
    }

    @Basic
    @Column(name = "m_analysiskind", nullable = true, length = 30)
    public String getmAnalysiskind() {
        return mAnalysiskind;
    }

    public void setmAnalysiskind(String mAnalysiskind) {
        this.mAnalysiskind = mAnalysiskind;
    }

    @Basic
    @Column(name = "m_throughputPCS", nullable = true, precision = 0)
    public Double getmThroughputPcs() {
        return mThroughputPcs;
    }

    public void setmThroughputPcs(Double mThroughputPcs) {
        this.mThroughputPcs = mThroughputPcs;
    }

    @Basic
    @Column(name = "m_iscount", nullable = false)
    public boolean ismIscount() {
        return mIscount;
    }

    public void setmIscount(boolean mIscount) {
        this.mIscount = mIscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineEntity that = (MachineEntity) o;
        return Double.compare(that.mThroughput, mThroughput) == 0 && mIscount == that.mIscount && Objects.equals(mNo, that.mNo) && Objects.equals(mName, that.mName) && Objects.equals(mMemo, that.mMemo) && Objects.equals(mMpno, that.mMpno) && Objects.equals(mMonthweight, that.mMonthweight) && Objects.equals(mMonthlaser, that.mMonthlaser) && Objects.equals(mMonthPcs, that.mMonthPcs) && Objects.equals(mEmpid, that.mEmpid) && Objects.equals(mSort, that.mSort) && Objects.equals(mAnalysiskind, that.mAnalysiskind) && Objects.equals(mThroughputPcs, that.mThroughputPcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mNo, mName, mMemo, mMpno, mMonthweight, mMonthlaser, mMonthPcs, mEmpid, mThroughput, mSort, mAnalysiskind, mThroughputPcs, mIscount);
    }
}
