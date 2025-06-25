package lk.ijse.paymentservice.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vehicleId;
    private Long parkingRecordId;
    private LocalDateTime paidAt;

    private double amount;
    private String paymentMethod; // e.g., CARD, CASH, etc.
    
    @Enumerated(EnumType.STRING)
    private PaymentStatus status; // SUCCESS, FAILED

    private String receiptNumber;

    public Payment() {
    }

    public Payment(Long id, Long vehicleId, Long parkingRecordId, LocalDateTime paidAt, double amount, String paymentMethod, PaymentStatus status, String receiptNumber) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.parkingRecordId = parkingRecordId;
        this.paidAt = paidAt;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.receiptNumber = receiptNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getParkingRecordId() {
        return parkingRecordId;
    }

    public void setParkingRecordId(Long parkingRecordId) {
        this.parkingRecordId = parkingRecordId;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
}
