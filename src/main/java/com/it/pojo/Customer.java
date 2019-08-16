package com.it.pojo;

public class Customer {

    private Integer custId;

    private String custName;

    private String address;

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getCustId() {
        return custId;
    }

    public Customer setCustId(Integer custId) {
        this.custId = custId;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public Customer setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }
}
