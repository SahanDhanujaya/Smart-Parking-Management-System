package lk.ijse.parkingservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

@Entity
public class ParkingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String licensePlate;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    private Long durationMinutes;

    @ManyToOne
    @JoinColumn(name = "space_id")
    private ParkingSpace parkingSpace;

    public ParkingRecord() {
    }

    public ParkingRecord(Long id, String licensePlate, LocalDateTime entryTime, LocalDateTime exitTime, Long durationMinutes, ParkingSpace parkingSpace) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.durationMinutes = durationMinutes;
        this.parkingSpace = parkingSpace;
    }

    public ParkingRecord(String licensePlate, LocalDateTime now, ParkingSpace space) {
        this.licensePlate = licensePlate;
        this.entryTime = now;
        this.parkingSpace = space;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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

    public Long getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Long durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}
