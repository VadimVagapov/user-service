package ru.vagapov.userapi;

import org.springframework.boot.test.web.server.LocalServerPort;
import ru.vagapov.userapi.config.annotation.IntegrationSpringBootTest;

/**
 * Базовый класс для интеграционных тестов
 */
@IntegrationSpringBootTest
public class BaseIntegrationTest {

    @LocalServerPort
    protected int port;
}
