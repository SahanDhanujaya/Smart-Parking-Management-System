package lk.ijse.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 16/06/2025 23:03
 * @ProjectDetails SPMS
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Value("${custom.message}")
    private String message;

    @GetMapping
    public String test() {
        return message;
    }
}
