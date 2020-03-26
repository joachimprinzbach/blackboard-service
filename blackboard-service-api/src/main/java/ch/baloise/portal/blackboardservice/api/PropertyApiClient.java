package ch.baloise.portal.blackboardservice.api;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "blackboard-property-service", url = "${blackboard.service.url:http:/blackboard-service.blackboard-service-${env}}/")
public interface PropertyApiClient {

    @Operation(summary = "get all properties",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Success!")
            })
    @GetMapping("/api/properties")
    Iterable<PropertyDto> getAllProperties();

}
