package com.tatiana.ejemplospring.model;

public class Person {
    private String id;
    private String idType;
    private String name;
    private String lastName;
    private String phone;

    public Person() {
        super();
    }

    public Person(String id, String idType, String name, String lastName, String phone) {
        this.id = id;
        this.idType = idType;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
