package com.cadtech.metalprogress.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "prod_unit")
public class ProdUnitEntity {
    private int puId;
    private String puName;

    private List<ProductEntity> productEntities;

//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property ="pId" )
    @JsonManagedReference
    @OneToMany(mappedBy = "prodUnitEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }

    @Id
    @Column(name = "pu_id", nullable = false)
    public int getPuId() {
        return puId;
    }

    public void setPuId(int puId) {
        this.puId = puId;
    }

    @Basic
    @Column(name = "pu_name", nullable = false, length = 10)
    public String getPuName() {
        return puName;
    }

    public void setPuName(String puName) {
        this.puName = puName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdUnitEntity that = (ProdUnitEntity) o;
        return puId == that.puId && Objects.equals(puName, that.puName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puId, puName);
    }
}
