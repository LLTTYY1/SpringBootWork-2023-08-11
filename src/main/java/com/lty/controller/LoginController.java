package com.lty.controller;
import com.lty.pojo.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * date: 2023/9/18 10:38
 * @author Liu tai yuan
 */
@RestController
public class LoginController {

    @GetMapping("/test")
    public ResponseResult login() {
        return ResponseResult.okResult("测试成功");
    }
}
