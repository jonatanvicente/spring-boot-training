package springBootInitial.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootInitial.dto.UserResponseDto;
import springBootInitial.repository.UserRepository;
import springBootInitial.service.IUserService;

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
