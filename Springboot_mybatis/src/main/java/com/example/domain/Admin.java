package com.example.domain;

public class Admin {
    private String a_id;
    private String a_name;
    private String a_pass;

    public Admin() {
    }

    public Admin(String a_id, String a_name, String a_pass) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.a_pass = a_pass;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pass() {
        return a_pass;
    }

    public void setA_pass(String a_pass) {
        this.a_pass = a_pass;
    }
}
