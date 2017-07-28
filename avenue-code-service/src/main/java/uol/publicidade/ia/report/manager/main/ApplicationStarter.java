package uol.publicidade.ia.report.manager.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@EntityScan({"uol.publicidade.ia.report.manager.entity"})
@ComponentScan({"uol.publicidade.ia.report.manager"})
@EnableJpaRepositories("uol.publicidade.ia.report.manager.repository")
public class ApplicationStarter {

    private Logger LOGGER = LoggerFactory.getLogger(ApplicationStarter.class);

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }

    @EventListener({ContextRefreshedEvent.class})
    private void contextInit() {
        LOGGER.info("Project manager started. Test.");
    }
}