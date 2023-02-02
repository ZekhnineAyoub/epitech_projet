package com.example.demo.customer_project.requests;


import java.util.Date;

public class CustomerRequest {


    private Long idCustomer;
    private String fistrName;
    private String lastName;
    private String adresse;
    private Date dateOfBirthday;

    public CustomerRequest(Long idCustomer, String fistrName, String lastName, String adresse, Date dateOfBirthday) {
        this.idCustomer = idCustomer;
        this.fistrName = fistrName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.dateOfBirthday = dateOfBirthday;
    }

    public CustomerRequest(){

    }
    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFistrName() {
        return fistrName;
    }

    public void setFistrName(String fistrName) {
        this.fistrName = fistrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
