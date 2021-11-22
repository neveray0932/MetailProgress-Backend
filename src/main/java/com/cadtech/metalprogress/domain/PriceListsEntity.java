package com.cadtech.metalprogress.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "PriceLists")
public class PriceListsEntity {
    private int plId;
    private BigDecimal plMaterialPrice;
    private boolean plIsMaterial;
    private BigDecimal plLaserPrice;
    private BigDecimal plTotalLength;
    private BigDecimal plTotalLengthPrice;
    private BigDecimal plHole;
    private BigDecimal plHolePrice;
    private BigDecimal plDrawLine;
    private BigDecimal plDrawLinePrice;
    private BigDecimal plPoint;
    private BigDecimal plPointPrice;
    private BigDecimal plPressHolePrices;
    private BigDecimal plPressHoleNums;
    private BigDecimal plPressHolePrice;
    private BigDecimal plBendPrices;
    private BigDecimal plToBend;
    private BigDecimal plToBendPrice;
    private BigDecimal plBendPrice;
    private BigDecimal plTappuPrices;
    private BigDecimal plTappu;
    private BigDecimal plTappuPrice;
    private BigDecimal plMfrProcessPrices;
    private BigDecimal plLaserDscctn;
    private BigDecimal plBendDsctn;
    private BigDecimal plPressHoleDsctn;
    private BigDecimal plBakePrice;
    private BigDecimal plElectrolyzePrice;
    private BigDecimal plGalvanizePrice;
    private BigDecimal plOtherPrice;
    private BigDecimal plWeldPrice;
    private BigDecimal plColorPirce;
    private BigDecimal plQtyPrices;
    private BigDecimal plQtyPrice;
    private BigDecimal plQty;
    private BigDecimal plWeighPrices;
    private BigDecimal plWeighPrice;
    private BigDecimal plWeigh;
    private String plType;
    private BigDecimal plTotal;
    private BigDecimal plLength;
    private BigDecimal plHeight;
    private BigDecimal plMaterialPrices;
    private BigDecimal plWidth;
    private BigDecimal plMaterialParameter;
    private String plDsctnNum;
    private Integer plKind;
    private BigDecimal plOtherPrice1;
    private BigDecimal plOtherPrice2;
    private BigDecimal plOtherPrice3;
    private BigDecimal plOtherPrice4;
    private BigDecimal plOtherPrice5;
    private BigDecimal plOtherPrice6;
    private BigDecimal plPressHoleDia;
    private String plMaterial;
    private boolean plIslaserDscctn;
    private boolean plIsBendDsctn;
    private boolean plIsPressHoleDsctn;
    private BigDecimal plOutlineArea;
    private BigDecimal plInnerholeArea;
    private BigDecimal plOutlineWeigh;
    private BigDecimal plInnerholeWeigh;
    private BigDecimal plFirePrice;
    private Integer plPriceUnit;
    private BigDecimal plMultiply;
    private BigDecimal plRealWeigh;
    private BigDecimal plFrameWeigh;
    private BigDecimal plLaserPriceDsc;
    private BigDecimal plBendPricesDsc;
    private BigDecimal plPressHolePricesDsc;
    private BigDecimal plOtherPrice7;
    private BigDecimal plOtherPrice8;
    private BigDecimal plOtherPrice9;
    private BigDecimal plOtherPrice10;
    private BigDecimal plOtherPrice11;
    private BigDecimal plOtherPrice12;
    private Integer plWeighkind;
    private BigDecimal plPreferentialholeprice;
    private BigDecimal plTotalLengthPriceDsctn;
    private BigDecimal plTotalLengthPriceDsc;
    private BigDecimal plCustdiscount;
    private BigDecimal qty;
    private BigDecimal plRadius;
    private BigDecimal plWeighNoround;
    private BigDecimal plVcut;
    private BigDecimal plVcutPrice;
    private BigDecimal plVcutPrices;

    @Id
    @Column(name = "pl_id", nullable = false)
    public int getPlId() {
        return plId;
    }

    public void setPlId(int plId) {
        this.plId = plId;
    }

    @Basic
    @Column(name = "pl_MaterialPrice", nullable = false, precision = 4)
    public BigDecimal getPlMaterialPrice() {
        return plMaterialPrice;
    }

    public void setPlMaterialPrice(BigDecimal plMaterialPrice) {
        this.plMaterialPrice = plMaterialPrice;
    }

    @Basic
    @Column(name = "pl_isMaterial", nullable = false)
    public boolean isPlIsMaterial() {
        return plIsMaterial;
    }

    public void setPlIsMaterial(boolean plIsMaterial) {
        this.plIsMaterial = plIsMaterial;
    }

    @Basic
    @Column(name = "pl_laserPrice", nullable = false, precision = 4)
    public BigDecimal getPlLaserPrice() {
        return plLaserPrice;
    }

    public void setPlLaserPrice(BigDecimal plLaserPrice) {
        this.plLaserPrice = plLaserPrice;
    }

    @Basic
    @Column(name = "pl_TotalLength", nullable = false, precision = 4)
    public BigDecimal getPlTotalLength() {
        return plTotalLength;
    }

    public void setPlTotalLength(BigDecimal plTotalLength) {
        this.plTotalLength = plTotalLength;
    }

    @Basic
    @Column(name = "pl_TotalLengthPrice", nullable = false, precision = 4)
    public BigDecimal getPlTotalLengthPrice() {
        return plTotalLengthPrice;
    }

    public void setPlTotalLengthPrice(BigDecimal plTotalLengthPrice) {
        this.plTotalLengthPrice = plTotalLengthPrice;
    }

    @Basic
    @Column(name = "pl_Hole", nullable = false, precision = 4)
    public BigDecimal getPlHole() {
        return plHole;
    }

    public void setPlHole(BigDecimal plHole) {
        this.plHole = plHole;
    }

    @Basic
    @Column(name = "pl_HolePrice", nullable = false, precision = 4)
    public BigDecimal getPlHolePrice() {
        return plHolePrice;
    }

    public void setPlHolePrice(BigDecimal plHolePrice) {
        this.plHolePrice = plHolePrice;
    }

    @Basic
    @Column(name = "pl_DrawLine", nullable = false, precision = 4)
    public BigDecimal getPlDrawLine() {
        return plDrawLine;
    }

    public void setPlDrawLine(BigDecimal plDrawLine) {
        this.plDrawLine = plDrawLine;
    }

    @Basic
    @Column(name = "pl_DrawLinePrice", nullable = false, precision = 4)
    public BigDecimal getPlDrawLinePrice() {
        return plDrawLinePrice;
    }

    public void setPlDrawLinePrice(BigDecimal plDrawLinePrice) {
        this.plDrawLinePrice = plDrawLinePrice;
    }

    @Basic
    @Column(name = "pl_Point", nullable = false, precision = 4)
    public BigDecimal getPlPoint() {
        return plPoint;
    }

    public void setPlPoint(BigDecimal plPoint) {
        this.plPoint = plPoint;
    }

    @Basic
    @Column(name = "pl_PointPrice", nullable = false, precision = 4)
    public BigDecimal getPlPointPrice() {
        return plPointPrice;
    }

    public void setPlPointPrice(BigDecimal plPointPrice) {
        this.plPointPrice = plPointPrice;
    }

    @Basic
    @Column(name = "pl_PressHolePrices", nullable = false, precision = 4)
    public BigDecimal getPlPressHolePrices() {
        return plPressHolePrices;
    }

    public void setPlPressHolePrices(BigDecimal plPressHolePrices) {
        this.plPressHolePrices = plPressHolePrices;
    }

    @Basic
    @Column(name = "pl_PressHoleNums", nullable = false, precision = 4)
    public BigDecimal getPlPressHoleNums() {
        return plPressHoleNums;
    }

    public void setPlPressHoleNums(BigDecimal plPressHoleNums) {
        this.plPressHoleNums = plPressHoleNums;
    }

    @Basic
    @Column(name = "pl_PressHolePrice", nullable = false, precision = 4)
    public BigDecimal getPlPressHolePrice() {
        return plPressHolePrice;
    }

    public void setPlPressHolePrice(BigDecimal plPressHolePrice) {
        this.plPressHolePrice = plPressHolePrice;
    }

    @Basic
    @Column(name = "pl_BendPrices", nullable = false, precision = 4)
    public BigDecimal getPlBendPrices() {
        return plBendPrices;
    }

    public void setPlBendPrices(BigDecimal plBendPrices) {
        this.plBendPrices = plBendPrices;
    }

    @Basic
    @Column(name = "pl_toBend", nullable = false, precision = 4)
    public BigDecimal getPlToBend() {
        return plToBend;
    }

    public void setPlToBend(BigDecimal plToBend) {
        this.plToBend = plToBend;
    }

    @Basic
    @Column(name = "pl_toBendPrice", nullable = false, precision = 4)
    public BigDecimal getPlToBendPrice() {
        return plToBendPrice;
    }

    public void setPlToBendPrice(BigDecimal plToBendPrice) {
        this.plToBendPrice = plToBendPrice;
    }

    @Basic
    @Column(name = "pl_BendPrice", nullable = false, precision = 4)
    public BigDecimal getPlBendPrice() {
        return plBendPrice;
    }

    public void setPlBendPrice(BigDecimal plBendPrice) {
        this.plBendPrice = plBendPrice;
    }

    @Basic
    @Column(name = "pl_TappuPrices", nullable = false, precision = 4)
    public BigDecimal getPlTappuPrices() {
        return plTappuPrices;
    }

    public void setPlTappuPrices(BigDecimal plTappuPrices) {
        this.plTappuPrices = plTappuPrices;
    }

    @Basic
    @Column(name = "pl_tappu", nullable = false, precision = 4)
    public BigDecimal getPlTappu() {
        return plTappu;
    }

    public void setPlTappu(BigDecimal plTappu) {
        this.plTappu = plTappu;
    }

    @Basic
    @Column(name = "pl_TappuPrice", nullable = false, precision = 4)
    public BigDecimal getPlTappuPrice() {
        return plTappuPrice;
    }

    public void setPlTappuPrice(BigDecimal plTappuPrice) {
        this.plTappuPrice = plTappuPrice;
    }

    @Basic
    @Column(name = "pl_MfrProcessPrices", nullable = false, precision = 4)
    public BigDecimal getPlMfrProcessPrices() {
        return plMfrProcessPrices;
    }

    public void setPlMfrProcessPrices(BigDecimal plMfrProcessPrices) {
        this.plMfrProcessPrices = plMfrProcessPrices;
    }

    @Basic
    @Column(name = "pl_laserDscctn", nullable = false, precision = 4)
    public BigDecimal getPlLaserDscctn() {
        return plLaserDscctn;
    }

    public void setPlLaserDscctn(BigDecimal plLaserDscctn) {
        this.plLaserDscctn = plLaserDscctn;
    }

    @Basic
    @Column(name = "pl_BendDsctn", nullable = false, precision = 4)
    public BigDecimal getPlBendDsctn() {
        return plBendDsctn;
    }

    public void setPlBendDsctn(BigDecimal plBendDsctn) {
        this.plBendDsctn = plBendDsctn;
    }

    @Basic
    @Column(name = "pl_PressHoleDsctn", nullable = false, precision = 4)
    public BigDecimal getPlPressHoleDsctn() {
        return plPressHoleDsctn;
    }

    public void setPlPressHoleDsctn(BigDecimal plPressHoleDsctn) {
        this.plPressHoleDsctn = plPressHoleDsctn;
    }

    @Basic
    @Column(name = "pl_bakePrice", nullable = false, precision = 4)
    public BigDecimal getPlBakePrice() {
        return plBakePrice;
    }

    public void setPlBakePrice(BigDecimal plBakePrice) {
        this.plBakePrice = plBakePrice;
    }

    @Basic
    @Column(name = "pl_electrolyzePrice", nullable = false, precision = 4)
    public BigDecimal getPlElectrolyzePrice() {
        return plElectrolyzePrice;
    }

    public void setPlElectrolyzePrice(BigDecimal plElectrolyzePrice) {
        this.plElectrolyzePrice = plElectrolyzePrice;
    }

    @Basic
    @Column(name = "pl_galvanizePrice", nullable = false, precision = 4)
    public BigDecimal getPlGalvanizePrice() {
        return plGalvanizePrice;
    }

    public void setPlGalvanizePrice(BigDecimal plGalvanizePrice) {
        this.plGalvanizePrice = plGalvanizePrice;
    }

    @Basic
    @Column(name = "pl_otherPrice", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice() {
        return plOtherPrice;
    }

    public void setPlOtherPrice(BigDecimal plOtherPrice) {
        this.plOtherPrice = plOtherPrice;
    }

    @Basic
    @Column(name = "pl_weldPrice", nullable = false, precision = 4)
    public BigDecimal getPlWeldPrice() {
        return plWeldPrice;
    }

    public void setPlWeldPrice(BigDecimal plWeldPrice) {
        this.plWeldPrice = plWeldPrice;
    }

    @Basic
    @Column(name = "pl_colorPirce", nullable = false, precision = 4)
    public BigDecimal getPlColorPirce() {
        return plColorPirce;
    }

    public void setPlColorPirce(BigDecimal plColorPirce) {
        this.plColorPirce = plColorPirce;
    }

    @Basic
    @Column(name = "pl_QtyPrices", nullable = false, precision = 4)
    public BigDecimal getPlQtyPrices() {
        return plQtyPrices;
    }

    public void setPlQtyPrices(BigDecimal plQtyPrices) {
        this.plQtyPrices = plQtyPrices;
    }

    @Basic
    @Column(name = "pl_QtyPrice", nullable = false, precision = 4)
    public BigDecimal getPlQtyPrice() {
        return plQtyPrice;
    }

    public void setPlQtyPrice(BigDecimal plQtyPrice) {
        this.plQtyPrice = plQtyPrice;
    }

    @Basic
    @Column(name = "pl_Qty", nullable = false, precision = 4)
    public BigDecimal getPlQty() {
        return plQty;
    }

    public void setPlQty(BigDecimal plQty) {
        this.plQty = plQty;
    }

    @Basic
    @Column(name = "pl_weighPrices", nullable = false, precision = 4)
    public BigDecimal getPlWeighPrices() {
        return plWeighPrices;
    }

    public void setPlWeighPrices(BigDecimal plWeighPrices) {
        this.plWeighPrices = plWeighPrices;
    }

    @Basic
    @Column(name = "pl_WeighPrice", nullable = false, precision = 4)
    public BigDecimal getPlWeighPrice() {
        return plWeighPrice;
    }

    public void setPlWeighPrice(BigDecimal plWeighPrice) {
        this.plWeighPrice = plWeighPrice;
    }

    @Basic
    @Column(name = "pl_weigh", nullable = false, precision = 4)
    public BigDecimal getPlWeigh() {
        return plWeigh;
    }

    public void setPlWeigh(BigDecimal plWeigh) {
        this.plWeigh = plWeigh;
    }

    @Basic
    @Type(type = "char")
    @Column(name = "pl_type", nullable = true, length = 1)
    public String getPlType() {
        return plType;
    }

    public void setPlType(String plType) {
        this.plType = plType;
    }

    @Basic
    @Column(name = "pl_total", nullable = false, precision = 4)
    public BigDecimal getPlTotal() {
        return plTotal;
    }

    public void setPlTotal(BigDecimal plTotal) {
        this.plTotal = plTotal;
    }

    @Basic
    @Column(name = "pl_length", nullable = true, precision = 4)
    public BigDecimal getPlLength() {
        return plLength;
    }

    public void setPlLength(BigDecimal plLength) {
        this.plLength = plLength;
    }

    @Basic
    @Column(name = "pl_height", nullable = true, precision = 4)
    public BigDecimal getPlHeight() {
        return plHeight;
    }

    public void setPlHeight(BigDecimal plHeight) {
        this.plHeight = plHeight;
    }

    @Basic
    @Column(name = "pl_MaterialPrices", nullable = true, precision = 4)
    public BigDecimal getPlMaterialPrices() {
        return plMaterialPrices;
    }

    public void setPlMaterialPrices(BigDecimal plMaterialPrices) {
        this.plMaterialPrices = plMaterialPrices;
    }

    @Basic
    @Column(name = "pl_width", nullable = true, precision = 4)
    public BigDecimal getPlWidth() {
        return plWidth;
    }

    public void setPlWidth(BigDecimal plWidth) {
        this.plWidth = plWidth;
    }

    @Basic
    @Column(name = "pl_materialParameter", nullable = true, precision = 4)
    public BigDecimal getPlMaterialParameter() {
        return plMaterialParameter;
    }

    public void setPlMaterialParameter(BigDecimal plMaterialParameter) {
        this.plMaterialParameter = plMaterialParameter;
    }

    @Basic
    @Column(name = "pl_dsctnNum", nullable = true, length = 50)
    public String getPlDsctnNum() {
        return plDsctnNum;
    }

    public void setPlDsctnNum(String plDsctnNum) {
        this.plDsctnNum = plDsctnNum;
    }

    @Basic
    @Column(name = "pl_kind", nullable = true)
    public Integer getPlKind() {
        return plKind;
    }

    public void setPlKind(Integer plKind) {
        this.plKind = plKind;
    }

    @Basic
    @Column(name = "pl_otherPrice1", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice1() {
        return plOtherPrice1;
    }

    public void setPlOtherPrice1(BigDecimal plOtherPrice1) {
        this.plOtherPrice1 = plOtherPrice1;
    }

    @Basic
    @Column(name = "pl_otherPrice2", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice2() {
        return plOtherPrice2;
    }

    public void setPlOtherPrice2(BigDecimal plOtherPrice2) {
        this.plOtherPrice2 = plOtherPrice2;
    }

    @Basic
    @Column(name = "pl_otherPrice3", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice3() {
        return plOtherPrice3;
    }

    public void setPlOtherPrice3(BigDecimal plOtherPrice3) {
        this.plOtherPrice3 = plOtherPrice3;
    }

    @Basic
    @Column(name = "pl_otherPrice4", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice4() {
        return plOtherPrice4;
    }

    public void setPlOtherPrice4(BigDecimal plOtherPrice4) {
        this.plOtherPrice4 = plOtherPrice4;
    }

    @Basic
    @Column(name = "pl_otherPrice5", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice5() {
        return plOtherPrice5;
    }

    public void setPlOtherPrice5(BigDecimal plOtherPrice5) {
        this.plOtherPrice5 = plOtherPrice5;
    }

    @Basic
    @Column(name = "pl_otherPrice6", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice6() {
        return plOtherPrice6;
    }

    public void setPlOtherPrice6(BigDecimal plOtherPrice6) {
        this.plOtherPrice6 = plOtherPrice6;
    }

    @Basic
    @Column(name = "pl_PressHoleDia", nullable = true, precision = 4)
    public BigDecimal getPlPressHoleDia() {
        return plPressHoleDia;
    }

    public void setPlPressHoleDia(BigDecimal plPressHoleDia) {
        this.plPressHoleDia = plPressHoleDia;
    }

    @Basic
    @Column(name = "pl_material", nullable = true, length = 10)
    public String getPlMaterial() {
        return plMaterial;
    }

    public void setPlMaterial(String plMaterial) {
        this.plMaterial = plMaterial;
    }

    @Basic
    @Column(name = "pl_islaserDscctn", nullable = false)
    public boolean isPlIslaserDscctn() {
        return plIslaserDscctn;
    }

    public void setPlIslaserDscctn(boolean plIslaserDscctn) {
        this.plIslaserDscctn = plIslaserDscctn;
    }

    @Basic
    @Column(name = "pl_isBendDsctn", nullable = false)
    public boolean isPlIsBendDsctn() {
        return plIsBendDsctn;
    }

    public void setPlIsBendDsctn(boolean plIsBendDsctn) {
        this.plIsBendDsctn = plIsBendDsctn;
    }

    @Basic
    @Column(name = "pl_isPressHoleDsctn", nullable = false)
    public boolean isPlIsPressHoleDsctn() {
        return plIsPressHoleDsctn;
    }

    public void setPlIsPressHoleDsctn(boolean plIsPressHoleDsctn) {
        this.plIsPressHoleDsctn = plIsPressHoleDsctn;
    }

    @Basic
    @Column(name = "pl_outlineArea", nullable = false, precision = 4)
    public BigDecimal getPlOutlineArea() {
        return plOutlineArea;
    }

    public void setPlOutlineArea(BigDecimal plOutlineArea) {
        this.plOutlineArea = plOutlineArea;
    }

    @Basic
    @Column(name = "pl_innerholeArea", nullable = false, precision = 4)
    public BigDecimal getPlInnerholeArea() {
        return plInnerholeArea;
    }

    public void setPlInnerholeArea(BigDecimal plInnerholeArea) {
        this.plInnerholeArea = plInnerholeArea;
    }

    @Basic
    @Column(name = "pl_outlineWeigh", nullable = false, precision = 4)
    public BigDecimal getPlOutlineWeigh() {
        return plOutlineWeigh;
    }

    public void setPlOutlineWeigh(BigDecimal plOutlineWeigh) {
        this.plOutlineWeigh = plOutlineWeigh;
    }

    @Basic
    @Column(name = "pl_innerholeWeigh", nullable = false, precision = 4)
    public BigDecimal getPlInnerholeWeigh() {
        return plInnerholeWeigh;
    }

    public void setPlInnerholeWeigh(BigDecimal plInnerholeWeigh) {
        this.plInnerholeWeigh = plInnerholeWeigh;
    }

    @Basic
    @Column(name = "pl_firePrice", nullable = false, precision = 4)
    public BigDecimal getPlFirePrice() {
        return plFirePrice;
    }

    public void setPlFirePrice(BigDecimal plFirePrice) {
        this.plFirePrice = plFirePrice;
    }

    @Basic
    @Column(name = "pl_priceUnit", nullable = true)
    public Integer getPlPriceUnit() {
        return plPriceUnit;
    }

    public void setPlPriceUnit(Integer plPriceUnit) {
        this.plPriceUnit = plPriceUnit;
    }

    @Basic
    @Column(name = "pl_multiply", nullable = true, precision = 4)
    public BigDecimal getPlMultiply() {
        return plMultiply;
    }

    public void setPlMultiply(BigDecimal plMultiply) {
        this.plMultiply = plMultiply;
    }

    @Basic
    @Column(name = "pl_realWeigh", nullable = true, precision = 4)
    public BigDecimal getPlRealWeigh() {
        return plRealWeigh;
    }

    public void setPlRealWeigh(BigDecimal plRealWeigh) {
        this.plRealWeigh = plRealWeigh;
    }

    @Basic
    @Column(name = "pl_FrameWeigh", nullable = true, precision = 4)
    public BigDecimal getPlFrameWeigh() {
        return plFrameWeigh;
    }

    public void setPlFrameWeigh(BigDecimal plFrameWeigh) {
        this.plFrameWeigh = plFrameWeigh;
    }

    @Basic
    @Column(name = "pl_laserPrice_dsc", nullable = true, precision = 4)
    public BigDecimal getPlLaserPriceDsc() {
        return plLaserPriceDsc;
    }

    public void setPlLaserPriceDsc(BigDecimal plLaserPriceDsc) {
        this.plLaserPriceDsc = plLaserPriceDsc;
    }

    @Basic
    @Column(name = "pl_BendPrices_dsc", nullable = true, precision = 4)
    public BigDecimal getPlBendPricesDsc() {
        return plBendPricesDsc;
    }

    public void setPlBendPricesDsc(BigDecimal plBendPricesDsc) {
        this.plBendPricesDsc = plBendPricesDsc;
    }

    @Basic
    @Column(name = "pl_PressHolePrices_dsc", nullable = true, precision = 4)
    public BigDecimal getPlPressHolePricesDsc() {
        return plPressHolePricesDsc;
    }

    public void setPlPressHolePricesDsc(BigDecimal plPressHolePricesDsc) {
        this.plPressHolePricesDsc = plPressHolePricesDsc;
    }

    @Basic
    @Column(name = "pl_otherPrice7", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice7() {
        return plOtherPrice7;
    }

    public void setPlOtherPrice7(BigDecimal plOtherPrice7) {
        this.plOtherPrice7 = plOtherPrice7;
    }

    @Basic
    @Column(name = "pl_otherPrice8", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice8() {
        return plOtherPrice8;
    }

    public void setPlOtherPrice8(BigDecimal plOtherPrice8) {
        this.plOtherPrice8 = plOtherPrice8;
    }

    @Basic
    @Column(name = "pl_otherPrice9", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice9() {
        return plOtherPrice9;
    }

    public void setPlOtherPrice9(BigDecimal plOtherPrice9) {
        this.plOtherPrice9 = plOtherPrice9;
    }

    @Basic
    @Column(name = "pl_otherPrice10", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice10() {
        return plOtherPrice10;
    }

    public void setPlOtherPrice10(BigDecimal plOtherPrice10) {
        this.plOtherPrice10 = plOtherPrice10;
    }

    @Basic
    @Column(name = "pl_otherPrice11", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice11() {
        return plOtherPrice11;
    }

    public void setPlOtherPrice11(BigDecimal plOtherPrice11) {
        this.plOtherPrice11 = plOtherPrice11;
    }

    @Basic
    @Column(name = "pl_otherPrice12", nullable = false, precision = 4)
    public BigDecimal getPlOtherPrice12() {
        return plOtherPrice12;
    }

    public void setPlOtherPrice12(BigDecimal plOtherPrice12) {
        this.plOtherPrice12 = plOtherPrice12;
    }

    @Basic
    @Column(name = "pl_weighkind", nullable = true)
    public Integer getPlWeighkind() {
        return plWeighkind;
    }

    public void setPlWeighkind(Integer plWeighkind) {
        this.plWeighkind = plWeighkind;
    }

    @Basic
    @Column(name = "pl_preferentialholeprice", nullable = true, precision = 4)
    public BigDecimal getPlPreferentialholeprice() {
        return plPreferentialholeprice;
    }

    public void setPlPreferentialholeprice(BigDecimal plPreferentialholeprice) {
        this.plPreferentialholeprice = plPreferentialholeprice;
    }

    @Basic
    @Column(name = "pl_TotalLengthPrice_Dsctn", nullable = false, precision = 4)
    public BigDecimal getPlTotalLengthPriceDsctn() {
        return plTotalLengthPriceDsctn;
    }

    public void setPlTotalLengthPriceDsctn(BigDecimal plTotalLengthPriceDsctn) {
        this.plTotalLengthPriceDsctn = plTotalLengthPriceDsctn;
    }

    @Basic
    @Column(name = "pl_TotalLengthPrice_Dsc", nullable = false, precision = 4)
    public BigDecimal getPlTotalLengthPriceDsc() {
        return plTotalLengthPriceDsc;
    }

    public void setPlTotalLengthPriceDsc(BigDecimal plTotalLengthPriceDsc) {
        this.plTotalLengthPriceDsc = plTotalLengthPriceDsc;
    }

    @Basic
    @Column(name = "pl_custdiscount", nullable = false, precision = 4)
    public BigDecimal getPlCustdiscount() {
        return plCustdiscount;
    }

    public void setPlCustdiscount(BigDecimal plCustdiscount) {
        this.plCustdiscount = plCustdiscount;
    }

    @Basic
    @Column(name = "qty", nullable = false, precision = 4)
    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "pl_radius", nullable = true, precision = 4)
    public BigDecimal getPlRadius() {
        return plRadius;
    }

    public void setPlRadius(BigDecimal plRadius) {
        this.plRadius = plRadius;
    }

    @Basic
    @Column(name = "pl_weigh_noround", nullable = true, precision = 10)
    public BigDecimal getPlWeighNoround() {
        return plWeighNoround;
    }

    public void setPlWeighNoround(BigDecimal plWeighNoround) {
        this.plWeighNoround = plWeighNoround;
    }

    @Basic
    @Column(name = "pl_vcut", nullable = false, precision = 4)
    public BigDecimal getPlVcut() {
        return plVcut;
    }

    public void setPlVcut(BigDecimal plVcut) {
        this.plVcut = plVcut;
    }

    @Basic
    @Column(name = "pl_vcutPrice", nullable = false, precision = 4)
    public BigDecimal getPlVcutPrice() {
        return plVcutPrice;
    }

    public void setPlVcutPrice(BigDecimal plVcutPrice) {
        this.plVcutPrice = plVcutPrice;
    }

    @Basic
    @Column(name = "pl_vcutPrices", nullable = false, precision = 4)
    public BigDecimal getPlVcutPrices() {
        return plVcutPrices;
    }

    public void setPlVcutPrices(BigDecimal plVcutPrices) {
        this.plVcutPrices = plVcutPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceListsEntity that = (PriceListsEntity) o;
        return plId == that.plId && plIsMaterial == that.plIsMaterial && plIslaserDscctn == that.plIslaserDscctn && plIsBendDsctn == that.plIsBendDsctn && plIsPressHoleDsctn == that.plIsPressHoleDsctn && Objects.equals(plMaterialPrice, that.plMaterialPrice) && Objects.equals(plLaserPrice, that.plLaserPrice) && Objects.equals(plTotalLength, that.plTotalLength) && Objects.equals(plTotalLengthPrice, that.plTotalLengthPrice) && Objects.equals(plHole, that.plHole) && Objects.equals(plHolePrice, that.plHolePrice) && Objects.equals(plDrawLine, that.plDrawLine) && Objects.equals(plDrawLinePrice, that.plDrawLinePrice) && Objects.equals(plPoint, that.plPoint) && Objects.equals(plPointPrice, that.plPointPrice) && Objects.equals(plPressHolePrices, that.plPressHolePrices) && Objects.equals(plPressHoleNums, that.plPressHoleNums) && Objects.equals(plPressHolePrice, that.plPressHolePrice) && Objects.equals(plBendPrices, that.plBendPrices) && Objects.equals(plToBend, that.plToBend) && Objects.equals(plToBendPrice, that.plToBendPrice) && Objects.equals(plBendPrice, that.plBendPrice) && Objects.equals(plTappuPrices, that.plTappuPrices) && Objects.equals(plTappu, that.plTappu) && Objects.equals(plTappuPrice, that.plTappuPrice) && Objects.equals(plMfrProcessPrices, that.plMfrProcessPrices) && Objects.equals(plLaserDscctn, that.plLaserDscctn) && Objects.equals(plBendDsctn, that.plBendDsctn) && Objects.equals(plPressHoleDsctn, that.plPressHoleDsctn) && Objects.equals(plBakePrice, that.plBakePrice) && Objects.equals(plElectrolyzePrice, that.plElectrolyzePrice) && Objects.equals(plGalvanizePrice, that.plGalvanizePrice) && Objects.equals(plOtherPrice, that.plOtherPrice) && Objects.equals(plWeldPrice, that.plWeldPrice) && Objects.equals(plColorPirce, that.plColorPirce) && Objects.equals(plQtyPrices, that.plQtyPrices) && Objects.equals(plQtyPrice, that.plQtyPrice) && Objects.equals(plQty, that.plQty) && Objects.equals(plWeighPrices, that.plWeighPrices) && Objects.equals(plWeighPrice, that.plWeighPrice) && Objects.equals(plWeigh, that.plWeigh) && Objects.equals(plType, that.plType) && Objects.equals(plTotal, that.plTotal) && Objects.equals(plLength, that.plLength) && Objects.equals(plHeight, that.plHeight) && Objects.equals(plMaterialPrices, that.plMaterialPrices) && Objects.equals(plWidth, that.plWidth) && Objects.equals(plMaterialParameter, that.plMaterialParameter) && Objects.equals(plDsctnNum, that.plDsctnNum) && Objects.equals(plKind, that.plKind) && Objects.equals(plOtherPrice1, that.plOtherPrice1) && Objects.equals(plOtherPrice2, that.plOtherPrice2) && Objects.equals(plOtherPrice3, that.plOtherPrice3) && Objects.equals(plOtherPrice4, that.plOtherPrice4) && Objects.equals(plOtherPrice5, that.plOtherPrice5) && Objects.equals(plOtherPrice6, that.plOtherPrice6) && Objects.equals(plPressHoleDia, that.plPressHoleDia) && Objects.equals(plMaterial, that.plMaterial) && Objects.equals(plOutlineArea, that.plOutlineArea) && Objects.equals(plInnerholeArea, that.plInnerholeArea) && Objects.equals(plOutlineWeigh, that.plOutlineWeigh) && Objects.equals(plInnerholeWeigh, that.plInnerholeWeigh) && Objects.equals(plFirePrice, that.plFirePrice) && Objects.equals(plPriceUnit, that.plPriceUnit) && Objects.equals(plMultiply, that.plMultiply) && Objects.equals(plRealWeigh, that.plRealWeigh) && Objects.equals(plFrameWeigh, that.plFrameWeigh) && Objects.equals(plLaserPriceDsc, that.plLaserPriceDsc) && Objects.equals(plBendPricesDsc, that.plBendPricesDsc) && Objects.equals(plPressHolePricesDsc, that.plPressHolePricesDsc) && Objects.equals(plOtherPrice7, that.plOtherPrice7) && Objects.equals(plOtherPrice8, that.plOtherPrice8) && Objects.equals(plOtherPrice9, that.plOtherPrice9) && Objects.equals(plOtherPrice10, that.plOtherPrice10) && Objects.equals(plOtherPrice11, that.plOtherPrice11) && Objects.equals(plOtherPrice12, that.plOtherPrice12) && Objects.equals(plWeighkind, that.plWeighkind) && Objects.equals(plPreferentialholeprice, that.plPreferentialholeprice) && Objects.equals(plTotalLengthPriceDsctn, that.plTotalLengthPriceDsctn) && Objects.equals(plTotalLengthPriceDsc, that.plTotalLengthPriceDsc) && Objects.equals(plCustdiscount, that.plCustdiscount) && Objects.equals(qty, that.qty) && Objects.equals(plRadius, that.plRadius) && Objects.equals(plWeighNoround, that.plWeighNoround) && Objects.equals(plVcut, that.plVcut) && Objects.equals(plVcutPrice, that.plVcutPrice) && Objects.equals(plVcutPrices, that.plVcutPrices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plId, plMaterialPrice, plIsMaterial, plLaserPrice, plTotalLength, plTotalLengthPrice, plHole, plHolePrice, plDrawLine, plDrawLinePrice, plPoint, plPointPrice, plPressHolePrices, plPressHoleNums, plPressHolePrice, plBendPrices, plToBend, plToBendPrice, plBendPrice, plTappuPrices, plTappu, plTappuPrice, plMfrProcessPrices, plLaserDscctn, plBendDsctn, plPressHoleDsctn, plBakePrice, plElectrolyzePrice, plGalvanizePrice, plOtherPrice, plWeldPrice, plColorPirce, plQtyPrices, plQtyPrice, plQty, plWeighPrices, plWeighPrice, plWeigh, plType, plTotal, plLength, plHeight, plMaterialPrices, plWidth, plMaterialParameter, plDsctnNum, plKind, plOtherPrice1, plOtherPrice2, plOtherPrice3, plOtherPrice4, plOtherPrice5, plOtherPrice6, plPressHoleDia, plMaterial, plIslaserDscctn, plIsBendDsctn, plIsPressHoleDsctn, plOutlineArea, plInnerholeArea, plOutlineWeigh, plInnerholeWeigh, plFirePrice, plPriceUnit, plMultiply, plRealWeigh, plFrameWeigh, plLaserPriceDsc, plBendPricesDsc, plPressHolePricesDsc, plOtherPrice7, plOtherPrice8, plOtherPrice9, plOtherPrice10, plOtherPrice11, plOtherPrice12, plWeighkind, plPreferentialholeprice, plTotalLengthPriceDsctn, plTotalLengthPriceDsc, plCustdiscount, qty, plRadius, plWeighNoround, plVcut, plVcutPrice, plVcutPrices);
    }
}
