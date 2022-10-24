package com.etz.Polaris.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    private String customer_ref;
    private String firstname;
    private String surname;
    private String email;
    private String mobile_no;

    public String getCustomer_ref() {
        return customer_ref;
    }

    public void setCustomer_ref(String customer_ref) {
        this.customer_ref = customer_ref;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "Customer{\n" +
                "    \"customer_ref\":" + customer_ref + ",\n" +
                "    \"firstname\":" + firstname + ",\n" +
                "    \"surname\":" + surname + ",\n" +
                "    \"email\":" + email + ",\n" +
                "    \"mobile_no\":" + mobile_no + ",\n" +
                "}";
    }
}
