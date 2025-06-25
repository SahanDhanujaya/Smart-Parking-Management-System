package lk.ijse.vehicleservice.dto;


/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class VehicleRequest {
    private String licensePlate;
    private String type;
    private String userId;  // must be valid on register

    public VehicleRequest() {
    }

    public VehicleRequest(String licensePlate, String type, String userId) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.userId = userId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}