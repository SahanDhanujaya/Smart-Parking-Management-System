package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.dto.ParkingSpaceRequest;
import lk.ijse.parkingservice.dto.ParkingSpaceStatusUpdateRequest;
import lk.ijse.parkingservice.entity.ParkingSpace;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public interface ParkingSpaceService {
    List<ParkingSpace> getSpacesByLot(Long lotId);
    ParkingSpace createSpace(ParkingSpaceRequest request);
    ParkingSpace updateStatus(Long id, ParkingSpaceStatusUpdateRequest status);

    void deleteSpace(Long id);
}