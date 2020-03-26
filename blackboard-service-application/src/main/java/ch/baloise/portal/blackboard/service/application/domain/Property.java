package ch.baloise.portal.blackboard.service.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Property {

    @Id
    private Integer id;
    private String userId;
    private String section;
    private String propertyKey;
    private String propertyValue;
}
