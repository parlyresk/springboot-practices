package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Spring Boot Test Integration
 * 
 * MyApplication 파일에 Configuration이 아니라 SpringBootConfiguration 어노테이션이 있어야함
 * 
 * */

@SpringBootTest
public class MyApplicationTest02 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void testMyComponentNouNull() {
		assertNotNull(myComponent);
	}
}
