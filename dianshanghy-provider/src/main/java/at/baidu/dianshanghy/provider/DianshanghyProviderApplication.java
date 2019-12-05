package at.baidu.dianshanghy.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("at.baidu.dianshanghy.provider.mapper")
public class DianshanghyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianshanghyProviderApplication.class, args);
    }

}
