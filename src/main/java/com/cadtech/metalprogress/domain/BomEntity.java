package com.cadtech.metalprogress.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "bom")
public class BomEntity {
    private int bId;
    private int bProdid;
    private BigDecimal bQty;
    private int bParentBomId;
    private String bDescription;
    private Integer bFineno;
    private BigDecimal bPrice;
    private Integer bPriceId;
    private Integer bProcessId;
    private String bProcess;
    private String bMaterial;
    private BigDecimal bWidth;
    private String bMfrDetail;
    private String bSurface;
    private String bPicFileName;
    private String bColor;
    private int bStandBuildTime;
    private String bMaincolor;
    private Boolean bIsPointweld;
    private char bIsProd;
    private char bIsAttach;
    private Boolean bIsMrp;
    private Boolean bIsFetchDraw;
    private String bNote1;
    private String bNote2;
    private String bNote3;
    private String bNote4;
    private String bNote5;
    private String bNote6;
    private String bNote7;
    private String bNote8;
    private String bNote9;
    private String bNote10;
    private String bReqProcess;
    private boolean bIsMaterial;

    @Id
    @Column(name = "b_id", nullable = false)
    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    @Basic
    @Column(name = "b_prodid", nullable = false)
    public int getbProdid() {
        return bProdid;
    }

    public void setbProdid(int bProdid) {
        this.bProdid = bProdid;
    }

    @Basic
    @Column(name = "b_qty", nullable = false, precision = 4)
    public BigDecimal getbQty() {
        return bQty;
    }

    public void setbQty(BigDecimal bQty) {
        this.bQty = bQty;
    }

    @Basic
    @Column(name = "b_parentBomId", nullable = false)
    public int getbParentBomId() {
        return bParentBomId;
    }

    public void setbParentBomId(int bParentBomId) {
        this.bParentBomId = bParentBomId;
    }

    @Basic
    @Column(name = "b_description", nullable = true, length = 100)
    public String getbDescription() {
        return bDescription;
    }

    public void setbDescription(String bDescription) {
        this.bDescription = bDescription;
    }

    @Basic
    @Column(name = "b_fineno", nullable = true)
    public Integer getbFineno() {
        return bFineno;
    }

    public void setbFineno(Integer bFineno) {
        this.bFineno = bFineno;
    }

    @Basic
    @Column(name = "b_price", nullable = false, precision = 4)
    public BigDecimal getbPrice() {
        return bPrice;
    }

    public void setbPrice(BigDecimal bPrice) {
        this.bPrice = bPrice;
    }

    @Basic
    @Column(name = "b_priceID", nullable = true)
    public Integer getbPriceId() {
        return bPriceId;
    }

    public void setbPriceId(Integer bPriceId) {
        this.bPriceId = bPriceId;
    }

    @Basic
    @Column(name = "b_processID", nullable = true)
    public Integer getbProcessId() {
        return bProcessId;
    }

    public void setbProcessId(Integer bProcessId) {
        this.bProcessId = bProcessId;
    }

    @Basic
    @Column(name = "b_process", nullable = true, length = 400)
    public String getbProcess() {
        return bProcess;
    }

    public void setbProcess(String bProcess) {
        this.bProcess = bProcess;
    }

    @Basic
    @Column(name = "b_material", nullable = true, length = 50)
    public String getbMaterial() {
        return bMaterial;
    }

    public void setbMaterial(String bMaterial) {
        this.bMaterial = bMaterial;
    }

    @Basic
    @Column(name = "b_width", nullable = true, precision = 2)
    public BigDecimal getbWidth() {
        return bWidth;
    }

    public void setbWidth(BigDecimal bWidth) {
        this.bWidth = bWidth;
    }

    @Basic
    @Column(name = "b_MfrDetail", nullable = true, length = 400)
    public String getbMfrDetail() {
        return bMfrDetail;
    }

    public void setbMfrDetail(String bMfrDetail) {
        this.bMfrDetail = bMfrDetail;
    }

    @Basic
    @Column(name = "b_Surface", nullable = true, length = 400)
    public String getbSurface() {
        return bSurface;
    }

    public void setbSurface(String bSurface) {
        this.bSurface = bSurface;
    }

    @Basic
    @Column(name = "b_PicFileName", nullable = true, length = 200)
    public String getbPicFileName() {
        return bPicFileName;
    }

    public void setbPicFileName(String bPicFileName) {
        this.bPicFileName = bPicFileName;
    }

    @Basic
    @Column(name = "b_color", nullable = true, length = 100)
    public String getbColor() {
        return bColor;
    }

    public void setbColor(String bColor) {
        this.bColor = bColor;
    }

    @Basic
    @Column(name = "b_standBuildTime", nullable = false)
    public int getbStandBuildTime() {
        return bStandBuildTime;
    }

    public void setbStandBuildTime(int bStandBuildTime) {
        this.bStandBuildTime = bStandBuildTime;
    }

    @Basic
    @Column(name = "b_maincolor", nullable = true, length = 60)
    public String getbMaincolor() {
        return bMaincolor;
    }

    public void setbMaincolor(String bMaincolor) {
        this.bMaincolor = bMaincolor;
    }

    @Basic
    @Column(name = "b_isPointweld", nullable = true)
    public Boolean getbIsPointweld() {
        return bIsPointweld;
    }

    public void setbIsPointweld(Boolean bIsPointweld) {
        this.bIsPointweld = bIsPointweld;
    }

    @Basic
//    @Type(type = "char")
    @Column(name = "b_isProd", nullable = true, length = 1)
    public char getbIsProd() {
        return bIsProd;
    }

    public void setbIsProd(char bIsProd) {
        this.bIsProd = bIsProd;
    }

    @Basic
//    @Type(type = "char")
    @Column(name = "b_isAttach", nullable = true, length = 1)
    public char getbIsAttach() {
        return bIsAttach;
    }

    public void setbIsAttach(char bIsAttach) {
        this.bIsAttach = bIsAttach;
    }

    @Basic
    @Column(name = "b_isMRP", nullable = true)
    public Boolean getbIsMrp() {
        return bIsMrp;
    }

    public void setbIsMrp(Boolean bIsMrp) {
        this.bIsMrp = bIsMrp;
    }

    @Basic
    @Column(name = "b_isFetchDraw", nullable = true)
    public Boolean getbIsFetchDraw() {
        return bIsFetchDraw;
    }

    public void setbIsFetchDraw(Boolean bIsFetchDraw) {
        this.bIsFetchDraw = bIsFetchDraw;
    }

    @Basic
    @Column(name = "b_note1", nullable = true, length = 2000)
    public String getbNote1() {
        return bNote1;
    }

    public void setbNote1(String bNote1) {
        this.bNote1 = bNote1;
    }

    @Basic
    @Column(name = "b_note2", nullable = true, length = 2000)
    public String getbNote2() {
        return bNote2;
    }

    public void setbNote2(String bNote2) {
        this.bNote2 = bNote2;
    }

    @Basic
    @Column(name = "b_note3", nullable = true, length = 2000)
    public String getbNote3() {
        return bNote3;
    }

    public void setbNote3(String bNote3) {
        this.bNote3 = bNote3;
    }

    @Basic
    @Column(name = "b_note4", nullable = true, length = 2000)
    public String getbNote4() {
        return bNote4;
    }

    public void setbNote4(String bNote4) {
        this.bNote4 = bNote4;
    }

    @Basic
    @Column(name = "b_note5", nullable = true, length = 2000)
    public String getbNote5() {
        return bNote5;
    }

    public void setbNote5(String bNote5) {
        this.bNote5 = bNote5;
    }

    @Basic
    @Column(name = "b_note6", nullable = true, length = 2000)
    public String getbNote6() {
        return bNote6;
    }

    public void setbNote6(String bNote6) {
        this.bNote6 = bNote6;
    }

    @Basic
    @Column(name = "b_note7", nullable = true, length = 2000)
    public String getbNote7() {
        return bNote7;
    }

    public void setbNote7(String bNote7) {
        this.bNote7 = bNote7;
    }

    @Basic
    @Column(name = "b_note8", nullable = true, length = 2000)
    public String getbNote8() {
        return bNote8;
    }

    public void setbNote8(String bNote8) {
        this.bNote8 = bNote8;
    }

    @Basic
    @Column(name = "b_note9", nullable = true, length = 2000)
    public String getbNote9() {
        return bNote9;
    }

    public void setbNote9(String bNote9) {
        this.bNote9 = bNote9;
    }

    @Basic
    @Column(name = "b_note10", nullable = true, length = 2000)
    public String getbNote10() {
        return bNote10;
    }

    public void setbNote10(String bNote10) {
        this.bNote10 = bNote10;
    }

    @Basic
    @Column(name = "b_reqProcess", nullable = true, length = 20)
    public String getbReqProcess() {
        return bReqProcess;
    }

    public void setbReqProcess(String bReqProcess) {
        this.bReqProcess = bReqProcess;
    }

    @Basic
    @Column(name = "b_isMaterial", nullable = false)
    public boolean isbIsMaterial() {
        return bIsMaterial;
    }

    public void setbIsMaterial(boolean bIsMaterial) {
        this.bIsMaterial = bIsMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomEntity bomEntity = (BomEntity) o;
        return bId == bomEntity.bId && bProdid == bomEntity.bProdid && bParentBomId == bomEntity.bParentBomId && bStandBuildTime == bomEntity.bStandBuildTime && bIsMaterial == bomEntity.bIsMaterial && Objects.equals(bQty, bomEntity.bQty) && Objects.equals(bDescription, bomEntity.bDescription) && Objects.equals(bFineno, bomEntity.bFineno) && Objects.equals(bPrice, bomEntity.bPrice) && Objects.equals(bPriceId, bomEntity.bPriceId) && Objects.equals(bProcessId, bomEntity.bProcessId) && Objects.equals(bProcess, bomEntity.bProcess) && Objects.equals(bMaterial, bomEntity.bMaterial) && Objects.equals(bWidth, bomEntity.bWidth) && Objects.equals(bMfrDetail, bomEntity.bMfrDetail) && Objects.equals(bSurface, bomEntity.bSurface) && Objects.equals(bPicFileName, bomEntity.bPicFileName) && Objects.equals(bColor, bomEntity.bColor) && Objects.equals(bMaincolor, bomEntity.bMaincolor) && Objects.equals(bIsPointweld, bomEntity.bIsPointweld) && Objects.equals(bIsProd, bomEntity.bIsProd) && Objects.equals(bIsAttach, bomEntity.bIsAttach) && Objects.equals(bIsMrp, bomEntity.bIsMrp) && Objects.equals(bIsFetchDraw, bomEntity.bIsFetchDraw) && Objects.equals(bNote1, bomEntity.bNote1) && Objects.equals(bNote2, bomEntity.bNote2) && Objects.equals(bNote3, bomEntity.bNote3) && Objects.equals(bNote4, bomEntity.bNote4) && Objects.equals(bNote5, bomEntity.bNote5) && Objects.equals(bNote6, bomEntity.bNote6) && Objects.equals(bNote7, bomEntity.bNote7) && Objects.equals(bNote8, bomEntity.bNote8) && Objects.equals(bNote9, bomEntity.bNote9) && Objects.equals(bNote10, bomEntity.bNote10) && Objects.equals(bReqProcess, bomEntity.bReqProcess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bId, bProdid, bQty, bParentBomId, bDescription, bFineno, bPrice, bPriceId, bProcessId, bProcess, bMaterial, bWidth, bMfrDetail, bSurface, bPicFileName, bColor, bStandBuildTime, bMaincolor, bIsPointweld, bIsProd, bIsAttach, bIsMrp, bIsFetchDraw, bNote1, bNote2, bNote3, bNote4, bNote5, bNote6, bNote7, bNote8, bNote9, bNote10, bReqProcess, bIsMaterial);
    }
}
