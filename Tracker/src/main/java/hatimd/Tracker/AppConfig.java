package hatimd.Tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean
	public Hello getHello(){
		return new Hello();
	}
}
