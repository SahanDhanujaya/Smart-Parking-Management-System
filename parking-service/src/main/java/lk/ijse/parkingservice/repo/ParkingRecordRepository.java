package lk.ijse.parkingservice.repo;

import lk.ijse.parkingservice.entity.ParkingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public interface ParkingRecordRepository extends JpaRepository<ParkingRecord, Long> {
}