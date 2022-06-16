package com.sun.diy.dto.mapper;

import com.sun.diy.model.common.User;
import com.sun.diy.dto.model.common.UserDto;
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
