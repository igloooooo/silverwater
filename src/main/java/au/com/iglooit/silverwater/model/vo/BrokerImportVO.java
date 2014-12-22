package au.com.iglooit.silverwater.model.vo;

import au.com.iglooit.silverwater.model.entity.Broker;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nicholaszhu on 16/12/2014.
 */
public class BrokerImportVO implements Serializable {
    private String name;
    private String surname;
    private String forename;
    private String email;
    private String address1;
    private String address2;
    private String address3;
    private String phone;
    private String fax;
    private String mobile;
    private String bio;
    private String postCode;
    private Set<String> suburbList = new HashSet<>();
    private String title;

    public BrokerImportVO() {

    }

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

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Set<String> getSuburbList() {
        return suburbList;
    }

    public void setSuburbList(Set<String> suburbList) {
        this.suburbList = suburbList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Broker toBroker() {
        Broker broker = new Broker();
        broker.setAddress1(address1);
        broker.setAddress2(address2);
        broker.setAddress3(address3);
        broker.setBio(bio);
        broker.setEmail(email);
        broker.setFax(fax);
        broker.setForename(forename);
        broker.setMobile(mobile);
        broker.setName(name);
        broker.setPhone(phone);
        broker.setPostcode(postCode);
        broker.setSurname(surname);
        broker.setSuburbList(suburbList);
        broker.setTitle(title);
        return broker;
    }
}
