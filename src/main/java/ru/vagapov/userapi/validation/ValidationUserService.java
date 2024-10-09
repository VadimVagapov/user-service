package ru.vagapov.userapi.validation;

import java.util.UUID;

/**
 * Сервис валидации запросов по пользователю
 */
public interface ValidationUserService {

    /**
     * Валидировать запрос
     *
     * @param value сам запрос
     */
    void validRequest(Object value);

    /**
     * Валидировать версию пользователя
     *
     * @param version  версия пользователя
     * @param userGuid гуид пользователя
     */
    void validVersion(Integer version, UUID userGuid);
}
