package lk.ijse.paymentservice.repo;

import lk.ijse.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
