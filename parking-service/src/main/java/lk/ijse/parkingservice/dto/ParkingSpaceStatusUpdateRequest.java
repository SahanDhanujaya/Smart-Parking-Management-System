package lk.ijse.parkingservice.dto;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class ParkingSpaceStatusUpdateRequest {
    public String status; // AVAILABLE, RESERVED, OCCUPIED, BLOCKED
    public String spaceId; // Unique identifier for the parking space
    public Long lotId; // ID of the parking lot to which this space belongs

    public ParkingSpaceStatusUpdateRequest() {
    }

    public ParkingSpaceStatusUpdateRequest(String status, String spaceId, Long lotId) {
        this.status = status;
        this.spaceId = spaceId;
        this.lotId = lotId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }
}
