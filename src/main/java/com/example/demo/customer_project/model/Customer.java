package com.example.demo.customer_project.model;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
public class Customer {


    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence")
    private Long idCustomer;
    @Column(name = "fistName")
    private String fistrName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "dateOfBirthday")
    private Date dateOfBirthday;

    public Customer(Long idCustomer, String fistrName, String lastName, String adresse, Date dateOfBirthday) {
        this.idCustomer = idCustomer;
        this.fistrName = fistrName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Customer(){

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


