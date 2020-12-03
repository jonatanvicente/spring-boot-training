package springBootInitial.service;

import springBootInitial.dto.UserResponseDto;

public interface IUserService {

    UserResponseDto getUser(String... data);
}
