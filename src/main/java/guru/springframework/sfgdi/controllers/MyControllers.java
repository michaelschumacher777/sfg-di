package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyControllers {
    public String sayHello() {
        System.out.println("Hello World!!");

        return "Hi Folks!";
    }
}
