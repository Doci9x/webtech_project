package htwberlin.webtech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebtechApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtechApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println();
		};
	}

}
