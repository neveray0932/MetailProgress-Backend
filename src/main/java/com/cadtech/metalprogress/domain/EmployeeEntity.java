package com.cadtech.metalprogress.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    private String eNo;
    private String eName;
    private Timestamp eBirthday;
    private Timestamp eHireday;
    private Timestamp eLeaveday;
    private String eAddr;
    private String eAddrcode;
    private String eConaddr;
    private String eConaddrcode;
    private String eTel1;
    private String eTel2;
    private String eCellphone;
    private String eInna;
    private String eIntel1;
    private String eIntel2;
    private String eMemo;
    private String eId;
    private String eSex;
    private Integer eUnitid;
    private String eWorkClass;
    private Integer eAutoid;
    private String eSubphone;
    private Integer eImgId;
    private String eMpno;
    private String eEmail;

    @Id
    @Column(name = "e_no", nullable = false, length = 10)
    public String geteNo() {
        return eNo;
    }

    public void seteNo(String eNo) {
        this.eNo = eNo;
    }

    @Basic
    @Column(name = "e_name", nullable = true, length = 20)
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Basic
    @Column(name = "e_birthday", nullable = true)
    public Timestamp geteBirthday() {
        return eBirthday;
    }

    public void seteBirthday(Timestamp eBirthday) {
        this.eBirthday = eBirthday;
    }

    @Basic
    @Column(name = "e_hireday", nullable = true)
    public Timestamp geteHireday() {
        return eHireday;
    }

    public void seteHireday(Timestamp eHireday) {
        this.eHireday = eHireday;
    }

    @Basic
    @Column(name = "e_leaveday", nullable = true)
    public Timestamp geteLeaveday() {
        return eLeaveday;
    }

    public void seteLeaveday(Timestamp eLeaveday) {
        this.eLeaveday = eLeaveday;
    }

    @Basic
    @Column(name = "e_addr", nullable = true, length = 60)
    public String geteAddr() {
        return eAddr;
    }

    public void seteAddr(String eAddr) {
        this.eAddr = eAddr;
    }

    @Basic
    @Column(name = "e_addrcode", nullable = true, length = 10)
    public String geteAddrcode() {
        return eAddrcode;
    }

    public void seteAddrcode(String eAddrcode) {
        this.eAddrcode = eAddrcode;
    }

    @Basic
    @Column(name = "e_conaddr", nullable = true, length = 60)
    public String geteConaddr() {
        return eConaddr;
    }

    public void seteConaddr(String eConaddr) {
        this.eConaddr = eConaddr;
    }

    @Basic
    @Column(name = "e_conaddrcode", nullable = true, length = 10)
    public String geteConaddrcode() {
        return eConaddrcode;
    }

    public void seteConaddrcode(String eConaddrcode) {
        this.eConaddrcode = eConaddrcode;
    }

    @Basic
    @Column(name = "e_tel1", nullable = true, length = 30)
    public String geteTel1() {
        return eTel1;
    }

    public void seteTel1(String eTel1) {
        this.eTel1 = eTel1;
    }

    @Basic
    @Column(name = "e_tel2", nullable = true, length = 30)
    public String geteTel2() {
        return eTel2;
    }

    public void seteTel2(String eTel2) {
        this.eTel2 = eTel2;
    }

    @Basic
    @Column(name = "e_cellphone", nullable = true, length = 30)
    public String geteCellphone() {
        return eCellphone;
    }

    public void seteCellphone(String eCellphone) {
        this.eCellphone = eCellphone;
    }

    @Basic
    @Column(name = "e_inna", nullable = true, length = 30)
    public String geteInna() {
        return eInna;
    }

    public void seteInna(String eInna) {
        this.eInna = eInna;
    }

    @Basic
    @Column(name = "e_intel1", nullable = true, length = 30)
    public String geteIntel1() {
        return eIntel1;
    }

    public void seteIntel1(String eIntel1) {
        this.eIntel1 = eIntel1;
    }

    @Basic
    @Column(name = "e_intel2", nullable = true, length = 30)
    public String geteIntel2() {
        return eIntel2;
    }

    public void seteIntel2(String eIntel2) {
        this.eIntel2 = eIntel2;
    }

    @Basic
    @Column(name = "e_memo", nullable = true, length = 200)
    public String geteMemo() {
        return eMemo;
    }

    public void seteMemo(String eMemo) {
        this.eMemo = eMemo;
    }

    @Basic
    @Column(name = "e_id", nullable = true, length = 20)
    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    @Basic
    @Type(type = "char")
    @Column(name = "e_sex", nullable = true, length = 2)
    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    @Basic
    @Column(name = "e_unitid", nullable = true)
    public Integer geteUnitid() {
        return eUnitid;
    }

    public void seteUnitid(Integer eUnitid) {
        this.eUnitid = eUnitid;
    }

    @Basic
    @Column(name = "e_workClass", nullable = true, length = 20)
    public String geteWorkClass() {
        return eWorkClass;
    }

    public void seteWorkClass(String eWorkClass) {
        this.eWorkClass = eWorkClass;
    }

    @Basic
    @Column(name = "e_autoid", nullable = true)
    public Integer geteAutoid() {
        return eAutoid;
    }

    public void seteAutoid(Integer eAutoid) {
        this.eAutoid = eAutoid;
    }

    @Basic
    @Column(name = "e_subphone", nullable = true, length = 10)
    public String geteSubphone() {
        return eSubphone;
    }

    public void seteSubphone(String eSubphone) {
        this.eSubphone = eSubphone;
    }

    @Basic
    @Column(name = "e_ImgID", nullable = true)
    public Integer geteImgId() {
        return eImgId;
    }

    public void seteImgId(Integer eImgId) {
        this.eImgId = eImgId;
    }

    @Basic
    @Column(name = "e_mpno", nullable = true, length = 10)
    public String geteMpno() {
        return eMpno;
    }

    public void seteMpno(String eMpno) {
        this.eMpno = eMpno;
    }

    @Basic
    @Column(name = "e_email", nullable = true, length = 50)
    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(eNo, that.eNo) && Objects.equals(eName, that.eName) && Objects.equals(eBirthday, that.eBirthday) && Objects.equals(eHireday, that.eHireday) && Objects.equals(eLeaveday, that.eLeaveday) && Objects.equals(eAddr, that.eAddr) && Objects.equals(eAddrcode, that.eAddrcode) && Objects.equals(eConaddr, that.eConaddr) && Objects.equals(eConaddrcode, that.eConaddrcode) && Objects.equals(eTel1, that.eTel1) && Objects.equals(eTel2, that.eTel2) && Objects.equals(eCellphone, that.eCellphone) && Objects.equals(eInna, that.eInna) && Objects.equals(eIntel1, that.eIntel1) && Objects.equals(eIntel2, that.eIntel2) && Objects.equals(eMemo, that.eMemo) && Objects.equals(eId, that.eId) && Objects.equals(eSex, that.eSex) && Objects.equals(eUnitid, that.eUnitid) && Objects.equals(eWorkClass, that.eWorkClass) && Objects.equals(eAutoid, that.eAutoid) && Objects.equals(eSubphone, that.eSubphone) && Objects.equals(eImgId, that.eImgId) && Objects.equals(eMpno, that.eMpno) && Objects.equals(eEmail, that.eEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eNo, eName, eBirthday, eHireday, eLeaveday, eAddr, eAddrcode, eConaddr, eConaddrcode, eTel1, eTel2, eCellphone, eInna, eIntel1, eIntel2, eMemo, eId, eSex, eUnitid, eWorkClass, eAutoid, eSubphone, eImgId, eMpno, eEmail);
    }
}
