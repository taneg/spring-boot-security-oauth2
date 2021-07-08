package top.kalpana.springboot.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AsJwtAesApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsJwtAesApplication.class, args);
    }
}
