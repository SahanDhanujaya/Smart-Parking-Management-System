package lk.ijse.parkingservice.repo;

import lk.ijse.parkingservice.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {

}
