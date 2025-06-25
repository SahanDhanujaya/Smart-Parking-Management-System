package lk.ijse.paymentservice.dto;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public class PaymentRequest {
    private Long parkingRecordId;
    private String cardNumber;
    private String cardHolder;
    private String paymentMethod;

    public PaymentRequest() {
    }

    public PaymentRequest(Long parkingRecordId, String cardNumber, String cardHolder, String paymentMethod) {
        this.parkingRecordId = parkingRecordId;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.paymentMethod = paymentMethod;
    }

    public Long getParkingRecordId() {
        return parkingRecordId;
    }

    public void setParkingRecordId(Long parkingRecordId) {
        this.parkingRecordId = parkingRecordId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}