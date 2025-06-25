package lk.ijse.paymentservice.dto;

import java.time.LocalDateTime;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class PaymentResponse {
    private String receiptNumber;
    private double amount;
    private LocalDateTime paidAt;
    private String status;

    public PaymentResponse() {
    }

    public PaymentResponse(String receiptNumber, double amount, LocalDateTime paidAt, String status) {
        this.receiptNumber = receiptNumber;
        this.amount = amount;
        this.paidAt = paidAt;
        this.status = status;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}