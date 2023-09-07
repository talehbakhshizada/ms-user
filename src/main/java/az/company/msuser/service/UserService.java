package az.company.msuser.service;

import az.company.msuser.dao.repository.UserRepository;
import az.company.msuser.mapper.UserMapper;
import az.company.msuser.model.request.SaveUserDto;
import az.company.msuser.model.response.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDto getUserByUserName(String username){
        var user = userRepository.findByUsername(username);
        return UserMapper.mapEntityToDto(user);
    }

    public void saveUser(SaveUserDto dto) {
        userRepository.save(UserMapper.mapDtoToUserEntity(dto));
    }
}