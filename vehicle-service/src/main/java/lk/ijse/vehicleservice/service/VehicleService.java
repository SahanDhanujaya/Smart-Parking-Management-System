package lk.ijse.vehicleservice.service;

import lk.ijse.vehicleservice.dto.VehicleRequest;
import lk.ijse.vehicleservice.dto.VehicleResponse;

import java.util.List;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */


public interface VehicleService {
    VehicleResponse registerVehicle(VehicleRequest request);
    VehicleResponse getVehicle(Long id);
    List<VehicleResponse> getVehiclesByUserId(Long userId);
    VehicleResponse updateVehicle(Long id, VehicleRequest request);
    void deleteVehicle(Long id);
    VehicleResponse simulateEntry(Long id);
    VehicleResponse simulateExit(Long id);

    VehicleResponse getVehicleByLicensePlate(String licensePlate);
}
