package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext coxt = SpringApplication.run(Application.class, args);
		System.out.println(coxt.getClass().getName());
		int count=coxt.getBeanDefinitionCount();
		System.out.println(count);
	
	}

}
