package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @RequestMapping("/myCards")
    public String myCards() {
        return "/myCards";
    }
}
