package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllers {

    private final GreetingService greetingService;

    public MyControllers(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
