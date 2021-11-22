package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "MakeOrderDetail")
public class MakeOrderDetailEntity {
    private int autono;
    private short itemno;
    private String mMfrDetail;
    private String mSurface;
    private String mColor;
    private String mMemo;
    private Integer mBomid;
    private String mBomlevel;
    private Integer mBomparentid;
    private Short mBomlevels;
    private Integer mBomRootBomId;
    private Boolean mBomHasChild;
    private String mMaincolor;
    private Boolean mPointweld;
    private boolean mIsAttach;
    private String mNccode;

    private List<MakeOrderProcessEntity> makeOrderProcessEntities;

    private ProductEntity productEntity;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "m_pdid")
    public ProductEntity getProductEntity() {
        return productEntity;
    }


    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @JsonManagedReference
    @OneToMany(mappedBy = "makeOrderDetailEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<MakeOrderProcessEntity> getMakeOrderProcessEntities() {
        return makeOrderProcessEntities;
    }

    public void setMakeOrderProcessEntities(List<MakeOrderProcessEntity> makeOrderProcessEntities) {
        this.makeOrderProcessEntities = makeOrderProcessEntities;
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
    @Column(name = "itemno", nullable = false)
    public short getItemno() {
        return itemno;
    }

    public void setItemno(short itemno) {
        this.itemno = itemno;
    }

    @Basic
    @Column(name = "m_MfrDetail", nullable = true, length = 400)
    public String getmMfrDetail() {
        return mMfrDetail;
    }

    public void setmMfrDetail(String mMfrDetail) {
        this.mMfrDetail = mMfrDetail;
    }

    @Basic
    @Column(name = "m_surface", nullable = true, length = 400)
    public String getmSurface() {
        return mSurface;
    }

    public void setmSurface(String mSurface) {
        this.mSurface = mSurface;
    }

    @Basic
    @Column(name = "m_color", nullable = true, length = 100)
    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    @Basic
    @Column(name = "m_memo", nullable = true, length = 400)
    public String getmMemo() {
        return mMemo;
    }

    public void setmMemo(String mMemo) {
        this.mMemo = mMemo;
    }

    @Basic
    @Column(name = "m_bomid", nullable = true)
    public Integer getmBomid() {
        return mBomid;
    }

    public void setmBomid(Integer mBomid) {
        this.mBomid = mBomid;
    }

    @Basic
    @Column(name = "m_bomlevel", nullable = true, length = 20)
    public String getmBomlevel() {
        return mBomlevel;
    }

    public void setmBomlevel(String mBomlevel) {
        this.mBomlevel = mBomlevel;
    }

    @Basic
    @Column(name = "m_bomparentid", nullable = true)
    public Integer getmBomparentid() {
        return mBomparentid;
    }

    public void setmBomparentid(Integer mBomparentid) {
        this.mBomparentid = mBomparentid;
    }

    @Basic
    @Column(name = "m_bomlevels", nullable = true)
    public Short getmBomlevels() {
        return mBomlevels;
    }

    public void setmBomlevels(Short mBomlevels) {
        this.mBomlevels = mBomlevels;
    }

    @Basic
    @Column(name = "m_bom_root_bom_id", nullable = true)
    public Integer getmBomRootBomId() {
        return mBomRootBomId;
    }

    public void setmBomRootBomId(Integer mBomRootBomId) {
        this.mBomRootBomId = mBomRootBomId;
    }

    @Basic
    @Column(name = "m_bom_hasChild", nullable = true)
    public Boolean getmBomHasChild() {
        return mBomHasChild;
    }

    public void setmBomHasChild(Boolean mBomHasChild) {
        this.mBomHasChild = mBomHasChild;
    }

    @Basic
    @Column(name = "m_maincolor", nullable = true, length = 60)
    public String getmMaincolor() {
        return mMaincolor;
    }

    public void setmMaincolor(String mMaincolor) {
        this.mMaincolor = mMaincolor;
    }

    @Basic
    @Column(name = "m_pointweld", nullable = true)
    public Boolean getmPointweld() {
        return mPointweld;
    }

    public void setmPointweld(Boolean mPointweld) {
        this.mPointweld = mPointweld;
    }

    @Basic
    @Column(name = "m_isAttach", nullable = false)
    public boolean ismIsAttach() {
        return mIsAttach;
    }

    public void setmIsAttach(boolean mIsAttach) {
        this.mIsAttach = mIsAttach;
    }

    @Basic
    @Column(name = "m_Nccode", nullable = true, length = 10)
    public String getmNccode() {
        return mNccode;
    }

    public void setmNccode(String mNccode) {
        this.mNccode = mNccode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MakeOrderDetailEntity that = (MakeOrderDetailEntity) o;
        return autono == that.autono && itemno == that.itemno && mIsAttach == that.mIsAttach && Objects.equals(mMfrDetail, that.mMfrDetail) && Objects.equals(mSurface, that.mSurface) && Objects.equals(mColor, that.mColor) && Objects.equals(mMemo, that.mMemo) && Objects.equals(mBomid, that.mBomid) && Objects.equals(mBomlevel, that.mBomlevel) && Objects.equals(mBomparentid, that.mBomparentid) && Objects.equals(mBomlevels, that.mBomlevels) && Objects.equals(mBomRootBomId, that.mBomRootBomId) && Objects.equals(mBomHasChild, that.mBomHasChild) && Objects.equals(mMaincolor, that.mMaincolor) && Objects.equals(mPointweld, that.mPointweld) && Objects.equals(mNccode, that.mNccode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autono, itemno, mMfrDetail, mSurface, mColor, mMemo, mBomid, mBomlevel, mBomparentid, mBomlevels, mBomRootBomId, mBomHasChild, mMaincolor, mPointweld, mIsAttach, mNccode);
    }
}
