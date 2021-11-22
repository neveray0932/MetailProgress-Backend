package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "MakeOrderProcess")
public class MakeOrderProcessEntity {
    private char mpBarcode;
    private short mpItemno;
    private String mpSeq;
    private String mpMethod;
    private String mpDepartment;
    private String mpProcess;
    private BigDecimal mpMakedqty;
    private BigDecimal mpBeqty;
    private int mpId;
    private BigDecimal mpTypesetqty;
    private BigDecimal mpReqQty;
    private BigDecimal mpStockqty;
    private boolean mpOver;
    private int mpSortondepart;
    private Timestamp mpDueDay;
    private String mpMemo;
    private String mpMac;
    private BigDecimal mpAssignedQty;
    private Timestamp mpStarttime;
    private Timestamp mpEndtime;
    private Integer mpStatus;
    private String mpMachineno;
    private boolean mpIsready;
    private BigDecimal mpUsedqtynextp;
    private BigDecimal mpBadqty;
    private Timestamp mpStartDay;

    private MakeOrderDetailEntity makeOrderDetailEntity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "mp_MODid")
    public MakeOrderDetailEntity getMakeOrderDetailEntity() {
        return makeOrderDetailEntity;
    }

    public void setMakeOrderDetailEntity(MakeOrderDetailEntity makeOrderDetailEntity) {
        this.makeOrderDetailEntity = makeOrderDetailEntity;
    }

    @Basic

    @Column(name = "mp_barcode", nullable = false, length = 10)
    public char getMpBarcode() {
        return mpBarcode;
    }

    public void setMpBarcode(char mpBarcode) {
        this.mpBarcode = mpBarcode;
    }

    @Basic
    @Column(name = "mp_itemno", nullable = false)
    public short getMpItemno() {
        return mpItemno;
    }

    public void setMpItemno(short mpItemno) {
        this.mpItemno = mpItemno;
    }

    @Basic
    @Column(name = "mp_seq", nullable = true, length = 100)
    public String getMpSeq() {
        return mpSeq;
    }

    public void setMpSeq(String mpSeq) {
        this.mpSeq = mpSeq;
    }

    @Basic
    @Column(name = "mp_method", nullable = false, length = 10)
    public String getMpMethod() {
        return mpMethod;
    }

    public void setMpMethod(String mpMethod) {
        this.mpMethod = mpMethod;
    }

    @Basic
    @Column(name = "mp_department", nullable = false, length = 20)
    public String getMpDepartment() {
        return mpDepartment;
    }

    public void setMpDepartment(String mpDepartment) {
        this.mpDepartment = mpDepartment;
    }

    @Basic
    @Column(name = "mp_process", nullable = false, length = 29)
    public String getMpProcess() {
        return mpProcess;
    }

    public void setMpProcess(String mpProcess) {
        this.mpProcess = mpProcess;
    }

    @Basic
    @Column(name = "mp_makedqty", nullable = true, precision = 4)
    public BigDecimal getMpMakedqty() {
        return mpMakedqty;
    }

    public void setMpMakedqty(BigDecimal mpMakedqty) {
        this.mpMakedqty = mpMakedqty;
    }

    @Basic
    @Column(name = "mp_beqty", nullable = true, precision = 4)
    public BigDecimal getMpBeqty() {
        return mpBeqty;
    }

    public void setMpBeqty(BigDecimal mpBeqty) {
        this.mpBeqty = mpBeqty;
    }

    @Id
    @Column(name = "mp_id", nullable = false)
    public int getMpId() {
        return mpId;
    }

    public void setMpId(int mpId) {
        this.mpId = mpId;
    }

    @Basic
    @Column(name = "mp_typesetqty", nullable = true, precision = 4)
    public BigDecimal getMpTypesetqty() {
        return mpTypesetqty;
    }

    public void setMpTypesetqty(BigDecimal mpTypesetqty) {
        this.mpTypesetqty = mpTypesetqty;
    }

    @Basic
    @Column(name = "mp_req_qty", nullable = true, precision = 4)
    public BigDecimal getMpReqQty() {
        return mpReqQty;
    }

    public void setMpReqQty(BigDecimal mpReqQty) {
        this.mpReqQty = mpReqQty;
    }

    @Basic
    @Column(name = "mp_stockqty", nullable = true, precision = 4)
    public BigDecimal getMpStockqty() {
        return mpStockqty;
    }

    public void setMpStockqty(BigDecimal mpStockqty) {
        this.mpStockqty = mpStockqty;
    }

    @Basic
    @Column(name = "mp_over", nullable = false)
    public boolean isMpOver() {
        return mpOver;
    }

    public void setMpOver(boolean mpOver) {
        this.mpOver = mpOver;
    }

    @Basic
    @Column(name = "mp_sortondepart", nullable = false)
    public int getMpSortondepart() {
        return mpSortondepart;
    }

    public void setMpSortondepart(int mpSortondepart) {
        this.mpSortondepart = mpSortondepart;
    }

    @Basic
    @Column(name = "mp_dueDay", nullable = true)
    public Timestamp getMpDueDay() {
        return mpDueDay;
    }

    public void setMpDueDay(Timestamp mpDueDay) {
        this.mpDueDay = mpDueDay;
    }

    @Basic
    @Column(name = "mp_memo", nullable = true, length = 200)
    public String getMpMemo() {
        return mpMemo;
    }

    public void setMpMemo(String mpMemo) {
        this.mpMemo = mpMemo;
    }

    @Basic
    @Column(name = "mp_mac", nullable = true, length = 10)
    public String getMpMac() {
        return mpMac;
    }

    public void setMpMac(String mpMac) {
        this.mpMac = mpMac;
    }

    @Basic
    @Column(name = "mp_AssignedQty", nullable = false, precision = 2)
    public BigDecimal getMpAssignedQty() {
        return mpAssignedQty;
    }

    public void setMpAssignedQty(BigDecimal mpAssignedQty) {
        this.mpAssignedQty = mpAssignedQty;
    }

    @Basic
    @Column(name = "mp_starttime", nullable = true)
    public Timestamp getMpStarttime() {
        return mpStarttime;
    }

    public void setMpStarttime(Timestamp mpStarttime) {
        this.mpStarttime = mpStarttime;
    }

    @Basic
    @Column(name = "mp_endtime", nullable = true)
    public Timestamp getMpEndtime() {
        return mpEndtime;
    }

    public void setMpEndtime(Timestamp mpEndtime) {
        this.mpEndtime = mpEndtime;
    }

    @Basic
    @Column(name = "mp_status", nullable = true)
    public Integer getMpStatus() {
        return mpStatus;
    }

    public void setMpStatus(Integer mpStatus) {
        this.mpStatus = mpStatus;
    }

    @Basic
    @Column(name = "mp_machineno", nullable = true, length = 20)
    public String getMpMachineno() {
        return mpMachineno;
    }

    public void setMpMachineno(String mpMachineno) {
        this.mpMachineno = mpMachineno;
    }

    @Basic
    @Column(name = "mp_isready", nullable = false)
    public boolean isMpIsready() {
        return mpIsready;
    }

    public void setMpIsready(boolean mpIsready) {
        this.mpIsready = mpIsready;
    }

    @Basic
    @Column(name = "mp_usedqtynextp", nullable = false, precision = 2)
    public BigDecimal getMpUsedqtynextp() {
        return mpUsedqtynextp;
    }

    public void setMpUsedqtynextp(BigDecimal mpUsedqtynextp) {
        this.mpUsedqtynextp = mpUsedqtynextp;
    }

    @Basic
    @Column(name = "mp_badqty", nullable = true, precision = 2)
    public BigDecimal getMpBadqty() {
        return mpBadqty;
    }

    public void setMpBadqty(BigDecimal mpBadqty) {
        this.mpBadqty = mpBadqty;
    }

    @Basic
    @Column(name = "mp_startDay", nullable = true)
    public Timestamp getMpStartDay() {
        return mpStartDay;
    }

    public void setMpStartDay(Timestamp mpStartDay) {
        this.mpStartDay = mpStartDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MakeOrderProcessEntity that = (MakeOrderProcessEntity) o;
        return mpItemno == that.mpItemno && mpId == that.mpId && mpOver == that.mpOver && mpSortondepart == that.mpSortondepart && mpIsready == that.mpIsready && Objects.equals(mpBarcode, that.mpBarcode) && Objects.equals(mpSeq, that.mpSeq) && Objects.equals(mpMethod, that.mpMethod) && Objects.equals(mpDepartment, that.mpDepartment) && Objects.equals(mpProcess, that.mpProcess) && Objects.equals(mpMakedqty, that.mpMakedqty) && Objects.equals(mpBeqty, that.mpBeqty) && Objects.equals(mpTypesetqty, that.mpTypesetqty) && Objects.equals(mpReqQty, that.mpReqQty) && Objects.equals(mpStockqty, that.mpStockqty) && Objects.equals(mpDueDay, that.mpDueDay) && Objects.equals(mpMemo, that.mpMemo) && Objects.equals(mpMac, that.mpMac) && Objects.equals(mpAssignedQty, that.mpAssignedQty) && Objects.equals(mpStarttime, that.mpStarttime) && Objects.equals(mpEndtime, that.mpEndtime) && Objects.equals(mpStatus, that.mpStatus) && Objects.equals(mpMachineno, that.mpMachineno) && Objects.equals(mpUsedqtynextp, that.mpUsedqtynextp) && Objects.equals(mpBadqty, that.mpBadqty) && Objects.equals(mpStartDay, that.mpStartDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mpBarcode, mpItemno, mpSeq, mpMethod, mpDepartment, mpProcess, mpMakedqty, mpBeqty, mpId, mpTypesetqty, mpReqQty, mpStockqty, mpOver, mpSortondepart, mpDueDay, mpMemo, mpMac, mpAssignedQty, mpStarttime, mpEndtime, mpStatus, mpMachineno, mpIsready, mpUsedqtynextp, mpBadqty, mpStartDay);
    }
}
