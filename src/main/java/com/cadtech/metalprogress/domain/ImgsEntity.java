package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

//@Entity
@Table(name = "imgs")
public class ImgsEntity {
    private int imgId;
    private byte[] img;
    private String imgType;

    @Id
    @Column(name = "img_id", nullable = false)
    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Basic
    @Column(name = "img", nullable = true)
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @Basic
    @Column(name = "img_type", nullable = true, length = 20)
    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImgsEntity that = (ImgsEntity) o;
        return imgId == that.imgId && Arrays.equals(img, that.img) && Objects.equals(imgType, that.imgType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(imgId, imgType);
        result = 31 * result + Arrays.hashCode(img);
        return result;
    }
}
