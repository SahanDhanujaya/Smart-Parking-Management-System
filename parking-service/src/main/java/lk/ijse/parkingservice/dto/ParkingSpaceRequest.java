package lk.ijse.parkingservice.dto;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class ParkingSpaceRequest {
    public Long lotId;

    public ParkingSpaceRequest() {
    }

    public ParkingSpaceRequest(Long lotId) {
        this.lotId = lotId;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }
}