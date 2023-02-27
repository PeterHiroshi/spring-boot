package smoketest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 第一个spring-boot源码构建启动类
 *
 * @author mahao
 * @since 2023-02-27
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello spring-boot");
	}
}
