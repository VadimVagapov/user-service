package ru.vagapov.userapi.dispatcher;

import ru.vagapov.user.models.*;

import java.util.UUID;

/**
 * Сервис распределитель для работы с пользователями
 */
public interface UserDispatcherService {

    /**
     * Получить пользователя
     *
     * @param userGuid гуид пользователя
     * @return ответ по запросу
     */
    ExtendedUserResponse getUser(UUID userGuid);

    /**
     * Создать пользователя
     *
     * @param createUserRequest запрос на создание пользователя
     * @return ответ по запросу
     */
    ExtendedUserResponse createUser(CreateUserRequest createUserRequest);

    /**
     * Обновить пользователя
     *
     * @param updateUserRequest запрос на обновление пользователя
     * @return ответ по запросу
     */
    ExtendedUserResponse updateUser(UpdateUserRequest updateUserRequest);

    /**
     * Удалить пользователя
     *
     * @param version  версия пользователя
     * @param userGuid гуид пользователя
     * @return ответ по запросу
     */
    ExtendedUserResponse deleteUser(Integer version, UUID userGuid);

    /**
     * Получить список пользователей
     *
     * @param listUserRequest запрос на получение списка
     * @return ответ по запросу
     */
    ListUserResponse getListUser(ListUserRequest listUserRequest);
}
