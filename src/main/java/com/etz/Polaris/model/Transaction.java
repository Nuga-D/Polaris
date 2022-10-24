package com.etz.Polaris.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    private String mock_mode;
    private String transaction_ref;
    private String transaction_desc;
    private String transaction_ref_parent;
    private Long amount;
    private Customer customer;
    private Meta meta;
    private String details;

    public String getMock_mode() {
        return mock_mode;
    }

    public void setMock_mode(String mock_mode) {
        this.mock_mode = mock_mode;
    }

    public String getTransaction_ref() {
        return transaction_ref;
    }

    public void setTransaction_ref(String transaction_ref) {
        this.transaction_ref = transaction_ref;
    }

    public String getTransaction_desc() {
        return transaction_desc;
    }

    public void setTransaction_desc(String transaction_desc) {
        this.transaction_desc = transaction_desc;
    }

    public String getTransaction_ref_parent() {
        return transaction_ref_parent;
    }

    public void setTransaction_ref_parent(String transaction_ref_parent) {
        this.transaction_ref_parent = transaction_ref_parent;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
