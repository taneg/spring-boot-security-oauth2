package top.kalpana.springboot.oauth2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CodeCallBackController {
    @GetMapping("/callback/code")
    public String codeCallback(@RequestParam String code, @RequestParam(required = false) String state) {
        log.info("收到回调消息: code = {},state = {}", code, state);
        return "code: " + code + "--state: " + state;
    }
}
