package lk.ijse.paymentservice.client;

import lk.ijse.paymentservice.dto.ParkingRecordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

/**
 * @author Dhanujaya(Dhanu)
 * @TimeStamp 23/06/2025 09:28
 * @ProjectDetails AD2-Coursework-v1
 */
@Component
public class UserClient {
    @Autowired
    private WebClient.Builder webClientBuilder;

    private String parkingServiceUrl =  "http://localhost:8083";


    public ParkingRecordDTO getParkingRecordById(Long id) {
        return webClientBuilder.build()
                .put()
                .uri(parkingServiceUrl + "/parking-service/api/v1/parking-records/end/" + id)
                .retrieve()
                .bodyToMono(ParkingRecordDTO.class)
                .block(); // blocks until response arrives
    }

}

