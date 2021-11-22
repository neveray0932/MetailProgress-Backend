package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orderm")
public class OrdermEntity {
    private String oCode;
    private Date oDate;
    private String oCustbillcode;
    private String oUser;
    private Date oTargetdate;
    private char oInvokind;
    private Boolean oHastax;
    private Double oDetailamt;
    private Double oTaxamt;
    private Double oTotamt;
    private Double oEarnest;
    private String oMemo;
    private Boolean oInvalid;
    private Boolean oOver;
    private Timestamp updatedt;
    private Boolean islocked;
    private Integer lockedid;
    private String oDeliveryAddr;
    private Integer oSubCustid;
    private char oType;
    private String oCoderefer;
    private Timestamp oBilldate;
    private String oBillyymm;
    private String oReccode;
    private String accVounotemp;
    private String accVouno;
    private boolean accNeed2Voutemp;
    private boolean oIscase;
    private int compid;
    private String oInna;
    private String oShapespec;
    private String oBomno;
    private String oMakeno;
    private Integer oSalesperson;
    private BigDecimal oSumweight;
    private BigDecimal oTotalweightDecimal;
    private String oMemo2;
    private double oNotaxamt;
    private String oDelivery;
    private Integer oAssistantid;
    private Timestamp oCustbilldate;
    private String oPlanyymm;
    private Integer oCyid;
    private BigDecimal oCyrate;
    private BigDecimal oCyamt;
    private String oProcessmemo;
    private Integer oProcesssort;
    private String oCorrelationfile;
    private String oChecker;
    private String oMemo3;
    private Boolean oDoQualityProcess;
    private Timestamp oCheckerDt;
    private String oEmemo;

    private CustEntity custEntity;

    private List<OrderdEntity> orderdEntities;

    @JsonManagedReference
    @OneToMany(mappedBy = "ordermEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OrderdEntity> getOrderdEntities() {
        return orderdEntities;
    }

    public void setOrderdEntities(List<OrderdEntity> orderdEntities) {
        this.orderdEntities = orderdEntities;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "o_custno")
    public CustEntity getCustEntity() {
        return custEntity;
    }

    public void setCustEntity(CustEntity custEntity) {
        this.custEntity = custEntity;
    }

    @Id
    @Column(name = "o_code", nullable = false, length = 12)
    public String getoCode() {
        return oCode;
    }

    public void setoCode(String oCode) {
        this.oCode = oCode;
    }

    @Basic
    @Column(name = "o_date", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Timestamp oDate) {
        this.oDate = oDate;
    }

    @Basic
    @Column(name = "o_custbillcode", nullable = true, length = 20)
    public String getoCustbillcode() {
        return oCustbillcode;
    }

    public void setoCustbillcode(String oCustbillcode) {
        this.oCustbillcode = oCustbillcode;
    }

    @Basic
    @Column(name = "o_user", nullable = true, length = 10)
    public String getoUser() {
        return oUser;
    }

    public void setoUser(String oUser) {
        this.oUser = oUser;
    }

    @Basic
    @Column(name = "o_targetdate", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date getoTargetdate() {
        return oTargetdate;
    }

    public void setoTargetdate(Date oTargetdate) {
        this.oTargetdate = oTargetdate;
    }

    @Basic
    @Column(name = "o_invokind", nullable = true, length = 1)
    public char getoInvokind() {
        return oInvokind;
    }

    public void setoInvokind(char oInvokind) {
        this.oInvokind = oInvokind;
    }

    @Basic
    @Column(name = "o_hastax", nullable = true)
    public Boolean getoHastax() {
        return oHastax;
    }

    public void setoHastax(Boolean oHastax) {
        this.oHastax = oHastax;
    }

    @Basic
    @Column(name = "o_detailamt", nullable = true, precision = 0)
    public Double getoDetailamt() {
        return oDetailamt;
    }

    public void setoDetailamt(Double oDetailamt) {
        this.oDetailamt = oDetailamt;
    }

    @Basic
    @Column(name = "o_taxamt", nullable = true, precision = 0)
    public Double getoTaxamt() {
        return oTaxamt;
    }

    public void setoTaxamt(Double oTaxamt) {
        this.oTaxamt = oTaxamt;
    }

    @Basic
    @Column(name = "o_totamt", nullable = true, precision = 0)
    public Double getoTotamt() {
        return oTotamt;
    }

    public void setoTotamt(Double oTotamt) {
        this.oTotamt = oTotamt;
    }

    @Basic
    @Column(name = "o_earnest", nullable = true, precision = 0)
    public Double getoEarnest() {
        return oEarnest;
    }

    public void setoEarnest(Double oEarnest) {
        this.oEarnest = oEarnest;
    }

    @Basic
    @Column(name = "o_memo", nullable = true, length = 2000)
    public String getoMemo() {
        return oMemo;
    }

    public void setoMemo(String oMemo) {
        this.oMemo = oMemo;
    }

    @Basic
    @Column(name = "o_invalid", nullable = true)
    public Boolean getoInvalid() {
        return oInvalid;
    }

    public void setoInvalid(Boolean oInvalid) {
        this.oInvalid = oInvalid;
    }

    @Basic
    @Column(name = "o_over", nullable = true)
    public Boolean getoOver() {
        return oOver;
    }

    public void setoOver(Boolean oOver) {
        this.oOver = oOver;
    }

    @Basic
    @Column(name = "updatedt", nullable = true)
    public Timestamp getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Timestamp updatedt) {
        this.updatedt = updatedt;
    }

    @Basic
    @Column(name = "islocked", nullable = true)
    public Boolean getIslocked() {
        return islocked;
    }

    public void setIslocked(Boolean islocked) {
        this.islocked = islocked;
    }

    @Basic
    @Column(name = "lockedid", nullable = true)
    public Integer getLockedid() {
        return lockedid;
    }

    public void setLockedid(Integer lockedid) {
        this.lockedid = lockedid;
    }

    @Basic
    @Column(name = "o_deliveryAddr", nullable = true, length = 100)
    public String getoDeliveryAddr() {
        return oDeliveryAddr;
    }

    public void setoDeliveryAddr(String oDeliveryAddr) {
        this.oDeliveryAddr = oDeliveryAddr;
    }

    @Basic
    @Column(name = "o_subCustid", nullable = true)
    public Integer getoSubCustid() {
        return oSubCustid;
    }

    public void setoSubCustid(Integer oSubCustid) {
        this.oSubCustid = oSubCustid;
    }

    @Basic
    @Column(name = "o_type", nullable = false, length = 1)
    public char getoType() {
        return oType;
    }

    public void setoType(char oType) {
        this.oType = oType;
    }

    @Basic
    @Column(name = "o_coderefer", nullable = true, length = 12)
    public String getoCoderefer() {
        return oCoderefer;
    }

    public void setoCoderefer(String oCoderefer) {
        this.oCoderefer = oCoderefer;
    }

    @Basic
    @Column(name = "o_billdate", nullable = true)
    public Timestamp getoBilldate() {
        return oBilldate;
    }

    public void setoBilldate(Timestamp oBilldate) {
        this.oBilldate = oBilldate;
    }

    @Basic
    @Column(name = "o_billyymm", nullable = true, length = 6)
    public String getoBillyymm() {
        return oBillyymm;
    }

    public void setoBillyymm(String oBillyymm) {
        this.oBillyymm = oBillyymm;
    }

    @Basic
    @Column(name = "o_reccode", nullable = true, length = 12)
    public String getoReccode() {
        return oReccode;
    }

    public void setoReccode(String oReccode) {
        this.oReccode = oReccode;
    }

    @Basic
    @Column(name = "acc_vounotemp", nullable = true, length = 200)
    public String getAccVounotemp() {
        return accVounotemp;
    }

    public void setAccVounotemp(String accVounotemp) {
        this.accVounotemp = accVounotemp;
    }

    @Basic
    @Column(name = "acc_vouno", nullable = true, length = 200)
    public String getAccVouno() {
        return accVouno;
    }

    public void setAccVouno(String accVouno) {
        this.accVouno = accVouno;
    }

    @Basic
    @Column(name = "acc_need2voutemp", nullable = false)
    public boolean isAccNeed2Voutemp() {
        return accNeed2Voutemp;
    }

    public void setAccNeed2Voutemp(boolean accNeed2Voutemp) {
        this.accNeed2Voutemp = accNeed2Voutemp;
    }

    @Basic
    @Column(name = "o_iscase", nullable = false)
    public boolean isoIscase() {
        return oIscase;
    }

    public void setoIscase(boolean oIscase) {
        this.oIscase = oIscase;
    }

    @Basic
    @Column(name = "compid", nullable = false)
    public int getCompid() {
        return compid;
    }

    public void setCompid(int compid) {
        this.compid = compid;
    }

    @Basic
    @Column(name = "o_inna", nullable = true, length = 60)
    public String getoInna() {
        return oInna;
    }

    public void setoInna(String oInna) {
        this.oInna = oInna;
    }

    @Basic
    @Column(name = "o_shapespec", nullable = true, length = 50)
    public String getoShapespec() {
        return oShapespec;
    }

    public void setoShapespec(String oShapespec) {
        this.oShapespec = oShapespec;
    }

    @Basic
    @Column(name = "o_bomno", nullable = true, length = 20)
    public String getoBomno() {
        return oBomno;
    }

    public void setoBomno(String oBomno) {
        this.oBomno = oBomno;
    }

    @Basic
    @Column(name = "o_makeno", nullable = true, length = 15)
    public String getoMakeno() {
        return oMakeno;
    }

    public void setoMakeno(String oMakeno) {
        this.oMakeno = oMakeno;
    }

    @Basic
    @Column(name = "o_salesperson", nullable = true)
    public Integer getoSalesperson() {
        return oSalesperson;
    }

    public void setoSalesperson(Integer oSalesperson) {
        this.oSalesperson = oSalesperson;
    }

    @Basic
    @Column(name = "o_sumweight", nullable = false, precision = 4)
    public BigDecimal getoSumweight() {
        return oSumweight;
    }

    public void setoSumweight(BigDecimal oSumweight) {
        this.oSumweight = oSumweight;
    }

    @Basic
    @Column(name = "o_totalweightDecimal", nullable = false, precision = 4)
    public BigDecimal getoTotalweightDecimal() {
        return oTotalweightDecimal;
    }

    public void setoTotalweightDecimal(BigDecimal oTotalweightDecimal) {
        this.oTotalweightDecimal = oTotalweightDecimal;
    }

    @Basic
    @Column(name = "o_memo2", nullable = true, length = 2000)
    public String getoMemo2() {
        return oMemo2;
    }

    public void setoMemo2(String oMemo2) {
        this.oMemo2 = oMemo2;
    }

    @Basic
    @Column(name = "o_notaxamt", nullable = false, precision = 0)
    public double getoNotaxamt() {
        return oNotaxamt;
    }

    public void setoNotaxamt(double oNotaxamt) {
        this.oNotaxamt = oNotaxamt;
    }

    @Basic
    @Column(name = "o_delivery", nullable = true, length = 80)
    public String getoDelivery() {
        return oDelivery;
    }

    public void setoDelivery(String oDelivery) {
        this.oDelivery = oDelivery;
    }

    @Basic
    @Column(name = "o_assistantid", nullable = true)
    public Integer getoAssistantid() {
        return oAssistantid;
    }

    public void setoAssistantid(Integer oAssistantid) {
        this.oAssistantid = oAssistantid;
    }

    @Basic
    @Column(name = "o_custbilldate", nullable = true)
    public Timestamp getoCustbilldate() {
        return oCustbilldate;
    }

    public void setoCustbilldate(Timestamp oCustbilldate) {
        this.oCustbilldate = oCustbilldate;
    }

    @Basic
    @Column(name = "o_planyymm", nullable = true, length = 6)
    public String getoPlanyymm() {
        return oPlanyymm;
    }

    public void setoPlanyymm(String oPlanyymm) {
        this.oPlanyymm = oPlanyymm;
    }

    @Basic
    @Column(name = "o_cyid", nullable = true)
    public Integer getoCyid() {
        return oCyid;
    }

    public void setoCyid(Integer oCyid) {
        this.oCyid = oCyid;
    }

    @Basic
    @Column(name = "o_cyrate", nullable = true, precision = 4)
    public BigDecimal getoCyrate() {
        return oCyrate;
    }

    public void setoCyrate(BigDecimal oCyrate) {
        this.oCyrate = oCyrate;
    }

    @Basic
    @Column(name = "o_cyamt", nullable = true, precision = 4)
    public BigDecimal getoCyamt() {
        return oCyamt;
    }

    public void setoCyamt(BigDecimal oCyamt) {
        this.oCyamt = oCyamt;
    }

    @Basic
    @Column(name = "o_processmemo", nullable = true, length = 400)
    public String getoProcessmemo() {
        return oProcessmemo;
    }

    public void setoProcessmemo(String oProcessmemo) {
        this.oProcessmemo = oProcessmemo;
    }

    @Basic
    @Column(name = "o_processsort", nullable = true)
    public Integer getoProcesssort() {
        return oProcesssort;
    }

    public void setoProcesssort(Integer oProcesssort) {
        this.oProcesssort = oProcesssort;
    }

    @Basic
    @Column(name = "o_correlationfile", nullable = true, length = 200)
    public String getoCorrelationfile() {
        return oCorrelationfile;
    }

    public void setoCorrelationfile(String oCorrelationfile) {
        this.oCorrelationfile = oCorrelationfile;
    }

    @Basic
    @Column(name = "o_checker", nullable = true, length = 10)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public String getoChecker() {
        return oChecker;
    }

    public void setoChecker(String oChecker) {
        this.oChecker = oChecker;
    }

    @Basic
    @Column(name = "o_memo3", nullable = true, length = 2000)
    public String getoMemo3() {
        return oMemo3;
    }

    public void setoMemo3(String oMemo3) {
        this.oMemo3 = oMemo3;
    }

    @Basic
    @Column(name = "o_doQualityProcess", nullable = true)
    public Boolean getoDoQualityProcess() {
        return oDoQualityProcess;
    }

    public void setoDoQualityProcess(Boolean oDoQualityProcess) {
        this.oDoQualityProcess = oDoQualityProcess;
    }

    @Basic
    @Column(name = "o_checker_dt", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Timestamp getoCheckerDt() {
        return oCheckerDt;
    }

    public void setoCheckerDt(Timestamp oCheckerDt) {
        this.oCheckerDt = oCheckerDt;
    }

    @Basic
    @Column(name = "o_ememo", nullable = true, length = 2000)
    public String getoEmemo() {
        return oEmemo;
    }

    public void setoEmemo(String oEmemo) {
        this.oEmemo = oEmemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdermEntity that = (OrdermEntity) o;
        return accNeed2Voutemp == that.accNeed2Voutemp && oIscase == that.oIscase && compid == that.compid && Double.compare(that.oNotaxamt, oNotaxamt) == 0 && Objects.equals(oCode, that.oCode) && Objects.equals(oDate, that.oDate) && Objects.equals(oCustbillcode, that.oCustbillcode) && Objects.equals(oUser, that.oUser) && Objects.equals(oTargetdate, that.oTargetdate) && Objects.equals(oInvokind, that.oInvokind) && Objects.equals(oHastax, that.oHastax) && Objects.equals(oDetailamt, that.oDetailamt) && Objects.equals(oTaxamt, that.oTaxamt) && Objects.equals(oTotamt, that.oTotamt) && Objects.equals(oEarnest, that.oEarnest) && Objects.equals(oMemo, that.oMemo) && Objects.equals(oInvalid, that.oInvalid) && Objects.equals(oOver, that.oOver) && Objects.equals(updatedt, that.updatedt) && Objects.equals(islocked, that.islocked) && Objects.equals(lockedid, that.lockedid) && Objects.equals(oDeliveryAddr, that.oDeliveryAddr) && Objects.equals(oSubCustid, that.oSubCustid) && Objects.equals(oType, that.oType) && Objects.equals(oCoderefer, that.oCoderefer) && Objects.equals(oBilldate, that.oBilldate) && Objects.equals(oBillyymm, that.oBillyymm) && Objects.equals(oReccode, that.oReccode) && Objects.equals(accVounotemp, that.accVounotemp) && Objects.equals(accVouno, that.accVouno) && Objects.equals(oInna, that.oInna) && Objects.equals(oShapespec, that.oShapespec) && Objects.equals(oBomno, that.oBomno) && Objects.equals(oMakeno, that.oMakeno) && Objects.equals(oSalesperson, that.oSalesperson) && Objects.equals(oSumweight, that.oSumweight) && Objects.equals(oTotalweightDecimal, that.oTotalweightDecimal) && Objects.equals(oMemo2, that.oMemo2) && Objects.equals(oDelivery, that.oDelivery) && Objects.equals(oAssistantid, that.oAssistantid) && Objects.equals(oCustbilldate, that.oCustbilldate) && Objects.equals(oPlanyymm, that.oPlanyymm) && Objects.equals(oCyid, that.oCyid) && Objects.equals(oCyrate, that.oCyrate) && Objects.equals(oCyamt, that.oCyamt) && Objects.equals(oProcessmemo, that.oProcessmemo) && Objects.equals(oProcesssort, that.oProcesssort) && Objects.equals(oCorrelationfile, that.oCorrelationfile) && Objects.equals(oChecker, that.oChecker) && Objects.equals(oMemo3, that.oMemo3) && Objects.equals(oDoQualityProcess, that.oDoQualityProcess) && Objects.equals(oCheckerDt, that.oCheckerDt) && Objects.equals(oEmemo, that.oEmemo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oCode, oDate, oCustbillcode, oUser, oTargetdate, oInvokind, oHastax, oDetailamt, oTaxamt, oTotamt, oEarnest, oMemo, oInvalid, oOver, updatedt, islocked, lockedid, oDeliveryAddr, oSubCustid, oType, oCoderefer, oBilldate, oBillyymm, oReccode, accVounotemp, accVouno, accNeed2Voutemp, oIscase, compid, oInna, oShapespec, oBomno, oMakeno, oSalesperson, oSumweight, oTotalweightDecimal, oMemo2, oNotaxamt, oDelivery, oAssistantid, oCustbilldate, oPlanyymm, oCyid, oCyrate, oCyamt, oProcessmemo, oProcesssort, oCorrelationfile, oChecker, oMemo3, oDoQualityProcess, oCheckerDt, oEmemo);
    }
}
