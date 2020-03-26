package ch.baloise.portal.blackboard.service.application.api;

import ch.baloise.portal.blackboard.service.application.domain.Property;
import ch.baloise.portal.blackboard.service.application.infrastructure.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public Iterable<Property> getAllProperties() {
        return propertyRepository.findAll();
    }
}
