package lk.ijse.parkingservice.dto;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class ParkingLotResponse {
    private Long id;
    public String name;
    public String location;
    private int totalSpaces;

    public ParkingLotResponse() {
    }

    public ParkingLotResponse(Long id, String name, String location, int totalSpaces) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.totalSpaces = totalSpaces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
