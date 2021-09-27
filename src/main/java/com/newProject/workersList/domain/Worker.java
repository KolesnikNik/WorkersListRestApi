package com.newProject.workersList.domain;

import javax.persistence.*;

/**
 * Сущность сотрудника
 * содержит нобходимые для идентификации поля
 */
@Entity
@Table(name = "workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "midl_name")
    private String midlName;
    @Column(name = "company")
    private String company;
    @Column(name = "position")
    private String position;
    @Column(name = "phone_number")
    private String phoneNumber;

    /*
        @OneToOne(optional = false, fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private User user;
    */
    public Worker() {
    }

    public Worker(String firstName,
                  String lastName,
                  String midlName,
                  String company,
                  String position,
                  String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midlName = midlName;
        this.company = company;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidlName() {
        return midlName;
    }

    public void setMidlName(String midlName) {
        this.midlName = midlName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
