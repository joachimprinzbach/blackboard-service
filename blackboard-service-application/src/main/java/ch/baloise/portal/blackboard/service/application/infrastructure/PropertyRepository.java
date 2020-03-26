package ch.baloise.portal.blackboard.service.application.infrastructure;

import ch.baloise.portal.blackboard.service.application.domain.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Integer> {
}
