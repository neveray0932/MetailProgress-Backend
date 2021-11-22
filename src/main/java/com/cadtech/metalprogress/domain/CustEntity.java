package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cust")
public class CustEntity {
    private String cNo;
    private String cName;
    private String cSname;
    private String cFmaddr;
    private String cDeaddr;
    private String cIvaddr;
    private String cFmaddrcode;
    private String cDeaddrcode;
    private String cIvaddrcode;
    private String cIvfirm;
    private String cBona;
    private String cInna;
    private String cIntel;
    private String cFmno;
    private String cTel1;
    private String cTel2;
    private String cFax;
    private Double cRange;
    private char cRank;
    private Timestamp cKndt;
    private String cGrade;
    private String cEmail;
    private String cMemo;
    private String cPhon;
    private Byte cRecday;
    private Byte cGatherday;
    private boolean cInvalid;
    private Integer cSort;
    private char cInvokind;
    private String cOldno;
    private String cRebateqtyno;
    private Integer cId;
    private Integer cSalesid;
    private String cCusttype;
    private Timestamp cLastrecday;
    private String cDiscount;
    private boolean cHasrebate;
    private String cSupno;
    private Integer cLetterAddress;
    private Integer cCheckterm;
    private String cPaymode;
    private Short cNotradeday;
    private double cUsramt;
    private Integer aiidAccounts;
    private Integer aiidNotes;
    private Integer aiidBeforehand;
    private String cPaycondition;
    private Integer cNoRecAmtNum;
    private Boolean cIsbuild;
    private Timestamp updatedt;
    private Timestamp exportdt;
    private String cPicpath;
    private String cCustmemo;
    private String cBussiness;
    private String cFaxTmp;
    private Boolean cDoQualityProcess;
    private Integer cCyid;

    private List<OrdermEntity> ordermEntities;

    @JsonManagedReference
    @OneToMany(mappedBy = "custEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OrdermEntity> getOrdermEntities() {
        return ordermEntities;
    }

    public void setOrdermEntities(List<OrdermEntity> ordermEntities) {
        this.ordermEntities = ordermEntities;
    }

    @Id
    @Column(name = "c_no", nullable = false, length = 10)
    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    @Basic
    @Column(name = "c_name", nullable = true, length = 60)
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "c_sname", nullable = true, length = 20)
    public String getcSname() {
        return cSname;
    }

    public void setcSname(String cSname) {
        this.cSname = cSname;
    }

    @Basic
    @Column(name = "c_fmaddr", nullable = true, length = 60)
    public String getcFmaddr() {
        return cFmaddr;
    }

    public void setcFmaddr(String cFmaddr) {
        this.cFmaddr = cFmaddr;
    }

    @Basic
    @Column(name = "c_deaddr", nullable = true, length = 60)
    public String getcDeaddr() {
        return cDeaddr;
    }

    public void setcDeaddr(String cDeaddr) {
        this.cDeaddr = cDeaddr;
    }

    @Basic
    @Column(name = "c_ivaddr", nullable = true, length = 60)
    public String getcIvaddr() {
        return cIvaddr;
    }

    public void setcIvaddr(String cIvaddr) {
        this.cIvaddr = cIvaddr;
    }

    @Basic
    @Column(name = "c_fmaddrcode", nullable = true, length = 10)
    public String getcFmaddrcode() {
        return cFmaddrcode;
    }

    public void setcFmaddrcode(String cFmaddrcode) {
        this.cFmaddrcode = cFmaddrcode;
    }

    @Basic
    @Column(name = "c_deaddrcode", nullable = true, length = 10)
    public String getcDeaddrcode() {
        return cDeaddrcode;
    }

    public void setcDeaddrcode(String cDeaddrcode) {
        this.cDeaddrcode = cDeaddrcode;
    }

    @Basic
    @Column(name = "c_ivaddrcode", nullable = true, length = 10)
    public String getcIvaddrcode() {
        return cIvaddrcode;
    }

    public void setcIvaddrcode(String cIvaddrcode) {
        this.cIvaddrcode = cIvaddrcode;
    }

    @Basic
    @Column(name = "c_ivfirm", nullable = true, length = 60)
    public String getcIvfirm() {
        return cIvfirm;
    }

    public void setcIvfirm(String cIvfirm) {
        this.cIvfirm = cIvfirm;
    }

    @Basic
    @Column(name = "c_bona", nullable = true, length = 20)
    public String getcBona() {
        return cBona;
    }

    public void setcBona(String cBona) {
        this.cBona = cBona;
    }

    @Basic
    @Column(name = "c_inna", nullable = true, length = 20)
    public String getcInna() {
        return cInna;
    }

    public void setcInna(String cInna) {
        this.cInna = cInna;
    }

    @Basic
    @Column(name = "c_intel", nullable = true, length = 30)
    public String getcIntel() {
        return cIntel;
    }

    public void setcIntel(String cIntel) {
        this.cIntel = cIntel;
    }

    @Basic
    @Column(name = "c_fmno", nullable = true, length = 10)
    public String getcFmno() {
        return cFmno;
    }

    public void setcFmno(String cFmno) {
        this.cFmno = cFmno;
    }

    @Basic
    @Column(name = "c_tel1", nullable = true, length = 30)
    public String getcTel1() {
        return cTel1;
    }

    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1;
    }

    @Basic
    @Column(name = "c_tel2", nullable = true, length = 30)
    public String getcTel2() {
        return cTel2;
    }

    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2;
    }

    @Basic
    @Column(name = "c_fax", nullable = true, length = 30)
    public String getcFax() {
        return cFax;
    }

    public void setcFax(String cFax) {
        this.cFax = cFax;
    }

    @Basic
    @Column(name = "c_range", nullable = true, precision = 0)
    public Double getcRange() {
        return cRange;
    }

    public void setcRange(Double cRange) {
        this.cRange = cRange;
    }

    @Basic
    @Column(name = "c_rank", nullable = true, length = 1)
    public char getcRank() {
        return cRank;
    }

    public void setcRank(char cRank) {
        this.cRank = cRank;
    }

    @Basic
    @Column(name = "c_kndt", nullable = true)
    public Timestamp getcKndt() {
        return cKndt;
    }

    public void setcKndt(Timestamp cKndt) {
        this.cKndt = cKndt;
    }

    @Basic
    @Column(name = "c_grade", nullable = true, length = 60)
    public String getcGrade() {
        return cGrade;
    }

    public void setcGrade(String cGrade) {
        this.cGrade = cGrade;
    }

    @Basic
    @Column(name = "c_email", nullable = true, length = 40)
    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    @Basic
    @Column(name = "c_memo", nullable = true, length = 1000)
    public String getcMemo() {
        return cMemo;
    }

    public void setcMemo(String cMemo) {
        this.cMemo = cMemo;
    }

    @Basic
    @Column(name = "c_phon", nullable = true, length = 20)
    public String getcPhon() {
        return cPhon;
    }

    public void setcPhon(String cPhon) {
        this.cPhon = cPhon;
    }

    @Basic
    @Column(name = "c_recday", nullable = true)
    public Byte getcRecday() {
        return cRecday;
    }

    public void setcRecday(Byte cRecday) {
        this.cRecday = cRecday;
    }

    @Basic
    @Column(name = "c_gatherday", nullable = true)
    public Byte getcGatherday() {
        return cGatherday;
    }

    public void setcGatherday(Byte cGatherday) {
        this.cGatherday = cGatherday;
    }

    @Basic
    @Column(name = "c_invalid", nullable = false)
    public boolean iscInvalid() {
        return cInvalid;
    }

    public void setcInvalid(boolean cInvalid) {
        this.cInvalid = cInvalid;
    }

    @Basic
    @Column(name = "c_sort", nullable = true)
    public Integer getcSort() {
        return cSort;
    }

    public void setcSort(Integer cSort) {
        this.cSort = cSort;
    }

    @Basic
    @Column(name = "c_invokind", nullable = true, length = 1)
    public char getcInvokind() {
        return cInvokind;
    }

    public void setcInvokind(char cInvokind) {
        this.cInvokind = cInvokind;
    }

    @Basic
    @Column(name = "c_oldno", nullable = true, length = 10)
    public String getcOldno() {
        return cOldno;
    }

    public void setcOldno(String cOldno) {
        this.cOldno = cOldno;
    }

    @Basic
    @Column(name = "c_rebateqtyno", nullable = true, length = 50)
    public String getcRebateqtyno() {
        return cRebateqtyno;
    }

    public void setcRebateqtyno(String cRebateqtyno) {
        this.cRebateqtyno = cRebateqtyno;
    }

    @Basic
    @Column(name = "c_id", nullable = true)
    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "c_salesid", nullable = true)
    public Integer getcSalesid() {
        return cSalesid;
    }

    public void setcSalesid(Integer cSalesid) {
        this.cSalesid = cSalesid;
    }

    @Basic
    @Column(name = "c_custtype", nullable = true, length = 10)
    public String getcCusttype() {
        return cCusttype;
    }

    public void setcCusttype(String cCusttype) {
        this.cCusttype = cCusttype;
    }

    @Basic
    @Column(name = "c_lastrecday", nullable = true)
    public Timestamp getcLastrecday() {
        return cLastrecday;
    }

    public void setcLastrecday(Timestamp cLastrecday) {
        this.cLastrecday = cLastrecday;
    }

    @Basic
    @Column(name = "c_discount", nullable = true, length = 30)
    public String getcDiscount() {
        return cDiscount;
    }

    public void setcDiscount(String cDiscount) {
        this.cDiscount = cDiscount;
    }

    @Basic
    @Column(name = "c_hasrebate", nullable = false)
    public boolean iscHasrebate() {
        return cHasrebate;
    }

    public void setcHasrebate(boolean cHasrebate) {
        this.cHasrebate = cHasrebate;
    }

    @Basic
    @Column(name = "c_supno", nullable = true, length = 10)
    public String getcSupno() {
        return cSupno;
    }

    public void setcSupno(String cSupno) {
        this.cSupno = cSupno;
    }

    @Basic
    @Column(name = "c_letterAddress", nullable = true)
    public Integer getcLetterAddress() {
        return cLetterAddress;
    }

    public void setcLetterAddress(Integer cLetterAddress) {
        this.cLetterAddress = cLetterAddress;
    }

    @Basic
    @Column(name = "c_checkterm", nullable = true)
    public Integer getcCheckterm() {
        return cCheckterm;
    }

    public void setcCheckterm(Integer cCheckterm) {
        this.cCheckterm = cCheckterm;
    }

    @Basic
    @Column(name = "c_paymode", nullable = true, length = 20)
    public String getcPaymode() {
        return cPaymode;
    }

    public void setcPaymode(String cPaymode) {
        this.cPaymode = cPaymode;
    }

    @Basic
    @Column(name = "c_notradeday", nullable = true)
    public Short getcNotradeday() {
        return cNotradeday;
    }

    public void setcNotradeday(Short cNotradeday) {
        this.cNotradeday = cNotradeday;
    }

    @Basic
    @Column(name = "c_usramt", nullable = false, precision = 0)
    public double getcUsramt() {
        return cUsramt;
    }

    public void setcUsramt(double cUsramt) {
        this.cUsramt = cUsramt;
    }

    @Basic
    @Column(name = "aiid_accounts", nullable = true)
    public Integer getAiidAccounts() {
        return aiidAccounts;
    }

    public void setAiidAccounts(Integer aiidAccounts) {
        this.aiidAccounts = aiidAccounts;
    }

    @Basic
    @Column(name = "aiid_notes", nullable = true)
    public Integer getAiidNotes() {
        return aiidNotes;
    }

    public void setAiidNotes(Integer aiidNotes) {
        this.aiidNotes = aiidNotes;
    }

    @Basic
    @Column(name = "aiid_beforehand", nullable = true)
    public Integer getAiidBeforehand() {
        return aiidBeforehand;
    }

    public void setAiidBeforehand(Integer aiidBeforehand) {
        this.aiidBeforehand = aiidBeforehand;
    }

    @Basic
    @Type(type="text")
    @Column(name = "c_paycondition", nullable = true, length = -1)
    public String getcPaycondition() {
        return cPaycondition;
    }

    public void setcPaycondition(String cPaycondition) {
        this.cPaycondition = cPaycondition;
    }

    @Basic
    @Column(name = "c_NoRecAmtNum", nullable = true)
    public Integer getcNoRecAmtNum() {
        return cNoRecAmtNum;
    }

    public void setcNoRecAmtNum(Integer cNoRecAmtNum) {
        this.cNoRecAmtNum = cNoRecAmtNum;
    }

    @Basic
    @Column(name = "c_isbuild", nullable = true)
    public Boolean getcIsbuild() {
        return cIsbuild;
    }

    public void setcIsbuild(Boolean cIsbuild) {
        this.cIsbuild = cIsbuild;
    }

    @Basic
    @Column(name = "updatedt", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")    public Timestamp getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Timestamp updatedt) {
        this.updatedt = updatedt;
    }

    @Basic
    @Column(name = "exportdt", nullable = true)
    public Timestamp getExportdt() {
        return exportdt;
    }

    public void setExportdt(Timestamp exportdt) {
        this.exportdt = exportdt;
    }

    @Basic
    @Column(name = "c_picpath", nullable = true, length = 100)
    public String getcPicpath() {
        return cPicpath;
    }

    public void setcPicpath(String cPicpath) {
        this.cPicpath = cPicpath;
    }

    @Basic
    @Column(name = "c_custmemo", nullable = true, length = 2000)
    public String getcCustmemo() {
        return cCustmemo;
    }

    public void setcCustmemo(String cCustmemo) {
        this.cCustmemo = cCustmemo;
    }

    @Basic
    @Column(name = "c_bussiness", nullable = true, length = 200)
    public String getcBussiness() {
        return cBussiness;
    }

    public void setcBussiness(String cBussiness) {
        this.cBussiness = cBussiness;
    }

    @Basic
    @Column(name = "c_fax_tmp", nullable = true, length = 30)
    public String getcFaxTmp() {
        return cFaxTmp;
    }

    public void setcFaxTmp(String cFaxTmp) {
        this.cFaxTmp = cFaxTmp;
    }

    @Basic
    @Column(name = "c_doQualityProcess", nullable = true)
    public Boolean getcDoQualityProcess() {
        return cDoQualityProcess;
    }

    public void setcDoQualityProcess(Boolean cDoQualityProcess) {
        this.cDoQualityProcess = cDoQualityProcess;
    }

    @Basic
    @Column(name = "c_cyid", nullable = true)
    public Integer getcCyid() {
        return cCyid;
    }

    public void setcCyid(Integer cCyid) {
        this.cCyid = cCyid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustEntity that = (CustEntity) o;
        return cInvalid == that.cInvalid && cHasrebate == that.cHasrebate && Double.compare(that.cUsramt, cUsramt) == 0 && Objects.equals(cNo, that.cNo) && Objects.equals(cName, that.cName) && Objects.equals(cSname, that.cSname) && Objects.equals(cFmaddr, that.cFmaddr) && Objects.equals(cDeaddr, that.cDeaddr) && Objects.equals(cIvaddr, that.cIvaddr) && Objects.equals(cFmaddrcode, that.cFmaddrcode) && Objects.equals(cDeaddrcode, that.cDeaddrcode) && Objects.equals(cIvaddrcode, that.cIvaddrcode) && Objects.equals(cIvfirm, that.cIvfirm) && Objects.equals(cBona, that.cBona) && Objects.equals(cInna, that.cInna) && Objects.equals(cIntel, that.cIntel) && Objects.equals(cFmno, that.cFmno) && Objects.equals(cTel1, that.cTel1) && Objects.equals(cTel2, that.cTel2) && Objects.equals(cFax, that.cFax) && Objects.equals(cRange, that.cRange) && Objects.equals(cRank, that.cRank) && Objects.equals(cKndt, that.cKndt) && Objects.equals(cGrade, that.cGrade) && Objects.equals(cEmail, that.cEmail) && Objects.equals(cMemo, that.cMemo) && Objects.equals(cPhon, that.cPhon) && Objects.equals(cRecday, that.cRecday) && Objects.equals(cGatherday, that.cGatherday) && Objects.equals(cSort, that.cSort) && Objects.equals(cInvokind, that.cInvokind) && Objects.equals(cOldno, that.cOldno) && Objects.equals(cRebateqtyno, that.cRebateqtyno) && Objects.equals(cId, that.cId) && Objects.equals(cSalesid, that.cSalesid) && Objects.equals(cCusttype, that.cCusttype) && Objects.equals(cLastrecday, that.cLastrecday) && Objects.equals(cDiscount, that.cDiscount) && Objects.equals(cSupno, that.cSupno) && Objects.equals(cLetterAddress, that.cLetterAddress) && Objects.equals(cCheckterm, that.cCheckterm) && Objects.equals(cPaymode, that.cPaymode) && Objects.equals(cNotradeday, that.cNotradeday) && Objects.equals(aiidAccounts, that.aiidAccounts) && Objects.equals(aiidNotes, that.aiidNotes) && Objects.equals(aiidBeforehand, that.aiidBeforehand) && Objects.equals(cPaycondition, that.cPaycondition) && Objects.equals(cNoRecAmtNum, that.cNoRecAmtNum) && Objects.equals(cIsbuild, that.cIsbuild) && Objects.equals(updatedt, that.updatedt) && Objects.equals(exportdt, that.exportdt) && Objects.equals(cPicpath, that.cPicpath) && Objects.equals(cCustmemo, that.cCustmemo) && Objects.equals(cBussiness, that.cBussiness) && Objects.equals(cFaxTmp, that.cFaxTmp) && Objects.equals(cDoQualityProcess, that.cDoQualityProcess) && Objects.equals(cCyid, that.cCyid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cNo, cName, cSname, cFmaddr, cDeaddr, cIvaddr, cFmaddrcode, cDeaddrcode, cIvaddrcode, cIvfirm, cBona, cInna, cIntel, cFmno, cTel1, cTel2, cFax, cRange, cRank, cKndt, cGrade, cEmail, cMemo, cPhon, cRecday, cGatherday, cInvalid, cSort, cInvokind, cOldno, cRebateqtyno, cId, cSalesid, cCusttype, cLastrecday, cDiscount, cHasrebate, cSupno, cLetterAddress, cCheckterm, cPaymode, cNotradeday, cUsramt, aiidAccounts, aiidNotes, aiidBeforehand, cPaycondition, cNoRecAmtNum, cIsbuild, updatedt, exportdt, cPicpath, cCustmemo, cBussiness, cFaxTmp, cDoQualityProcess, cCyid);
    }
}
