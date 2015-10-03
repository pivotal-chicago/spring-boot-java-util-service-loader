package io.pivotal.chicago;

import com.example.spi.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.serviceloader.ServiceListFactoryBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
    }

    @Bean
    public ServiceListFactoryBean dictionaryServiceListFactoryBean() {
        ServiceListFactoryBean serviceListFactoryBean = new ServiceListFactoryBean();
        serviceListFactoryBean.setServiceType(Dictionary.class);
        return serviceListFactoryBean;
    }

    @Autowired
    @Qualifier("dictionaryServiceListFactoryBean")
    Object dictionaries;

    @Override
    @SuppressWarnings("unchecked")
    public void run(String... args) throws Exception {
        ((List<Dictionary>) dictionaries)
                .forEach(dictionary -> {
                    System.out.println("dictionary.getName() = " + dictionary.getName());
                });
    }
}
