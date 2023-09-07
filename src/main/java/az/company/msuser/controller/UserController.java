package az.company.msuser.controller;

import az.company.msuser.model.request.SaveUserDto;
import az.company.msuser.model.response.UserResponseDto;
import az.company.msuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public UserResponseDto getUser(@RequestParam String username) {
        return userService.getUserByUserName(username);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody SaveUserDto dto) {
        userService.saveUser(dto);
    }
}
