package com.cadtech.metalprogress.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class BomProcessEntityPK implements Serializable {
    private int bpId;
    private int bpItemid;

    @Column(name = "bp_id", nullable = false)
    @Id
    public int getBpId() {
        return bpId;
    }

    public void setBpId(int bpId) {
        this.bpId = bpId;
    }

    @Column(name = "bp_itemid", nullable = false)
    @Id
    public int getBpItemid() {
        return bpItemid;
    }

    public void setBpItemid(int bpItemid) {
        this.bpItemid = bpItemid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BomProcessEntityPK that = (BomProcessEntityPK) o;
        return bpId == that.bpId && bpItemid == that.bpItemid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bpId, bpItemid);
    }
}
