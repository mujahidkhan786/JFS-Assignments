package coustmer.publisher;

import coustmer.config.MessagingConfig;
import coustmer.model.customer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public String bookOrder(@RequestBody customer customer) {
        customer.setCostumerId("6");
        System.out.println(customer);
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, customer);
        return "Success !!";
    }
    @GetMapping("/get")
    public customer getc(){
        customer c = new customer();
        c.setCostumerId(UUID.randomUUID().toString());
        c.setAge(20);
        c.setName("Mujahid");
        c.setMobile_number("79924");
        return  c ;
    }
}
