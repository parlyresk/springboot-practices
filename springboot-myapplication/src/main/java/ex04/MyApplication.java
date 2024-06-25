package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex04.component.MyComponent;

/*
 * @SpringBootApplication 메타 annotation
 * 
 * + @SpringBootConfiguration ex01 ex02
 * + @ComponentScan			  패키지 ex04의 하부 패키지를 스캔한다
 * + @EnableAutoConfiguration
 * 	   1. MVC,Aspect,Security, JPA등을 자동으로 설정
 * 	   2. 발견된 Starter Dependency(Library) 기반으로 설정(관례를 따르를 default 설정)
 * 	   3. application.properties or application.yaml 안의 미세 설정 (필수)
 *     4. Spring Boot의 AutoConfiguration이나 미세 설정 이외의 설정은 Java 설정을 한다
 * 
 * 
 * */
@SpringBootApplication
public class MyApplication {

	
	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args);
					){
			MyComponent myComponent = ac.getBean(MyComponent.class);
			System.out.println(myComponent);
		}
	}
}
