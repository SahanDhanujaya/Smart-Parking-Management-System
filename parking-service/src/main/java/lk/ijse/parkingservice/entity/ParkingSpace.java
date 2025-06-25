package lk.ijse.parkingservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String spaceId;

    @Enumerated(EnumType.STRING)
    private ParkingStatus status = ParkingStatus.AVAILABLE;

    @ManyToOne
    @JoinColumn(name = "lot_id")
    @JsonIgnore
    private ParkingLot parkingLot;

    public ParkingSpace() {
    }

    public ParkingSpace(Long id, String spaceId, ParkingStatus status, ParkingLot parkingLot) {
        this.id = id;
        this.spaceId = spaceId;
        this.status = status;
        this.parkingLot = parkingLot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
