package com.duofan.starter.controller.v1.api;

import com.duofan.starter.dto.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/test")
@Api(value = "application")
public class TestController {

    @ApiOperation("demo1")
    @PostMapping("/demo1")
    public Response test() {
     return    Response.ok().setMessage("操作成功!");
    }
}
