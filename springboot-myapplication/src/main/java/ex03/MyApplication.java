package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ex03.component.MyComponent;

@SpringBootConfiguration
@ComponentScan
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
