package lk.ijse.userservice.dto;
/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public class BookingResponse {
    private Long bookingId;
    private String parkingLocation;
    private String reservedTime;

    public BookingResponse() {
    }

    public BookingResponse(Long bookingId, String parkingLocation, String reservedTime) {
        this.bookingId = bookingId;
        this.parkingLocation = parkingLocation;
        this.reservedTime = reservedTime;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public String getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(String reservedTime) {
        this.reservedTime = reservedTime;
    }
}
