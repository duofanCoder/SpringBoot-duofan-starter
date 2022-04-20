package com.wzh.pms.dto.mapper;

import com.wzh.pms.model.common.User;
import com.wzh.pms.dto.model.common.RoleDto;
import com.wzh.pms.dto.model.common.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.stream.Collectors;

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
