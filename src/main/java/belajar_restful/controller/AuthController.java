package belajar_restful.controller;

import belajar_restful.entity.User;
import belajar_restful.model.LoginUserRequest;
import belajar_restful.model.TokenResponse;
import belajar_restful.model.WebResponse;
import belajar_restful.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    public AuthService authService;

    @PostMapping(
            path = "/api/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<TokenResponse>Login(@RequestBody LoginUserRequest request){
        TokenResponse tokenResponse = authService.login(request);
        return WebResponse.<TokenResponse>builder().data(tokenResponse).build();
    }


    @DeleteMapping(
            path = "/api/auth/logout",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String>logout(User user){
        authService.logout(user);
        return WebResponse.<String>builder().data("OK").build();
    }
}
