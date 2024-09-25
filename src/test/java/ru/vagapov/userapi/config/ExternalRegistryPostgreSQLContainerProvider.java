package ru.vagapov.userapi.config;

import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainerProvider;

public class ExternalRegistryPostgreSQLContainerProvider extends PostgreSQLContainerProvider {

    private static final String CONTAINER_NAME = "postgres";

    private static final String NAME = "pg";

    @Override
    public boolean supports(String databaseType) {
        return NAME.equals(databaseType);
    }

    @Override
    public JdbcDatabaseContainer<?> newInstance(String tag) {
        return new ExternalRegistryPostgreSQLContainer<>(CONTAINER_NAME + ":" + tag);
    }
}
