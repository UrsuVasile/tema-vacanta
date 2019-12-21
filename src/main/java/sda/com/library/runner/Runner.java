package sda.com.library.runner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sda.com.library.*")
public class Runner {
    public static void main(String[] args) {
        SpringApplication.run(Runner.class);
    }
}
