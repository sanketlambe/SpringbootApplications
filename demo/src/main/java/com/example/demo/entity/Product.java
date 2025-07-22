package com.example.demo.entity;

import com.example.demo.entity.composteKey.AccountPK;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Product {

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public AccountPK getAccountPK() {
        return accountPK;
    }

    public void setAccountPK(AccountPK accountPK) {
        this.accountPK = accountPK;
    }

    private Integer productId;
    private String productName;
    private Double productPrice;
    @EmbeddedId
    private AccountPK accountPK;
}
