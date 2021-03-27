package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @RequestMapping("/contact")
    public String contact() {
        return "/contact";
    }
}
