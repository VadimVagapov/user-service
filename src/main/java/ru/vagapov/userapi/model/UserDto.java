package ru.vagapov.userapi.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Данные по пользователю
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDto {

    /**
     * Версия
     */
    private Integer version;

    /**
     * GUID пользователя
     */
    private UUID userGuid;

    /**
     * Признак удаленного пользователя
     */
    private Boolean deleted;

    /**
     * Имя
     */
    private String firstName;

    /**
     * Фамилия
     */
    private String lastName;

    /**
     * Отчество
     */
    private String middleName;

    /**
     * ФИО
     */
    private String fullName;

    /**
     * День рождения
     */
    private LocalDate birthDate;

    /**
     * Место рождения
     */
    private String birthPlace;

    /**
     * Пол
     */
    private String sex;

    /**
     * Буквенный код страны гражданство
     */
    private String citizenshipCode;
}
