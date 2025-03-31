package belajar_restful.controller;


import belajar_restful.entity.User;
import belajar_restful.model.RegisterUserRequest;
import belajar_restful.model.UpdateUserRequest;
import belajar_restful.model.UserResponse;
import belajar_restful.model.WebResponse;
import belajar_restful.repository.UserRepository;
import belajar_restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(
            path = "/api/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE

    )

    public WebResponse<String>Register(@RequestBody RegisterUserRequest request) {
        userService.Register(request);

        return WebResponse.<String>builder().data("OK").build();

    }

    @GetMapping(
            path = "/api/users/current",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UserResponse> get (User user){
        UserResponse userResponse = userService.get(user);
        return WebResponse.<UserResponse>builder().data(userResponse).build();
    }

    @PatchMapping(
            path = "/api/users/current",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UserResponse>update(User user, @RequestBody UpdateUserRequest request){
        UserResponse userResponse = userService.update(user , request);

        return WebResponse.<UserResponse>builder().data(userResponse).build();
    }
}
