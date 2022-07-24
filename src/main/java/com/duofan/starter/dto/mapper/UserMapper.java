package com.duofan.starter.dto.mapper;

import com.duofan.starter.dto.model.common.UserDto;
import com.duofan.starter.model.common.User;
import org.springframework.stereotype.Component;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setUsername(user.getUsername())
                .setMobileNumber(user.getMobileNumber())
                .setRole(user.getRole());
    }

}
