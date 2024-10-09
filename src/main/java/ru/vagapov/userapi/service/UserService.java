package ru.vagapov.userapi.service;

import ru.vagapov.userapi.model.UserDto;
import ru.vagapov.user.models.ListUserRequest;
import ru.vagapov.user.models.UserRequest;

import java.util.List;
import java.util.UUID;

/**
 * Данные по пользователю
 */
public interface UserService {

    /**
     * Получить данные по пользователю по гуиду
     *
     * @param userGuid гуид пользователя
     * @return данные по пользователю
     */
    UserDto getUser(UUID userGuid);

    /**
     * Создать пользователя
     *
     * @param userRequest запрос на создание пользователя
     * @return данные по созданному пользователю
     */
    UserDto createUser(UserRequest userRequest);

    /**
     * Обновить пользователя
     *
     * @param userGuid гуид пользователя
     * @param user     данные для обновления
     * @return данные по обновленному пользователю
     */
    UserDto updateUser(UUID userGuid, UserRequest user);

    /**
     * Удалить пользователя
     *
     * @param userGuid гуид пользователя
     * @return данные удаленного пользователя
     */
    UserDto deleteUser(UUID userGuid);

    /**
     * Получить список пользователей
     *
     * @param listUserRequest фильтр для получения списка пользователей
     * @return список пользователей
     */
    List<UserDto> getListUser(ListUserRequest listUserRequest);
}
