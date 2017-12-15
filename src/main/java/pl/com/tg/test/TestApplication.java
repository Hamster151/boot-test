package pl.com.tg.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import pl.com.tg.test.service.IUserService;

@SpringBootApplication(scanBasePackages = "pl.com.tg.test")
public class TestApplication {

    public static void main(String[] args) {
		// Test original comment commit for branch
        SpringApplication.run(TestApplication.class, args);
    }

//    @Component
//    private class RunAtStartup implements CommandLineRunner {
//        @Autowired
//        private IUserService userService;
//
//        @Override
//        public void run(String... args) throws Exception {
//            System.out.println(userService.testParam());
//        }
//    }
}
