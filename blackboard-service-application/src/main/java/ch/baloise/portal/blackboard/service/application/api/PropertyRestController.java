package ch.baloise.portal.blackboard.service.application.api;

import ch.baloise.portal.blackboard.service.application.domain.Property;
import ch.baloise.portal.blackboardservice.api.PropertyApiClient;
import ch.baloise.portal.blackboardservice.api.PropertyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
class PropertyRestController implements PropertyApiClient {

    private final PropertyService propertyService;


    @Override
    public Iterable<PropertyDto> getAllProperties() {
        Iterable<Property> allProperties = propertyService.getAllProperties();
        Set<Property> properties = new HashSet<>();
        allProperties.forEach(properties::add);
        return properties
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toSet());
    }

    private PropertyDto mapToDto(Property property) {
        return new PropertyDto(property.getId(), property.getUserId(), property.getSection(), property.getPropertyKey(), property.getPropertyValue());
    }

}
