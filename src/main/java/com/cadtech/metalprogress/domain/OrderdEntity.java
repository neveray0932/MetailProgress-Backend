package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orderd")

public class OrderdEntity {
    private int autono;
    private Short oStatus;
    private Short itemno;
    private Short itemno2;
    private Timestamp oTargetdate;
    private Double oQty;
    private Double oPrice;
    private Double oAmt;
    private String oMemo;
    private Double oBillqty;
    private Boolean oOver;
    private Integer oBomid;
    private String oBomlevel;
    private Integer oBomparentid;
    private Short oBomlevels;
    private Integer oBomRootBomId;
    private Boolean oBomHasChild;
    private Integer oDesigner;
    private Integer oSales;
    private Boolean oNeedDesign;
    private BigDecimal oMakeOrderQty;
    private Timestamp oStartdesigntime;
    private Timestamp oEndesigntime;
    private String oCustFileNo;
    private Boolean oIsmaterial;
    private BigDecimal oBomqty;
    private Short oDesignstatus;
    private String oProdnoOld;
    private boolean oMakeOrderChild;
    private String oProcess;
    private String oMemo01;
    private String oMemo02;
    private String oMemo03;
    private String oMemo04;
    private String oVersion;
    private int oProcessid;
    private String oQuotecode;
    private Integer oQuoteautono;
    private BigDecimal oWidth;
    private BigDecimal oLength;
    private Integer oPriceUnit;
    private Integer oWeightUnit;
    private BigDecimal oSingleWeight;
    private BigDecimal oQtyWeight;
    private String oNCcode;
    private String oInnerNo;
    private String oTorch;
    private String oOfferspec;
    private String oRepeat;
    private String oUsespec;
    private BigDecimal oCutlength;
    private Integer oCuthole;
    private BigDecimal oHoleweight;
    private String oMachineno;
    private Integer oPriceid;
    private BigDecimal oTotalweight;
    private Double oEmployRate;
    private Double oHoleEmploy;
    private Integer oSpareMaterial;
    private BigDecimal oMakedqty;
    private Boolean oIsPrize;
    private boolean oIsbill;
    private BigDecimal oIsShape;
    private Integer oBendimgid;
    private Timestamp oDesigntargetdate;
    private Integer oDesignprocessid;
    private String oDesignprocess;
    private BigDecimal oMakedNotInStock;
    private String itemnoOri;
    private Integer oCyid;
    private BigDecimal oCyrate;
    private BigDecimal oCyprice;
    private BigDecimal oCyamt;
    private BigDecimal oProdprice;
    private BigDecimal oProddsnt;
    private Double oOriginalstock;
    private BigDecimal oReturnweight;
    private String oInvoname;
    private String oNewversion;
    private Boolean oIsupdtversion;
    private Integer oDesignPoints;
    private String oDesignMemo;
    private BigDecimal oRealweight;

    private ProductEntity productEntity;

    private OrdermEntity ordermEntity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "o_code")
    public OrdermEntity getOrdermEntity() {
        return ordermEntity;
    }

    public void setOrdermEntity(OrdermEntity ordermEntity) {
        this.ordermEntity = ordermEntity;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "o_pid")
    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @Id
    @Column(name = "autono", nullable = false)
    public int getAutono() {
        return autono;
    }

    public void setAutono(int autono) {
        this.autono = autono;
    }

    @Basic
    @Column(name = "o_status", nullable = true)
    public Short getoStatus() {
        return oStatus;
    }

    public void setoStatus(Short oStatus) {
        this.oStatus = oStatus;
    }

    @Basic
    @Column(name = "itemno", nullable = true)
    public Short getItemno() {
        return itemno;
    }

    public void setItemno(Short itemno) {
        this.itemno = itemno;
    }

    @Basic
    @Column(name = "itemno2", nullable = true)
    public Short getItemno2() {
        return itemno2;
    }

    public void setItemno2(Short itemno2) {
        this.itemno2 = itemno2;
    }

    @Basic
    @Column(name = "o_targetdate", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Timestamp getoTargetdate() {
        return oTargetdate;
    }

    public void setoTargetdate(Timestamp oTargetdate) {
        this.oTargetdate = oTargetdate;
    }

    @Basic
    @Column(name = "o_qty", nullable = true, precision = 0)
    public Double getoQty() {
        return oQty;
    }

    public void setoQty(Double oQty) {
        this.oQty = oQty;
    }

    @Basic
    @Column(name = "o_price", nullable = true, precision = 0)
    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    @Basic
    @Column(name = "o_amt", nullable = true, precision = 0)
    public Double getoAmt() {
        return oAmt;
    }

    public void setoAmt(Double oAmt) {
        this.oAmt = oAmt;
    }

    @Basic
    @Column(name = "o_memo", nullable = true, length = 200)
    public String getoMemo() {
        return oMemo;
    }

    public void setoMemo(String oMemo) {
        this.oMemo = oMemo;
    }

    @Basic
    @Column(name = "o_billqty", nullable = true, precision = 0)
    public Double getoBillqty() {
        return oBillqty;
    }

    public void setoBillqty(Double oBillqty) {
        this.oBillqty = oBillqty;
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
    @Column(name = "o_bomid", nullable = true)
    public Integer getoBomid() {
        return oBomid;
    }

    public void setoBomid(Integer oBomid) {
        this.oBomid = oBomid;
    }

    @Basic
    @Column(name = "o_bomlevel", nullable = true, length = 20)
    public String getoBomlevel() {
        return oBomlevel;
    }

    public void setoBomlevel(String oBomlevel) {
        this.oBomlevel = oBomlevel;
    }

    @Basic
    @Column(name = "o_bomparentid", nullable = true)
    public Integer getoBomparentid() {
        return oBomparentid;
    }

    public void setoBomparentid(Integer oBomparentid) {
        this.oBomparentid = oBomparentid;
    }

    @Basic
    @Column(name = "o_bomlevels", nullable = true)
    public Short getoBomlevels() {
        return oBomlevels;
    }

    public void setoBomlevels(Short oBomlevels) {
        this.oBomlevels = oBomlevels;
    }

    @Basic
    @Column(name = "o_bom_root_bom_id", nullable = true)
    public Integer getoBomRootBomId() {
        return oBomRootBomId;
    }

    public void setoBomRootBomId(Integer oBomRootBomId) {
        this.oBomRootBomId = oBomRootBomId;
    }

    @Basic
    @Column(name = "o_bom_hasChild", nullable = true)
    public Boolean getoBomHasChild() {
        return oBomHasChild;
    }

    public void setoBomHasChild(Boolean oBomHasChild) {
        this.oBomHasChild = oBomHasChild;
    }

    @Basic
    @Column(name = "o_designer", nullable = true)
    public Integer getoDesigner() {
        return oDesigner;
    }

    public void setoDesigner(Integer oDesigner) {
        this.oDesigner = oDesigner;
    }

    @Basic
    @Column(name = "o_sales", nullable = true)
    public Integer getoSales() {
        return oSales;
    }

    public void setoSales(Integer oSales) {
        this.oSales = oSales;
    }

    @Basic
    @Column(name = "o_needDesign", nullable = true)
    public Boolean getoNeedDesign() {
        return oNeedDesign;
    }

    public void setoNeedDesign(Boolean oNeedDesign) {
        this.oNeedDesign = oNeedDesign;
    }

    @Basic
    @Column(name = "o_makeOrderQty", nullable = true, precision = 2)
    public BigDecimal getoMakeOrderQty() {
        return oMakeOrderQty;
    }

    public void setoMakeOrderQty(BigDecimal oMakeOrderQty) {
        this.oMakeOrderQty = oMakeOrderQty;
    }

    @Basic
    @Column(name = "o_startdesigntime", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Timestamp getoStartdesigntime() {
        return oStartdesigntime;
    }

    public void setoStartdesigntime(Timestamp oStartdesigntime) {
        this.oStartdesigntime = oStartdesigntime;
    }

    @Basic
    @Column(name = "o_endesigntime", nullable = true)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Timestamp getoEndesigntime() {
        return oEndesigntime;
    }

    public void setoEndesigntime(Timestamp oEndesigntime) {
        this.oEndesigntime = oEndesigntime;
    }

    @Basic
    @Column(name = "o_custFileNo", nullable = true, length = 100)
    public String getoCustFileNo() {
        return oCustFileNo;
    }

    public void setoCustFileNo(String oCustFileNo) {
        this.oCustFileNo = oCustFileNo;
    }

    @Basic
    @Column(name = "o_ismaterial", nullable = true)
    public Boolean getoIsmaterial() {
        return oIsmaterial;
    }

    public void setoIsmaterial(Boolean oIsmaterial) {
        this.oIsmaterial = oIsmaterial;
    }

    @Basic
    @Column(name = "o_bomqty", nullable = true, precision = 2)
    public BigDecimal getoBomqty() {
        return oBomqty;
    }

    public void setoBomqty(BigDecimal oBomqty) {
        this.oBomqty = oBomqty;
    }

    @Basic
    @Column(name = "o_designstatus", nullable = true)
    public Short getoDesignstatus() {
        return oDesignstatus;
    }

    public void setoDesignstatus(Short oDesignstatus) {
        this.oDesignstatus = oDesignstatus;
    }

    @Basic
    @Column(name = "o_prodno_old", nullable = true, length = 20)
    public String getoProdnoOld() {
        return oProdnoOld;
    }

    public void setoProdnoOld(String oProdnoOld) {
        this.oProdnoOld = oProdnoOld;
    }

    @Basic
    @Column(name = "o_makeOrderChild", nullable = false)
    public boolean isoMakeOrderChild() {
        return oMakeOrderChild;
    }

    public void setoMakeOrderChild(boolean oMakeOrderChild) {
        this.oMakeOrderChild = oMakeOrderChild;
    }

    @Basic
    @Column(name = "o_process", nullable = true, length = 400)
    public String getoProcess() {
        return oProcess;
    }

    public void setoProcess(String oProcess) {
        this.oProcess = oProcess;
    }

    @Basic
    @Column(name = "o_memo01", nullable = true, length = 400)
    public String getoMemo01() {
        return oMemo01;
    }

    public void setoMemo01(String oMemo01) {
        this.oMemo01 = oMemo01;
    }

    @Basic
    @Column(name = "o_memo02", nullable = true, length = 400)
    public String getoMemo02() {
        return oMemo02;
    }

    public void setoMemo02(String oMemo02) {
        this.oMemo02 = oMemo02;
    }

    @Basic
    @Column(name = "o_memo03", nullable = true, length = 400)
    public String getoMemo03() {
        return oMemo03;
    }

    public void setoMemo03(String oMemo03) {
        this.oMemo03 = oMemo03;
    }

    @Basic
    @Column(name = "o_memo04", nullable = true, length = 400)
    public String getoMemo04() {
        return oMemo04;
    }

    public void setoMemo04(String oMemo04) {
        this.oMemo04 = oMemo04;
    }

    @Basic
    @Column(name = "o_version", nullable = true, length = 30)
    public String getoVersion() {
        return oVersion;
    }

    public void setoVersion(String oVersion) {
        this.oVersion = oVersion;
    }

    @Basic
    @Column(name = "o_processid", nullable = false)
    public int getoProcessid() {
        return oProcessid;
    }

    public void setoProcessid(int oProcessid) {
        this.oProcessid = oProcessid;
    }

    @Basic
    @Column(name = "o_quotecode", nullable = true, length = 15)
    public String getoQuotecode() {
        return oQuotecode;
    }

    public void setoQuotecode(String oQuotecode) {
        this.oQuotecode = oQuotecode;
    }

    @Basic
    @Column(name = "o_quoteautono", nullable = true)
    public Integer getoQuoteautono() {
        return oQuoteautono;
    }

    public void setoQuoteautono(Integer oQuoteautono) {
        this.oQuoteautono = oQuoteautono;
    }

    @Basic
    @Column(name = "o_width", nullable = true, precision = 4)
    public BigDecimal getoWidth() {
        return oWidth;
    }

    public void setoWidth(BigDecimal oWidth) {
        this.oWidth = oWidth;
    }

    @Basic
    @Column(name = "o_length", nullable = true, precision = 4)
    public BigDecimal getoLength() {
        return oLength;
    }

    public void setoLength(BigDecimal oLength) {
        this.oLength = oLength;
    }

    @Basic
    @Column(name = "o_priceUnit", nullable = true)
    public Integer getoPriceUnit() {
        return oPriceUnit;
    }

    public void setoPriceUnit(Integer oPriceUnit) {
        this.oPriceUnit = oPriceUnit;
    }

    @Basic
    @Column(name = "o_weightUnit", nullable = true)
    public Integer getoWeightUnit() {
        return oWeightUnit;
    }

    public void setoWeightUnit(Integer oWeightUnit) {
        this.oWeightUnit = oWeightUnit;
    }

    @Basic
    @Column(name = "o_singleWeight", nullable = true, precision = 4)
    public BigDecimal getoSingleWeight() {
        return oSingleWeight;
    }

    public void setoSingleWeight(BigDecimal oSingleWeight) {
        this.oSingleWeight = oSingleWeight;
    }

    @Basic
    @Column(name = "o_qtyWeight", nullable = true, precision = 4)
    public BigDecimal getoQtyWeight() {
        return oQtyWeight;
    }

    public void setoQtyWeight(BigDecimal oQtyWeight) {
        this.oQtyWeight = oQtyWeight;
    }

    @Basic
    @Column(name = "o_NCcode", nullable = true, length = 10)
    public String getoNCcode() {
        return oNCcode;
    }

    public void setoNCcode(String oNCcode) {
        this.oNCcode = oNCcode;
    }

    @Basic
    @Column(name = "o_innerNO", nullable = true, length = 10)
    public String getoInnerNo() {
        return oInnerNo;
    }

    public void setoInnerNo(String oInnerNo) {
        this.oInnerNo = oInnerNo;
    }

    @Basic
    @Column(name = "o_torch", nullable = true, length = 10)
    public String getoTorch() {
        return oTorch;
    }

    public void setoTorch(String oTorch) {
        this.oTorch = oTorch;
    }

    @Basic
    @Column(name = "o_offerspec", nullable = true, length = 50)
    public String getoOfferspec() {
        return oOfferspec;
    }

    public void setoOfferspec(String oOfferspec) {
        this.oOfferspec = oOfferspec;
    }

    @Basic
    @Column(name = "o_repeat", nullable = true, length = 10)
    public String getoRepeat() {
        return oRepeat;
    }

    public void setoRepeat(String oRepeat) {
        this.oRepeat = oRepeat;
    }

    @Basic
    @Column(name = "o_usespec", nullable = true, length = 50)
    public String getoUsespec() {
        return oUsespec;
    }

    public void setoUsespec(String oUsespec) {
        this.oUsespec = oUsespec;
    }

    @Basic
    @Column(name = "o_cutlength", nullable = true, precision = 4)
    public BigDecimal getoCutlength() {
        return oCutlength;
    }

    public void setoCutlength(BigDecimal oCutlength) {
        this.oCutlength = oCutlength;
    }

    @Basic
    @Column(name = "o_cuthole", nullable = true, precision = 0,columnDefinition = "NUMERIC(19,0)")
    public Integer getoCuthole() {
        return oCuthole;
    }

    public void setoCuthole(Integer oCuthole) {
        this.oCuthole = oCuthole;
    }

    @Basic
    @Column(name = "o_holeweight", nullable = true, precision = 4)
    public BigDecimal getoHoleweight() {
        return oHoleweight;
    }

    public void setoHoleweight(BigDecimal oHoleweight) {
        this.oHoleweight = oHoleweight;
    }

    @Basic
    @Column(name = "o_machineno", nullable = true, length = 20)
    public String getoMachineno() {
        return oMachineno;
    }

    public void setoMachineno(String oMachineno) {
        this.oMachineno = oMachineno;
    }

    @Basic
    @Column(name = "o_priceid", nullable = true)
    public Integer getoPriceid() {
        return oPriceid;
    }

    public void setoPriceid(Integer oPriceid) {
        this.oPriceid = oPriceid;
    }

    @Basic
    @Column(name = "o_totalweight", nullable = true, precision = 0)
    public BigDecimal getoTotalweight() {
        return oTotalweight;
    }

    public void setoTotalweight(BigDecimal oTotalweight) {
        this.oTotalweight = oTotalweight;
    }

    @Basic
    @Column(name = "o_employRate", nullable = true, precision = 0)
    public Double getoEmployRate() {
        return oEmployRate;
    }

    public void setoEmployRate(Double oEmployRate) {
        this.oEmployRate = oEmployRate;
    }

    @Basic
    @Column(name = "o_holeEmploy", nullable = true, precision = 0)
    public Double getoHoleEmploy() {
        return oHoleEmploy;
    }

    public void setoHoleEmploy(Double oHoleEmploy) {
        this.oHoleEmploy = oHoleEmploy;
    }

    @Basic
    @Column(name = "o_spareMaterial", nullable = true)
    public Integer getoSpareMaterial() {
        return oSpareMaterial;
    }

    public void setoSpareMaterial(Integer oSpareMaterial) {
        this.oSpareMaterial = oSpareMaterial;
    }

    @Basic
    @Column(name = "o_makedqty", nullable = false, precision = 2)
    public BigDecimal getoMakedqty() {
        return oMakedqty;
    }

    public void setoMakedqty(BigDecimal oMakedqty) {
        this.oMakedqty = oMakedqty;
    }

    @Basic
    @Column(name = "o_isPrize", nullable = true)
    public Boolean getoIsPrize() {
        return oIsPrize;
    }

    public void setoIsPrize(Boolean oIsPrize) {
        this.oIsPrize = oIsPrize;
    }

    @Basic
    @Column(name = "o_isbill", nullable = false)
    public boolean isoIsbill() {
        return oIsbill;
    }

    public void setoIsbill(boolean oIsbill) {
        this.oIsbill = oIsbill;
    }

    @Basic
    @Column(name = "o_isShape", nullable = true, precision = 4)
    public BigDecimal getoIsShape() {
        return oIsShape;
    }

    public void setoIsShape(BigDecimal oIsShape) {
        this.oIsShape = oIsShape;
    }

    @Basic
    @Column(name = "o_bendimgid", nullable = true)
    public Integer getoBendimgid() {
        return oBendimgid;
    }

    public void setoBendimgid(Integer oBendimgid) {
        this.oBendimgid = oBendimgid;
    }

    @Basic
    @Column(name = "o_designtargetdate", nullable = true)
    public Timestamp getoDesigntargetdate() {
        return oDesigntargetdate;
    }

    public void setoDesigntargetdate(Timestamp oDesigntargetdate) {
        this.oDesigntargetdate = oDesigntargetdate;
    }

    @Basic
    @Column(name = "o_designprocessid", nullable = true)
    public Integer getoDesignprocessid() {
        return oDesignprocessid;
    }

    public void setoDesignprocessid(Integer oDesignprocessid) {
        this.oDesignprocessid = oDesignprocessid;
    }

    @Basic
    @Column(name = "o_designprocess", nullable = true, length = 400)
    public String getoDesignprocess() {
        return oDesignprocess;
    }

    public void setoDesignprocess(String oDesignprocess) {
        this.oDesignprocess = oDesignprocess;
    }

    @Basic
    @Column(name = "o_MakedNotInStock", nullable = true, precision = 2)
    public BigDecimal getoMakedNotInStock() {
        return oMakedNotInStock;
    }

    public void setoMakedNotInStock(BigDecimal oMakedNotInStock) {
        this.oMakedNotInStock = oMakedNotInStock;
    }

    @Basic
    @Column(name = "itemno_ori", nullable = true, length = 10)
    public String getItemnoOri() {
        return itemnoOri;
    }

    public void setItemnoOri(String itemnoOri) {
        this.itemnoOri = itemnoOri;
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
    @Column(name = "o_cyprice", nullable = true, precision = 4)
    public BigDecimal getoCyprice() {
        return oCyprice;
    }

    public void setoCyprice(BigDecimal oCyprice) {
        this.oCyprice = oCyprice;
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
    @Column(name = "o_prodprice", nullable = true, precision = 2)
    public BigDecimal getoProdprice() {
        return oProdprice;
    }

    public void setoProdprice(BigDecimal oProdprice) {
        this.oProdprice = oProdprice;
    }

    @Basic
    @Column(name = "o_proddsnt", nullable = true, precision = 2)
    public BigDecimal getoProddsnt() {
        return oProddsnt;
    }

    public void setoProddsnt(BigDecimal oProddsnt) {
        this.oProddsnt = oProddsnt;
    }

    @Basic
    @Column(name = "o_originalstock", nullable = true, precision = 0)
    public Double getoOriginalstock() {
        return oOriginalstock;
    }

    public void setoOriginalstock(Double oOriginalstock) {
        this.oOriginalstock = oOriginalstock;
    }

    @Basic
    @Column(name = "o_returnweight", nullable = true, precision = 4)
    public BigDecimal getoReturnweight() {
        return oReturnweight;
    }

    public void setoReturnweight(BigDecimal oReturnweight) {
        this.oReturnweight = oReturnweight;
    }

    @Basic
    @Column(name = "o_invoname", nullable = true, length = 80)
    public String getoInvoname() {
        return oInvoname;
    }

    public void setoInvoname(String oInvoname) {
        this.oInvoname = oInvoname;
    }

    @Basic
    @Column(name = "o_newversion", nullable = true, length = 30)
    public String getoNewversion() {
        return oNewversion;
    }

    public void setoNewversion(String oNewversion) {
        this.oNewversion = oNewversion;
    }

    @Basic
    @Column(name = "o_isupdtversion", nullable = true)
    public Boolean getoIsupdtversion() {
        return oIsupdtversion;
    }

    public void setoIsupdtversion(Boolean oIsupdtversion) {
        this.oIsupdtversion = oIsupdtversion;
    }

    @Basic
    @Column(name = "o_design_points", nullable = true)
    public Integer getoDesignPoints() {
        return oDesignPoints;
    }

    public void setoDesignPoints(Integer oDesignPoints) {
        this.oDesignPoints = oDesignPoints;
    }

    @Basic
    @Column(name = "o_design_memo", nullable = true, length = 2000)
    public String getoDesignMemo() {
        return oDesignMemo;
    }

    public void setoDesignMemo(String oDesignMemo) {
        this.oDesignMemo = oDesignMemo;
    }

    @Basic
    @Column(name = "o_realweight", nullable = true, precision = 4)
    public BigDecimal getoRealweight() {
        return oRealweight;
    }

    public void setoRealweight(BigDecimal oRealweight) {
        this.oRealweight = oRealweight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdEntity that = (OrderdEntity) o;
        return autono == that.autono && oMakeOrderChild == that.oMakeOrderChild && oProcessid == that.oProcessid && oIsbill == that.oIsbill && Objects.equals(oStatus, that.oStatus) && Objects.equals(itemno, that.itemno) && Objects.equals(itemno2, that.itemno2) && Objects.equals(oTargetdate, that.oTargetdate) && Objects.equals(oQty, that.oQty) && Objects.equals(oPrice, that.oPrice) && Objects.equals(oAmt, that.oAmt) && Objects.equals(oMemo, that.oMemo) && Objects.equals(oBillqty, that.oBillqty) && Objects.equals(oOver, that.oOver) && Objects.equals(oBomid, that.oBomid) && Objects.equals(oBomlevel, that.oBomlevel) && Objects.equals(oBomparentid, that.oBomparentid) && Objects.equals(oBomlevels, that.oBomlevels) && Objects.equals(oBomRootBomId, that.oBomRootBomId) && Objects.equals(oBomHasChild, that.oBomHasChild) && Objects.equals(oDesigner, that.oDesigner) && Objects.equals(oSales, that.oSales) && Objects.equals(oNeedDesign, that.oNeedDesign) && Objects.equals(oMakeOrderQty, that.oMakeOrderQty) && Objects.equals(oStartdesigntime, that.oStartdesigntime) && Objects.equals(oEndesigntime, that.oEndesigntime) && Objects.equals(oCustFileNo, that.oCustFileNo) && Objects.equals(oIsmaterial, that.oIsmaterial) && Objects.equals(oBomqty, that.oBomqty) && Objects.equals(oDesignstatus, that.oDesignstatus) && Objects.equals(oProdnoOld, that.oProdnoOld) && Objects.equals(oProcess, that.oProcess) && Objects.equals(oMemo01, that.oMemo01) && Objects.equals(oMemo02, that.oMemo02) && Objects.equals(oMemo03, that.oMemo03) && Objects.equals(oMemo04, that.oMemo04) && Objects.equals(oVersion, that.oVersion) && Objects.equals(oQuotecode, that.oQuotecode) && Objects.equals(oQuoteautono, that.oQuoteautono) && Objects.equals(oWidth, that.oWidth) && Objects.equals(oLength, that.oLength) && Objects.equals(oPriceUnit, that.oPriceUnit) && Objects.equals(oWeightUnit, that.oWeightUnit) && Objects.equals(oSingleWeight, that.oSingleWeight) && Objects.equals(oQtyWeight, that.oQtyWeight) && Objects.equals(oNCcode, that.oNCcode) && Objects.equals(oInnerNo, that.oInnerNo) && Objects.equals(oTorch, that.oTorch) && Objects.equals(oOfferspec, that.oOfferspec) && Objects.equals(oRepeat, that.oRepeat) && Objects.equals(oUsespec, that.oUsespec) && Objects.equals(oCutlength, that.oCutlength) && Objects.equals(oCuthole, that.oCuthole) && Objects.equals(oHoleweight, that.oHoleweight) && Objects.equals(oMachineno, that.oMachineno) && Objects.equals(oPriceid, that.oPriceid) && Objects.equals(oTotalweight, that.oTotalweight) && Objects.equals(oEmployRate, that.oEmployRate) && Objects.equals(oHoleEmploy, that.oHoleEmploy) && Objects.equals(oSpareMaterial, that.oSpareMaterial) && Objects.equals(oMakedqty, that.oMakedqty) && Objects.equals(oIsPrize, that.oIsPrize) && Objects.equals(oIsShape, that.oIsShape) && Objects.equals(oBendimgid, that.oBendimgid) && Objects.equals(oDesigntargetdate, that.oDesigntargetdate) && Objects.equals(oDesignprocessid, that.oDesignprocessid) && Objects.equals(oDesignprocess, that.oDesignprocess) && Objects.equals(oMakedNotInStock, that.oMakedNotInStock) && Objects.equals(itemnoOri, that.itemnoOri) && Objects.equals(oCyid, that.oCyid) && Objects.equals(oCyrate, that.oCyrate) && Objects.equals(oCyprice, that.oCyprice) && Objects.equals(oCyamt, that.oCyamt) && Objects.equals(oProdprice, that.oProdprice) && Objects.equals(oProddsnt, that.oProddsnt) && Objects.equals(oOriginalstock, that.oOriginalstock) && Objects.equals(oReturnweight, that.oReturnweight) && Objects.equals(oInvoname, that.oInvoname) && Objects.equals(oNewversion, that.oNewversion) && Objects.equals(oIsupdtversion, that.oIsupdtversion) && Objects.equals(oDesignPoints, that.oDesignPoints) && Objects.equals(oDesignMemo, that.oDesignMemo) && Objects.equals(oRealweight, that.oRealweight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autono, oStatus, itemno, itemno2, oTargetdate, oQty, oPrice, oAmt, oMemo, oBillqty, oOver, oBomid, oBomlevel, oBomparentid, oBomlevels, oBomRootBomId, oBomHasChild, oDesigner, oSales, oNeedDesign, oMakeOrderQty, oStartdesigntime, oEndesigntime, oCustFileNo, oIsmaterial, oBomqty, oDesignstatus, oProdnoOld, oMakeOrderChild, oProcess, oMemo01, oMemo02, oMemo03, oMemo04, oVersion, oProcessid, oQuotecode, oQuoteautono, oWidth, oLength, oPriceUnit, oWeightUnit, oSingleWeight, oQtyWeight, oNCcode, oInnerNo, oTorch, oOfferspec, oRepeat, oUsespec, oCutlength, oCuthole, oHoleweight, oMachineno, oPriceid, oTotalweight, oEmployRate, oHoleEmploy, oSpareMaterial, oMakedqty, oIsPrize, oIsbill, oIsShape, oBendimgid, oDesigntargetdate, oDesignprocessid, oDesignprocess, oMakedNotInStock, itemnoOri, oCyid, oCyrate, oCyprice, oCyamt, oProdprice, oProddsnt, oOriginalstock, oReturnweight, oInvoname, oNewversion, oIsupdtversion, oDesignPoints, oDesignMemo, oRealweight);
    }

}
