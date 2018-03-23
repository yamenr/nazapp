package com.decode.yamen.nazapp;


/**
 * Created by user138127 on 3/23/18.
 */

public class Site {

    protected int id;
    protected String name;
    protected String category;
    protected String address;
    protected String phone1;
    protected String phone2;
    protected String website;
    protected String email;
    protected String facebook;
    protected String whatsapp;
    protected String notes;

    public Site() {
    }

    public Site(int id, String name, String category, String address, String phone1, String phone2, String website, String email, String facebook, String whatsapp, String notes) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.address = address;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.website = website;
        this.email = email;
        this.facebook = facebook;
        this.whatsapp = whatsapp;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", address='" + address + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
