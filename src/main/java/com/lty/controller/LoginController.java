package com.lty.controller;
import com.lty.pojo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * date: 2023/9/18 10:38
 * @author Liu tai yuan
 */
@RestController
@Slf4j
public class LoginController {

    @GetMapping("/test")
    public ResponseResult login() {
        log.info("成功启动");
        return ResponseResult.okResult("测试成功");
    }
}
