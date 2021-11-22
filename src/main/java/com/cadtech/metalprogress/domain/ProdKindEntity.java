package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "prod_kind")
public class ProdKindEntity {
    private int pkId;
    private String pkName;
    private Boolean pkDefault;
    private String pkSysname;
    private String pkCode;
    private String pkDepotno;
    private Integer pkUnitid;
    private Integer pkAcciid;
    private boolean pkNot2Make;

    private List<ProductEntity> productEntities;

    @JsonManagedReference
    @OneToMany(mappedBy = "prodKindEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "pk_name", nullable = true, length = 30)
    public String getPkName() {
        return pkName;
    }

    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    @Basic
    @Column(name = "pk_default", nullable = true)
    public Boolean getPkDefault() {
        return pkDefault;
    }

    public void setPkDefault(Boolean pkDefault) {
        this.pkDefault = pkDefault;
    }

    @Basic
    @Column(name = "pk_sysname", nullable = true, length = 30)
    public String getPkSysname() {
        return pkSysname;
    }

    public void setPkSysname(String pkSysname) {
        this.pkSysname = pkSysname;
    }

    @Basic
    @Column(name = "pk_code", nullable = true, length = 20)
    public String getPkCode() {
        return pkCode;
    }

    public void setPkCode(String pkCode) {
        this.pkCode = pkCode;
    }

    @Basic
    @Column(name = "pk_depotno", nullable = true, length = 10)
    public String getPkDepotno() {
        return pkDepotno;
    }

    public void setPkDepotno(String pkDepotno) {
        this.pkDepotno = pkDepotno;
    }

    @Basic
    @Column(name = "pk_unitid", nullable = true)
    public Integer getPkUnitid() {
        return pkUnitid;
    }

    public void setPkUnitid(Integer pkUnitid) {
        this.pkUnitid = pkUnitid;
    }

    @Basic
    @Column(name = "pk_acciid", nullable = true)
    public Integer getPkAcciid() {
        return pkAcciid;
    }

    public void setPkAcciid(Integer pkAcciid) {
        this.pkAcciid = pkAcciid;
    }

    @Basic
    @Column(name = "pk_not2make", nullable = false)
    public boolean isPkNot2Make() {
        return pkNot2Make;
    }

    public void setPkNot2Make(boolean pkNot2Make) {
        this.pkNot2Make = pkNot2Make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdKindEntity that = (ProdKindEntity) o;
        return pkId == that.pkId && pkNot2Make == that.pkNot2Make && Objects.equals(pkName, that.pkName) && Objects.equals(pkDefault, that.pkDefault) && Objects.equals(pkSysname, that.pkSysname) && Objects.equals(pkCode, that.pkCode) && Objects.equals(pkDepotno, that.pkDepotno) && Objects.equals(pkUnitid, that.pkUnitid) && Objects.equals(pkAcciid, that.pkAcciid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, pkName, pkDefault, pkSysname, pkCode, pkDepotno, pkUnitid, pkAcciid, pkNot2Make);
    }
}
