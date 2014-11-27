package au.com.iglooit.silverwater.model.entity;

import com.google.appengine.api.search.Document;

import javax.persistence.Entity;

@Entity
public class Broker extends BaseEntity {
    private String name;
    private String surname;
    private String furname;
    private String email;
    private String address1;
    private String address2;
    private String address3;
    private String phone;
    private String fax;
    private String mobile;
    private String bio;
    private Integer rank = 3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFurname() {
        return furname;
    }

    public void setFurname(String furname) {
        this.furname = furname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public Document toFullTextDocument() {
        return null;
    }

    @Override
    public Document toGeoDocument() {
        return null;
    }
}
