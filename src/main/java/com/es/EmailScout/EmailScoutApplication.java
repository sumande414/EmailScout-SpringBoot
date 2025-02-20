package com.es.EmailScout;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailScoutApplication {
	static {
    Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
    dotenv.entries().forEach(entry -> {
        // Set System property only if it's not already set (i.e., Railway env should take priority)
        if (System.getenv(entry.getKey()) == null) {
            System.setProperty(entry.getKey(), entry.getValue());
        }
    });
}
	public static void main(String[] args) {
		SpringApplication.run(EmailScoutApplication.class, args);
	}

}
