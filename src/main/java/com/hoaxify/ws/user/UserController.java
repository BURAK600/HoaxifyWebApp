package com.hoaxify.ws.user;

import com.hoaxify.ws.shared.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class UserController {

//    private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

    private final UserService userService;


    @CrossOrigin
    @PostMapping("/api/1.0/users")
    public GenericResponse createUser(@RequestBody User user){
        userService.save(user);

        return  new GenericResponse("User Created");

    }
}
