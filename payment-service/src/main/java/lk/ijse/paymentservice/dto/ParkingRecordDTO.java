package lk.ijse.paymentservice.dto;


import java.time.LocalDateTime;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public class ParkingRecordDTO {
    private Long id;
    private Long vehicleId;
    private Long parkingSpaceId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public ParkingRecordDTO() {
    }

    public ParkingRecordDTO(Long id, Long vehicleId, Long parkingSpaceId, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.parkingSpaceId = parkingSpaceId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
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

    public Long getParkingSpaceId() {
        return parkingSpaceId;
    }

    public void setParkingSpaceId(Long parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
