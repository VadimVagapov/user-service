package ru.vagapov.userapi.validation.impl;

import org.springframework.stereotype.Service;
import ru.vagapov.userapi.validation.ValidationUserService;

import java.util.UUID;

@Service
public class ValidationUserServiceImpl implements ValidationUserService {

    @Override
    public void validRequest(Object request) {

    }

    @Override
    public void validVersion(Integer version, UUID userGuid) {

    }
}
