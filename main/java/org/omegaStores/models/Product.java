package org.omegaStores.models;

public class Product {
    private Integer productPrice;
    private String productName;
    private Integer productPurchaseQuantity;
    private Integer productStockQuantity;

    public Product(String productName, Integer productPurchaseQuantity) {
        this.productName = productName;
        this.productPurchaseQuantity = productPurchaseQuantity;
    }

    public Product(Integer productPrice, String productName, Integer productPurchaseQuantity, Integer productStockQuantity) {
        this.productPrice = productPrice;
        this.productName = productName;
        this.productPurchaseQuantity = productPurchaseQuantity;
        this.productStockQuantity = productStockQuantity;
    }

    public Product() {
    }

    public Integer getProductStockQuantity() {
        return productStockQuantity;
    }

    public void setProductStockQuantity(Integer productStockQuantity) {
        this.productStockQuantity = productStockQuantity;
    }
    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPurchaseQuantity() { return productPurchaseQuantity; }

    public void setProductPurchaseQuantity(Integer productPurchaseQuantity) { this.productPurchaseQuantity = productPurchaseQuantity; }

}
