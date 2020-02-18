package top.kxyu.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//核心配置
//Mapper扫描
//事务注解
@SpringBootApplication
//@MapperScan("top.kxyu.springbootdemo.mapper")
@EnableTransactionManagement
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
