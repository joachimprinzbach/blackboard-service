package ch.baloise.portal.blackboard.service.application.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories
public class PropertyRepositoryConfiguration extends AbstractJdbcConfiguration {
}
