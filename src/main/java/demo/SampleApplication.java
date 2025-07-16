package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@RestController
public class SampleApplication {

    private static final Logger logger = LogManager.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@GetMapping("/test")
    public String io() throws InterruptedException {
        logger.info("starting the io() function");
        long sleepDuration = 200L + (long) (500L * Math.random());
        Thread.sleep(sleepDuration);
        logger.info("the io() function completed successfully");
        return "done after " + sleepDuration + "ms";
    }

}
