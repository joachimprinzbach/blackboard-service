package ch.baloise.portal.blackboardservice.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class PropertyDto {

    private int id;

    @NotNull
    @Size(max = 50)
    private String userId;

    @NotNull
    @Size(max = 50)
    private String section;

    @NotNull
    @Size(max = 256)
    private String propertyKey;

    @NotNull
    @Size(max = 256)
    private String propertyValue;
}
