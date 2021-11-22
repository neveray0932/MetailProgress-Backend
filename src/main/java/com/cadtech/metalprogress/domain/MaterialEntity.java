package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "material")
public class MaterialEntity {
    private String mNo;
    private String mName;
    private double mParams;
    private String mNo2;
    private String mNotypeset;
    private String mInvoname;
    private String mNoXml;

    @Id
    @Column(name = "m_no", nullable = false, length = 10)
    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    @Basic
    @Column(name = "m_name", nullable = false, length = 30)
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Basic
    @Column(name = "m_params", nullable = false, precision = 0)
    public double getmParams() {
        return mParams;
    }

    public void setmParams(double mParams) {
        this.mParams = mParams;
    }

    @Basic
    @Column(name = "m_no2", nullable = true, length = 50)
    public String getmNo2() {
        return mNo2;
    }

    public void setmNo2(String mNo2) {
        this.mNo2 = mNo2;
    }

    @Basic
    @Column(name = "m_notypeset", nullable = true, length = 50)
    public String getmNotypeset() {
        return mNotypeset;
    }

    public void setmNotypeset(String mNotypeset) {
        this.mNotypeset = mNotypeset;
    }

    @Basic
    @Column(name = "m_invoname", nullable = true, length = 80)
    public String getmInvoname() {
        return mInvoname;
    }

    public void setmInvoname(String mInvoname) {
        this.mInvoname = mInvoname;
    }

    @Basic
    @Column(name = "m_no_xml", nullable = true, length = 50)
    public String getmNoXml() {
        return mNoXml;
    }

    public void setmNoXml(String mNoXml) {
        this.mNoXml = mNoXml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialEntity that = (MaterialEntity) o;
        return Double.compare(that.mParams, mParams) == 0 && Objects.equals(mNo, that.mNo) && Objects.equals(mName, that.mName) && Objects.equals(mNo2, that.mNo2) && Objects.equals(mNotypeset, that.mNotypeset) && Objects.equals(mInvoname, that.mInvoname) && Objects.equals(mNoXml, that.mNoXml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mNo, mName, mParams, mNo2, mNotypeset, mInvoname, mNoXml);
    }
}
