package com.cadtech.metalprogress.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "userlist")
public class UserlistEntity {
    private String userid;
    private String usernm;
    private String userpw;
    private String userright;
    private char specright;
    private boolean isgroup;
    private String groupid;

    @Id
    @Column(name = "userid", nullable = false, length = 10)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "usernm", nullable = false, length = 20)
    public String getUsernm() {
        return usernm;
    }

    public void setUsernm(String usernm) {
        this.usernm = usernm;
    }

    @Basic
    @Column(name = "userpw", nullable = true, length = 20)
    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    @Basic
    @Column(name = "userright", nullable = true, length = 100)
    public String getUserright() {
        return userright;
    }

    public void setUserright(String userright) {
        this.userright = userright;
    }

    @Basic
    @Column(name = "specright", nullable = true, length = 100)
    public char getSpecright() {
        return specright;
    }

    public void setSpecright(char specright) {
        this.specright = specright;
    }

    @Basic
    @Column(name = "isgroup", nullable = false)
    public boolean isIsgroup() {
        return isgroup;
    }

    public void setIsgroup(boolean isgroup) {
        this.isgroup = isgroup;
    }

    @Basic
    @Column(name = "groupid", nullable = true, length = 10)
    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserlistEntity that = (UserlistEntity) o;
        return isgroup == that.isgroup && Objects.equals(userid, that.userid) && Objects.equals(usernm, that.usernm) && Objects.equals(userpw, that.userpw) && Objects.equals(userright, that.userright) && Objects.equals(specright, that.specright) && Objects.equals(groupid, that.groupid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, usernm, userpw, userright, specright, isgroup, groupid);
    }
}
