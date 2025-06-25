package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.entity.ParkingRecord;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public interface ParkingRecordService {
    public ParkingRecord startParking(String licensePlate, Long spaceId);

    public ParkingRecord endParking(Long recordId);
}
