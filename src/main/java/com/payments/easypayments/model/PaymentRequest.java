package com.payments.easypayments.model;

public class PaymentRequest {

    private Money amount;
    private Account fromAccount;
    private Account toAccount;
    private String fromPhoneNo;
    private String toPhoneNo;
    private String transactionId;

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public String getFromPhoneNo() {
        return fromPhoneNo;
    }

    public void setFromPhoneNo(String fromPhoneNo) {
        this.fromPhoneNo = fromPhoneNo;
    }

    public String getToPhoneNo() {
        return toPhoneNo;
    }

    public void setToPhoneNo(String toPhoneNo) {
        this.toPhoneNo = toPhoneNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
