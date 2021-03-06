package top.kalpana.springboot.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "top.kalpana.springboot.**.mapper")
public class AsJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsJdbcApplication.class, args);
    }

}
