package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "product")
public class ProductEntity {
    private String pNo;
    private String pSpec;
    private String pPhon;
    private Boolean pInvalid;
    private Integer pSort;
    private int pId;
    private String pMemo;
    private String pMaterial;
    private BigDecimal pLength;
    private BigDecimal pHeight;
    private BigDecimal pWidth;
    private String pSize;
    private String pPricekind;
    private Integer pPriceUnitid;
    private String pBrand;
    private String pPicFileName;
    private Integer pImgId;
    private BigDecimal pPrice;
    private Integer pBomid;
    private BigDecimal pCost;
    private String pLocation;
    private String pGoodtype;
    private Double pStock;
    private String pSuppmaterialno;
    private String pNameOld;
    private String pName;
    private String pCustfileno;
    private String pMfrnote;
    private String pPricemode;
    private String pStockmode;
    private Double pUnitweight;
    private BigDecimal pMinpurqty;
    private String pMemo2;
    private Boolean pIsReportPrice;
    private Timestamp pReceivePic;
    private Timestamp pCreateday;
    private String pDepotNo;
    private Timestamp pLastday;
    private Integer pAiid;
    private Integer pDesingimg;
    private String pVersion;
    private BigDecimal pAvecost;
    private BigDecimal pBomcost;
    private String pQualityFilepath;
    private String pNCcode;
    private String pTorch;
    private String pRepeat;
    private String pInvpdname;
    private Integer pInovprodid;
    private String pUsespec;
    private String pDesignmemo;
    private String pMfrmemo;
    private BigDecimal pRealweight;
    private String pMachinekind;
    private Integer pTempid;
    private String pCustpicfilepath;
    private String pFile;
    private String pPicFileName2;
    private Integer pCustid;
    private BigDecimal pCyprice;
    private Integer p3DImageId;
    private BigDecimal pTestprice;
    private BigDecimal pRadius;
    private BigDecimal pDiameter;
    private BigDecimal pTall;
    private Double pLaserqty;
    private String pInvoname;
    private String pCreateuser;
    private String pQtImgFile;

    private List<MakeOrderDetailEntity> makeOrderDetailEntities;

    private List<OrderdEntity> orderdEntities;

    private ProdUnitEntity prodUnitEntity;

    private ProdKindEntity prodKindEntity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "p_kindid")
    public ProdKindEntity getProdKindEntity() {
        return prodKindEntity;
    }

    public void setProdKindEntity(ProdKindEntity prodKindEntity) {
        this.prodKindEntity = prodKindEntity;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "p_unitid")
    public ProdUnitEntity getProdUnitEntity() {
        return prodUnitEntity;
    }

    public void setProdUnitEntity(ProdUnitEntity prodUnitEntity) {
        this.prodUnitEntity = prodUnitEntity;
    }
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property ="autono" )
    @JsonManagedReference
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OrderdEntity> getOrderdEntities() {
        return orderdEntities;
    }

    public void setOrderdEntities(List<OrderdEntity> orderdEntities) {
        this.orderdEntities = orderdEntities;
    }

//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property ="autono" )
    @JsonManagedReference
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<MakeOrderDetailEntity> getMakeOrderDetailEntities() {
        return makeOrderDetailEntities;
    }

    public void setMakeOrderDetailEntities(List<MakeOrderDetailEntity> makeOrderDetailEntities) {
        this.makeOrderDetailEntities = makeOrderDetailEntities;
    }

    @Basic
    @Column(name = "p_no", nullable = true, length = 80)
    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    @Basic
    @Column(name = "p_spec", nullable = true, length = 50)
    public String getpSpec() {
        return pSpec;
    }

    public void setpSpec(String pSpec) {
        this.pSpec = pSpec;
    }

    @Basic
    @Column(name = "p_phon", nullable = true, length = 20)
    public String getpPhon() {
        return pPhon;
    }

    public void setpPhon(String pPhon) {
        this.pPhon = pPhon;
    }

    @Basic
    @Column(name = "p_invalid", nullable = true)
    public Boolean getpInvalid() {
        return pInvalid;
    }

    public void setpInvalid(Boolean pInvalid) {
        this.pInvalid = pInvalid;
    }

    @Basic
    @Column(name = "p_sort", nullable = true)
    public Integer getpSort() {
        return pSort;
    }

    public void setpSort(Integer pSort) {
        this.pSort = pSort;
    }

    @Id
    @Column(name = "p_id", nullable = false)
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Basic
    @Column(name = "p_memo", nullable = true, length = 400)
    public String getpMemo() {
        return pMemo;
    }

    public void setpMemo(String pMemo) {
        this.pMemo = pMemo;
    }

    @Basic
    @Column(name = "p_material", nullable = true, length = 10)
    public String getpMaterial() {
        return pMaterial;
    }

    public void setpMaterial(String pMaterial) {
        this.pMaterial = pMaterial;
    }

    @Basic
    @Column(name = "p_length", nullable = true, precision = 4)
    public BigDecimal getpLength() {
        return pLength;
    }

    public void setpLength(BigDecimal pLength) {
        this.pLength = pLength;
    }

    @Basic
    @Column(name = "p_height", nullable = true, precision = 4)
    public BigDecimal getpHeight() {
        return pHeight;
    }

    public void setpHeight(BigDecimal pHeight) {
        this.pHeight = pHeight;
    }

    @Basic
    @Column(name = "p_width", nullable = true, precision = 4)
    public BigDecimal getpWidth() {
        return pWidth;
    }

    public void setpWidth(BigDecimal pWidth) {
        this.pWidth = pWidth;
    }

    @Basic
    @Column(name = "p_size", nullable = true, length = 20)
    public String getpSize() {
        return pSize;
    }

    public void setpSize(String pSize) {
        this.pSize = pSize;
    }

    @Basic
    @Column(name = "p_pricekind", nullable = true, length = 10)
    public String getpPricekind() {
        return pPricekind;
    }

    public void setpPricekind(String pPricekind) {
        this.pPricekind = pPricekind;
    }

    @Basic
    @Column(name = "p_priceUnitid", nullable = true)
    public Integer getpPriceUnitid() {
        return pPriceUnitid;
    }

    public void setpPriceUnitid(Integer pPriceUnitid) {
        this.pPriceUnitid = pPriceUnitid;
    }

    @Basic
    @Column(name = "p_brand", nullable = true, length = 50)
    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    @Basic
    @Column(name = "p_PicFileName", nullable = true, length = 200)
    public String getpPicFileName() {
        return pPicFileName;
    }

    public void setpPicFileName(String pPicFileName) {
        this.pPicFileName = pPicFileName;
    }

    @Basic
    @Column(name = "p_imgId", nullable = true)
    public Integer getpImgId() {
        return pImgId;
    }

    public void setpImgId(Integer pImgId) {
        this.pImgId = pImgId;
    }

    @Basic
    @Column(name = "p_price", nullable = false, precision = 4)
    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    @Basic
    @Column(name = "p_bomid", nullable = true)
    public Integer getpBomid() {
        return pBomid;
    }

    public void setpBomid(Integer pBomid) {
        this.pBomid = pBomid;
    }

    @Basic
    @Column(name = "p_cost", nullable = true, precision = 4)
    public BigDecimal getpCost() {
        return pCost;
    }

    public void setpCost(BigDecimal pCost) {
        this.pCost = pCost;
    }

    @Basic
    @Column(name = "p_location", nullable = true, length = 100)
    public String getpLocation() {
        return pLocation;
    }

    public void setpLocation(String pLocation) {
        this.pLocation = pLocation;
    }

    @Basic
    @Column(name = "p_goodtype", nullable = true, length = 10)
    public String getpGoodtype() {
        return pGoodtype;
    }

    public void setpGoodtype(String pGoodtype) {
        this.pGoodtype = pGoodtype;
    }

    @Basic
    @Column(name = "p_stock", nullable = true, precision = 0)
    public Double getpStock() {
        return pStock;
    }

    public void setpStock(Double pStock) {
        this.pStock = pStock;
    }

    @Basic
    @Column(name = "p_suppmaterialno", nullable = true, length = 30)
    public String getpSuppmaterialno() {
        return pSuppmaterialno;
    }

    public void setpSuppmaterialno(String pSuppmaterialno) {
        this.pSuppmaterialno = pSuppmaterialno;
    }

    @Basic
    @Column(name = "p_name_old", nullable = true, length = 200)
    public String getpNameOld() {
        return pNameOld;
    }

    public void setpNameOld(String pNameOld) {
        this.pNameOld = pNameOld;
    }

    @Basic
    @Column(name = "p_name", nullable = true, length = 200)
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Basic
    @Column(name = "p_custfileno", nullable = true, length = 75)
    public String getpCustfileno() {
        return pCustfileno;
    }

    public void setpCustfileno(String pCustfileno) {
        this.pCustfileno = pCustfileno;
    }

    @Basic
    @Column(name = "p_mfrnote", nullable = true, length = 400)
    public String getpMfrnote() {
        return pMfrnote;
    }

    public void setpMfrnote(String pMfrnote) {
        this.pMfrnote = pMfrnote;
    }

    @Basic
    @Column(name = "p_pricemode", nullable = true, length = 4)
    public String getpPricemode() {
        return pPricemode;
    }

    public void setpPricemode(String pPricemode) {
        this.pPricemode = pPricemode;
    }

    @Basic
    @Column(name = "p_stockmode", nullable = true, length = 4)
    public String getpStockmode() {
        return pStockmode;
    }

    public void setpStockmode(String pStockmode) {
        this.pStockmode = pStockmode;
    }

    @Basic
    @Column(name = "p_unitweight", nullable = true, precision = 0)
    public Double getpUnitweight() {
        return pUnitweight;
    }

    public void setpUnitweight(Double pUnitweight) {
        this.pUnitweight = pUnitweight;
    }

    @Basic
    @Column(name = "p_minpurqty", nullable = true, precision = 4)
    public BigDecimal getpMinpurqty() {
        return pMinpurqty;
    }

    public void setpMinpurqty(BigDecimal pMinpurqty) {
        this.pMinpurqty = pMinpurqty;
    }

    @Basic
    @Column(name = "p_memo2", nullable = true, length = 400)
    public String getpMemo2() {
        return pMemo2;
    }

    public void setpMemo2(String pMemo2) {
        this.pMemo2 = pMemo2;
    }

    @Basic
    @Column(name = "p_isReportPrice", nullable = true)
    public Boolean getpIsReportPrice() {
        return pIsReportPrice;
    }

    public void setpIsReportPrice(Boolean pIsReportPrice) {
        this.pIsReportPrice = pIsReportPrice;
    }

    @Basic
    @Column(name = "p_receivePic", nullable = true)
    public Timestamp getpReceivePic() {
        return pReceivePic;
    }

    public void setpReceivePic(Timestamp pReceivePic) {
        this.pReceivePic = pReceivePic;
    }

    @Basic
    @Column(name = "p_createday", nullable = false)
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone="GMT+8")
    public Timestamp getpCreateday() {
        return pCreateday;
    }

    public void setpCreateday(Timestamp pCreateday) {
        this.pCreateday = pCreateday;
    }

    @Basic
    @Column(name = "p_depotNo", nullable = true, length = 10)
    public String getpDepotNo() {
        return pDepotNo;
    }

    public void setpDepotNo(String pDepotNo) {
        this.pDepotNo = pDepotNo;
    }

    @Basic
    @Column(name = "p_lastday", nullable = true)
    public Timestamp getpLastday() {
        return pLastday;
    }

    public void setpLastday(Timestamp pLastday) {
        this.pLastday = pLastday;
    }

    @Basic
    @Column(name = "p_aiid", nullable = true)
    public Integer getpAiid() {
        return pAiid;
    }

    public void setpAiid(Integer pAiid) {
        this.pAiid = pAiid;
    }

    @Basic
    @Column(name = "p_desingimg", nullable = true)
    public Integer getpDesingimg() {
        return pDesingimg;
    }

    public void setpDesingimg(Integer pDesingimg) {
        this.pDesingimg = pDesingimg;
    }

    @Basic
    @Column(name = "p_version", nullable = true, length = 30)
    public String getpVersion() {
        return pVersion;
    }

    public void setpVersion(String pVersion) {
        this.pVersion = pVersion;
    }

    @Basic
    @Column(name = "p_avecost", nullable = true, precision = 4)
    public BigDecimal getpAvecost() {
        return pAvecost;
    }

    public void setpAvecost(BigDecimal pAvecost) {
        this.pAvecost = pAvecost;
    }

    @Basic
    @Column(name = "p_bomcost", nullable = true, precision = 4)
    public BigDecimal getpBomcost() {
        return pBomcost;
    }

    public void setpBomcost(BigDecimal pBomcost) {
        this.pBomcost = pBomcost;
    }

    @Basic
    @Column(name = "p_QualityFilepath", nullable = true, length = 400)
    public String getpQualityFilepath() {
        return pQualityFilepath;
    }

    public void setpQualityFilepath(String pQualityFilepath) {
        this.pQualityFilepath = pQualityFilepath;
    }

    @Basic
    @Column(name = "p_NCcode", nullable = true, length = 10)
    public String getpNCcode() {
        return pNCcode;
    }

    public void setpNCcode(String pNCcode) {
        this.pNCcode = pNCcode;
    }

    @Basic
    @Column(name = "p_torch", nullable = true, length = 10)
    public String getpTorch() {
        return pTorch;
    }

    public void setpTorch(String pTorch) {
        this.pTorch = pTorch;
    }

    @Basic
    @Column(name = "p_repeat", nullable = true, length = 10)
    public String getpRepeat() {
        return pRepeat;
    }

    public void setpRepeat(String pRepeat) {
        this.pRepeat = pRepeat;
    }

    @Basic
    @Column(name = "p_invpdname", nullable = true, length = 200)
    public String getpInvpdname() {
        return pInvpdname;
    }

    public void setpInvpdname(String pInvpdname) {
        this.pInvpdname = pInvpdname;
    }

    @Basic
    @Column(name = "p_inovprodid", nullable = true)
    public Integer getpInovprodid() {
        return pInovprodid;
    }

    public void setpInovprodid(Integer pInovprodid) {
        this.pInovprodid = pInovprodid;
    }

    @Basic
    @Column(name = "p_usespec", nullable = true, length = 2000)
    public String getpUsespec() {
        return pUsespec;
    }

    public void setpUsespec(String pUsespec) {
        this.pUsespec = pUsespec;
    }

    @Basic
    @Column(name = "p_designmemo", nullable = true, length = 2000)
    public String getpDesignmemo() {
        return pDesignmemo;
    }

    public void setpDesignmemo(String pDesignmemo) {
        this.pDesignmemo = pDesignmemo;
    }

    @Basic
    @Column(name = "p_mfrmemo", nullable = true, length = 2000)
    public String getpMfrmemo() {
        return pMfrmemo;
    }

    public void setpMfrmemo(String pMfrmemo) {
        this.pMfrmemo = pMfrmemo;
    }

    @Basic
    @Column(name = "p_realweight", nullable = true, precision = 4)
    public BigDecimal getpRealweight() {
        return pRealweight;
    }

    public void setpRealweight(BigDecimal pRealweight) {
        this.pRealweight = pRealweight;
    }

    @Basic
    @Column(name = "p_machinekind", nullable = true, length = 80)
    public String getpMachinekind() {
        return pMachinekind;
    }

    public void setpMachinekind(String pMachinekind) {
        this.pMachinekind = pMachinekind;
    }

    @Basic
    @Column(name = "p_tempid", nullable = true)
    public Integer getpTempid() {
        return pTempid;
    }

    public void setpTempid(Integer pTempid) {
        this.pTempid = pTempid;
    }

    @Basic
    @Column(name = "p_custpicfilepath", nullable = true, length = 2000)
    public String getpCustpicfilepath() {
        return pCustpicfilepath;
    }

    public void setpCustpicfilepath(String pCustpicfilepath) {
        this.pCustpicfilepath = pCustpicfilepath;
    }

    @Basic
    @Column(name = "p_file", nullable = true, length = 2000)
    public String getpFile() {
        return pFile;
    }

    public void setpFile(String pFile) {
        this.pFile = pFile;
    }

    @Basic
    @Column(name = "p_PicFileName2", nullable = true, length = 200)
    public String getpPicFileName2() {
        return pPicFileName2;
    }

    public void setpPicFileName2(String pPicFileName2) {
        this.pPicFileName2 = pPicFileName2;
    }

    @Basic
    @Column(name = "p_custid", nullable = true)
    public Integer getpCustid() {
        return pCustid;
    }

    public void setpCustid(Integer pCustid) {
        this.pCustid = pCustid;
    }

    @Basic
    @Column(name = "p_cyprice", nullable = true, precision = 4)
    public BigDecimal getpCyprice() {
        return pCyprice;
    }

    public void setpCyprice(BigDecimal pCyprice) {
        this.pCyprice = pCyprice;
    }

    @Basic
    @Column(name = "p_3DImageID", nullable = true)
    public Integer getP3DImageId() {
        return p3DImageId;
    }

    public void setP3DImageId(Integer p3DImageId) {
        this.p3DImageId = p3DImageId;
    }

    @Basic
    @Column(name = "p_testprice", nullable = true, precision = 4)
    public BigDecimal getpTestprice() {
        return pTestprice;
    }

    public void setpTestprice(BigDecimal pTestprice) {
        this.pTestprice = pTestprice;
    }

    @Basic
    @Column(name = "p_radius", nullable = true, precision = 4)
    public BigDecimal getpRadius() {
        return pRadius;
    }

    public void setpRadius(BigDecimal pRadius) {
        this.pRadius = pRadius;
    }

    @Basic
    @Column(name = "p_diameter", nullable = true, precision = 4)
    public BigDecimal getpDiameter() {
        return pDiameter;
    }

    public void setpDiameter(BigDecimal pDiameter) {
        this.pDiameter = pDiameter;
    }

    @Basic
    @Column(name = "p_tall", nullable = true, precision = 4)
    public BigDecimal getpTall() {
        return pTall;
    }

    public void setpTall(BigDecimal pTall) {
        this.pTall = pTall;
    }

    @Basic
    @Column(name = "p_laserqty", nullable = true, precision = 0)
    public Double getpLaserqty() {
        return pLaserqty;
    }

    public void setpLaserqty(Double pLaserqty) {
        this.pLaserqty = pLaserqty;
    }

    @Basic
    @Column(name = "p_invoname", nullable = true, length = 80)
    public String getpInvoname() {
        return pInvoname;
    }

    public void setpInvoname(String pInvoname) {
        this.pInvoname = pInvoname;
    }

    @Basic
    @Column(name = "p_createuser", nullable = true, length = 20)
    public String getpCreateuser() {
        return pCreateuser;
    }

    public void setpCreateuser(String pCreateuser) {
        this.pCreateuser = pCreateuser;
    }

    @Basic
    @Column(name = "p_QTImgFile", nullable = true, length = 200)
    public String getpQtImgFile() {
        return pQtImgFile;
    }

    public void setpQtImgFile(String pQtImgFile) {
        this.pQtImgFile = pQtImgFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return pId == that.pId && Objects.equals(pNo, that.pNo) && Objects.equals(pSpec, that.pSpec) && Objects.equals(pPhon, that.pPhon) && Objects.equals(pInvalid, that.pInvalid) && Objects.equals(pSort, that.pSort) && Objects.equals(pMemo, that.pMemo) && Objects.equals(pMaterial, that.pMaterial) && Objects.equals(pLength, that.pLength) && Objects.equals(pHeight, that.pHeight) && Objects.equals(pWidth, that.pWidth) && Objects.equals(pSize, that.pSize) && Objects.equals(pPricekind, that.pPricekind) && Objects.equals(pPriceUnitid, that.pPriceUnitid) && Objects.equals(pBrand, that.pBrand) && Objects.equals(pPicFileName, that.pPicFileName) && Objects.equals(pImgId, that.pImgId) && Objects.equals(pPrice, that.pPrice) && Objects.equals(pBomid, that.pBomid) && Objects.equals(pCost, that.pCost) && Objects.equals(pLocation, that.pLocation) && Objects.equals(pGoodtype, that.pGoodtype) && Objects.equals(pStock, that.pStock) && Objects.equals(pSuppmaterialno, that.pSuppmaterialno) && Objects.equals(pNameOld, that.pNameOld) && Objects.equals(pName, that.pName) && Objects.equals(pCustfileno, that.pCustfileno) && Objects.equals(pMfrnote, that.pMfrnote) && Objects.equals(pPricemode, that.pPricemode) && Objects.equals(pStockmode, that.pStockmode) && Objects.equals(pUnitweight, that.pUnitweight) && Objects.equals(pMinpurqty, that.pMinpurqty) && Objects.equals(pMemo2, that.pMemo2) && Objects.equals(pIsReportPrice, that.pIsReportPrice) && Objects.equals(pReceivePic, that.pReceivePic) && Objects.equals(pCreateday, that.pCreateday) && Objects.equals(pDepotNo, that.pDepotNo) && Objects.equals(pLastday, that.pLastday) && Objects.equals(pAiid, that.pAiid) && Objects.equals(pDesingimg, that.pDesingimg) && Objects.equals(pVersion, that.pVersion) && Objects.equals(pAvecost, that.pAvecost) && Objects.equals(pBomcost, that.pBomcost) && Objects.equals(pQualityFilepath, that.pQualityFilepath) && Objects.equals(pNCcode, that.pNCcode) && Objects.equals(pTorch, that.pTorch) && Objects.equals(pRepeat, that.pRepeat) && Objects.equals(pInvpdname, that.pInvpdname) && Objects.equals(pInovprodid, that.pInovprodid) && Objects.equals(pUsespec, that.pUsespec) && Objects.equals(pDesignmemo, that.pDesignmemo) && Objects.equals(pMfrmemo, that.pMfrmemo) && Objects.equals(pRealweight, that.pRealweight) && Objects.equals(pMachinekind, that.pMachinekind) && Objects.equals(pTempid, that.pTempid) && Objects.equals(pCustpicfilepath, that.pCustpicfilepath) && Objects.equals(pFile, that.pFile) && Objects.equals(pPicFileName2, that.pPicFileName2) && Objects.equals(pCustid, that.pCustid) && Objects.equals(pCyprice, that.pCyprice) && Objects.equals(p3DImageId, that.p3DImageId) && Objects.equals(pTestprice, that.pTestprice) && Objects.equals(pRadius, that.pRadius) && Objects.equals(pDiameter, that.pDiameter) && Objects.equals(pTall, that.pTall) && Objects.equals(pLaserqty, that.pLaserqty) && Objects.equals(pInvoname, that.pInvoname) && Objects.equals(pCreateuser, that.pCreateuser) && Objects.equals(pQtImgFile, that.pQtImgFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pNo, pSpec, pPhon, pInvalid, pSort, pId, pMemo, pMaterial, pLength, pHeight, pWidth, pSize, pPricekind, pPriceUnitid, pBrand, pPicFileName, pImgId, pPrice, pBomid, pCost, pLocation, pGoodtype, pStock, pSuppmaterialno, pNameOld, pName, pCustfileno, pMfrnote, pPricemode, pStockmode, pUnitweight, pMinpurqty, pMemo2, pIsReportPrice, pReceivePic, pCreateday, pDepotNo, pLastday, pAiid, pDesingimg, pVersion, pAvecost, pBomcost, pQualityFilepath, pNCcode, pTorch, pRepeat, pInvpdname, pInovprodid, pUsespec, pDesignmemo, pMfrmemo, pRealweight, pMachinekind, pTempid, pCustpicfilepath, pFile, pPicFileName2, pCustid, pCyprice, p3DImageId, pTestprice, pRadius, pDiameter, pTall, pLaserqty, pInvoname, pCreateuser, pQtImgFile);
    }
}
