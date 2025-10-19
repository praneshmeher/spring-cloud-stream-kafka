package spring.cloud.stream.kafka.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

@Configuration
public class SpringCloudFunction {

    @Bean
    public Function<String, String> processOrder() {
        return (order) -> {
            System.out.println(order);
            return "Processed: " + order;
        };
    }

}
