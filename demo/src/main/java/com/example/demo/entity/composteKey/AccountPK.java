package com.example.demo.entity.composteKey;

import com.example.demo.constants.Constants;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AccountPK implements Serializable {
    private static final long serialVersionUID = -5756973760808429993L;

    public Integer getAccId() {
        return AccId;
    }

    public void setAccId(Integer accId) {
        AccId = accId;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public Constants.Day getAccountType() {
        return accountType;
    }

    public void setAccountType(Constants.Day accountType) {
        this.accountType = accountType;
    }

    private Integer AccId;
    private Long accountID;
    private Constants.Day accountType;
}
