package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.dto.ParkingLotRequest;
import lk.ijse.parkingservice.entity.ParkingLot;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public interface ParkingLotService{
    ParkingLot createLot(ParkingLotRequest request);

    List<ParkingLot> getAllLots();

    ParkingLot updateParkingLot(Long id, ParkingLotRequest request);

    void deleteParkingLot(Long id);
}
