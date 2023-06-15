package org.omegaStores.models;

public class Customer {
    private Integer purchasePower;
    private String customerName;
    private String contactNumber;

    private Integer customerChange;

    public Customer(String customerName, String contactNumber, Integer purchasePower) {
        this.purchasePower = purchasePower;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    public Customer(Integer purchasePower, String customerName, String contactNumber, Integer customerChange) {
        this.purchasePower = purchasePower;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerChange = customerChange;
    }

    public Integer getCustomerChange() {
        return customerChange;
    }

    public void setCustomerChange(Integer customerChange) {
        this.customerChange = customerChange;
    }

    public Integer getPurchasePower() {
        return purchasePower;
    }

    public void setPurchasePower(Integer purchasePower) {
        this.purchasePower = purchasePower;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "purchasePower=" + purchasePower +
                ", customerName='" + customerName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
