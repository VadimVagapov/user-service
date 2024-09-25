package ru.vagapov.userapi.config;

import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

public class ExternalRegistryPostgreSQLContainer <SELF extends ExternalRegistryPostgreSQLContainer<SELF>> extends PostgreSQLContainer<SELF> {
    public ExternalRegistryPostgreSQLContainer(String dockerImageName) {
        super(DockerImageName.parse(dockerImageName).asCompatibleSubstituteFor("postgres"));
    }
}
