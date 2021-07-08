package top.kalpana.springboot.oauth2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import top.kalpana.spring.security.service.impl.CustomerTokenConverter;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author kalpana
 * @since 2021-01-04
 */
@RestController
public class DemoController {

    @GetMapping
    public String index() {
        return "success";
    }

}
