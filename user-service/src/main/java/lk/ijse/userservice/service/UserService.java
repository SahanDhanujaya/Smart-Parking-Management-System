package lk.ijse.userservice.service;



import lk.ijse.userservice.dto.BookingResponse;
import lk.ijse.userservice.dto.LoginRequest;
import lk.ijse.userservice.dto.RegisterRequest;
import lk.ijse.userservice.dto.UserProfileResponse;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

public interface UserService {
    void register(RegisterRequest request);
    String login(LoginRequest request);
    UserProfileResponse getProfile(String email);
    List<BookingResponse> getUserBookings(String email);
    UserProfileResponse getUserById(Long id);
    public UserDetails loadUserByUsername(String username) ;

}
