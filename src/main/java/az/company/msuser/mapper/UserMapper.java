package az.company.msuser.mapper;

import az.company.msuser.dao.entity.UserEntity;
import az.company.msuser.model.request.SaveUserDto;
import az.company.msuser.model.response.UserResponseDto;

import java.time.LocalDateTime;

public class UserMapper {
    public static UserEntity mapDtoToUserEntity(SaveUserDto saveUserDto) {
        return UserEntity.builder()
                .password(saveUserDto.getPassword())
                .username(saveUserDto.getUsername())
                .status(1)
                .updatedAt(LocalDateTime.now())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static UserResponseDto mapEntityToDto(UserEntity userEntity) {
        return UserResponseDto.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .build();
    }


}