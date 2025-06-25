package lk.ijse.userservice.api;


import lk.ijse.userservice.dto.BookingResponse;
import lk.ijse.userservice.dto.LoginRequest;
import lk.ijse.userservice.dto.RegisterRequest;
import lk.ijse.userservice.dto.UserProfileResponse;
import lk.ijse.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */

@RestController
@RequestMapping("user-service/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("get")
    public String getUser(){
        return "User";
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        userService.register(request);
        return ResponseEntity.ok("User registered successfully.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        String token = userService.login(request);
        return ResponseEntity.ok(token);
    }

    @GetMapping("profile/{email}")
    public ResponseEntity<UserDetails> getProfile(@PathVariable String email) {
        return ResponseEntity.ok(userService.loadUserByUsername(email));
    }

    @GetMapping("/bookings")
    public ResponseEntity<List<BookingResponse>> getBookings(@RequestParam String email) {
        return ResponseEntity.ok(userService.getUserBookings(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfileResponse> getUserById(@PathVariable Long id) {
        UserProfileResponse user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

}
