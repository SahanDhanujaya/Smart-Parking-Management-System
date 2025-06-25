package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.dto.PaymentRequest;
import lk.ijse.paymentservice.dto.PaymentResponse;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public interface PaymentService {
    public PaymentResponse processPayment(PaymentRequest request);

    List<PaymentResponse> getAllPayments();
}
