package com.duofan.starter.controller.v1.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Arpit Khandelwal.
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSignupRequest {
    @NotBlank(message = "用户名不能为空")
    @NotEmpty(message = "用户名不能为空")
    private String username;
    

    @NotBlank(message = "密码不能为空")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
