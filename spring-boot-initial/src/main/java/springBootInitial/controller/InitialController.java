package springBootInitial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springBootInitial.dto.UserResponseDto;
import springBootInitial.service.IUserService;

@RestController
@RequestMapping("/v1")
public class InitialController {

    private final IUserService userService;

    @Autowired
    public InitialController(IUserService userService){
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test Passed!!";
    }

    @GetMapping("/user/{name}/{surname}/{gender}")
    public ResponseEntity<UserResponseDto> updatePrescription(
            @PathVariable(name="name") String name,
            @PathVariable(name="surname") String surname,
            @PathVariable(name="gender") String gender) throws Exception {

        UserResponseDto userResponseDto = userService.getUser(name, surname, gender);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }


}
