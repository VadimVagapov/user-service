package ru.vagapov.userapi.dispatcher;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.vagapov.user.models.CreateUser;
import ru.vagapov.user.models.CreateUserRequest;
import ru.vagapov.user.models.Sex;
import ru.vagapov.user.models.UserRequest;
import ru.vagapov.userapi.BaseIntegrationTest;

import java.time.LocalDate;

class UserDispatcherServiceTest extends BaseIntegrationTest {

    @Autowired
    private UserDispatcherService userDispatcherService;

    @Test
    void createUser() {
        CreateUserRequest request = getCreateUserRequest();

        userDispatcherService.createUser(request);
    }

    private CreateUserRequest getCreateUserRequest() {
        return new CreateUserRequest()
                .data(new CreateUser()
                        .user(new UserRequest()
                                .firstName("Вадим")
                                .middleName("Вагапов")
                                .lastName("Русланович")
                                .birthDate(LocalDate.of(1996, 3, 19))
                                .sex(Sex.M)
                                .citizenshipCode("RUS")));
    }
}
