package top.kalpana.springboot.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权页获取code：http://localhost:9010/oauth/authorize?client_id=client_id&response_type=code
 * 获取token(post+form):http://client_id:client_secret@localhost:9010/oauth/token
 *  grant_type=authorization_code&code=code
 *  访问资源: 额外加请求头 Authorization = Bearer access_token 或 参数直接拼接 access_token = access_token
 */
@SpringBootApplication
@EnableAuthorizationServer
public class AsInMemoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsInMemoryApplication.class, args);
    }
}
