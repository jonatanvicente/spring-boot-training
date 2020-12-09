package com.training.springbootinitial.service.impl;


import com.training.springbootinitial.dto.UserResponseDto;
import com.training.springbootinitial.repository.UserRepository;
import com.training.springbootinitial.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponseDto getUser(String... data){
        return userRepository.getUser(data);
    }

}
