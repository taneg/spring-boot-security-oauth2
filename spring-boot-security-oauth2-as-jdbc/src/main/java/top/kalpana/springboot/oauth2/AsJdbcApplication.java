package top.kalpana.springboot.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * /oauth/authorize?client_id=client_id&response_type=code&redirect_uri=https://www.baidu.com&state=xzy
 * redirect_uri:回传code的地址，必须与客户端注册的一致（可选，默认和注册一致）
 * state: 回传code时，会原值传回来，用于校验请求是否合法(可选)
 * http://client_id:mysecret@localhost:9010/oauth/token
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "top.kalpana.springboot.**.mapper")
public class AsJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsJdbcApplication.class, args);
    }

}
