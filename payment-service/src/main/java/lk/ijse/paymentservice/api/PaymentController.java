package lk.ijse.paymentservice.api;

import lk.ijse.paymentservice.dto.PaymentRequest;
import lk.ijse.paymentservice.dto.PaymentResponse;
import lk.ijse.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
@RestController
@RequestMapping("payment-service/api/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<PaymentResponse> pay(@RequestBody PaymentRequest request) {
        return ResponseEntity.ok(paymentService.processPayment(request));
    }

    @GetMapping
    public ResponseEntity<List<PaymentResponse>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }

}
