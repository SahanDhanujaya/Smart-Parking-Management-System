package lk.ijse.parkingservice.entity;

import jakarta.persistence.*;

import java.util.List;


/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

@Entity
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int ownerId;

    @OneToMany(mappedBy = "parkingLot", cascade = CascadeType.ALL)
    private List<ParkingSpace> spaces;

    public ParkingLot() {
    }

    public ParkingLot(Long id, String name, String location, int ownerId, List<ParkingSpace> spaces) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.ownerId = ownerId;
        this.spaces = spaces;
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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public List<ParkingSpace> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<ParkingSpace> spaces) {
        this.spaces = spaces;
    }
}
