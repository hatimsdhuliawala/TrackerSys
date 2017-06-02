package hatimd.Tracker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Hello.class);
		context.close();
	}
	
}
