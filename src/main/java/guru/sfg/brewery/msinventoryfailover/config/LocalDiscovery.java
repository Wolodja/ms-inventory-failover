package guru.sfg.brewery.msinventoryfailover.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableEurekaClient
@Profile("local-discovery")
@Configuration
public class LocalDiscovery {


}
