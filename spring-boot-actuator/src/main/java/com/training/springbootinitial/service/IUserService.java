package com.training.springbootinitial.service;

import com.training.springbootinitial.dto.UserResponseDto;

public interface IUserService {

    UserResponseDto getUser(String... data);
}
