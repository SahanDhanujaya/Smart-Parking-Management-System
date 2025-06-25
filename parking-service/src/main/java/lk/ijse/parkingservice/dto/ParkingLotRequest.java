package lk.ijse.parkingservice.dto;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
public class ParkingLotRequest {
    public String name;
    public String location;
    private int totalSpaces;
    private int ownerId;

    public ParkingLotRequest() {
    }

    public ParkingLotRequest(String name, String location, int totalSpaces, int ownerId) {
        this.name = name;
        this.location = location;
        this.totalSpaces = totalSpaces;
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public void setTotalSpaces(int totalSpaces) {
        this.totalSpaces = totalSpaces;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}


