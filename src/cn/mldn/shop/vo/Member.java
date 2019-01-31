package cn.mldn.shop.vo;

import java.util.Date;

public class Member implements java.io.Serializable {
    private String mid;
    private String name;
    private String password;
    private String phone;
    private String adderss;
    private String code;
    private Date regdate;
    private String photo;
    private Integer status;

    public Member() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Member(String mid, String name, String password, String phone, String adderss, String code, Date regdate, String photo) {
        this.mid = mid;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.adderss = adderss;
        this.code = code;
        this.regdate = regdate;
        this.photo = photo;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
