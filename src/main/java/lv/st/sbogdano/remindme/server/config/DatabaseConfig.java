package lv.st.sbogdano.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("lv.st.sbogdano.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("lv.st.sbogdano.remindme.server.repository")
@PropertySource("classpath:db.properties")
public class DatabaseConfig {

    @Resource
    private Environment env;

}
