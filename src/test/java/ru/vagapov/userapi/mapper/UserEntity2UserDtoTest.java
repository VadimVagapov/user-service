package ru.vagapov.userapi.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.vagapov.userapi.entity.UserEntity;
import ru.vagapov.userapi.model.UserDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserEntity2UserDtoTest {

    private final UserEntity2UserDto userEntity2UserDto = new UserEntity2UserDtoImpl();

    @Test
    void testGetUserDto() {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName("firstName");
        userEntity.setLastName("lastName");

        UserDto map = userEntity2UserDto.map(userEntity);

        assertEquals(userEntity.getFirstName(), map.getFirstName());
        assertEquals(userEntity.getLastName(), map.getLastName());
    }
}
