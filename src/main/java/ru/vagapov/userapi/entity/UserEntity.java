package ru.vagapov.userapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Данные по пользователю
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@DynamicUpdate
@Table(name = "USERS")
@Entity
public class UserEntity{

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    /**
     * Версия
     */
    @Version
    private Short version;

    /**
     * GUID пользователя
     */
    @Column(name = "user_guid")
    private UUID userGuid;

    /**
     * Дата создания пользователя
     */
    @Column(name = "create_date")
    private OffsetDateTime createDate;

    /**
     * Последнее изменение пользователя
     */
    @Column(name = "change_date")
    private OffsetDateTime changeDate;

    /**
     * Признак удаленного пользователя
     */
    @Column(name = "deleted")
    private Boolean deleted = false;

    /**
     * Имя
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Фамилия
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * Отчество
     */
    @Column(name = "middle_name")
    private String middleName;

    /**
     * ФИО
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * День рождения
     */
    @Column(name = "birth_date")
    private OffsetDateTime birthDate;

    /**
     * Место рождения
     */
    @Column(name = "birth_place")
    private String birthPlace;

    /**
     * Пол
     */
    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private SexEntity sex;

    /**
     * Буквенный код страны гражданство
     */
    @Column(name = "citizenship_code")
    private String citizenshipCode;
}
