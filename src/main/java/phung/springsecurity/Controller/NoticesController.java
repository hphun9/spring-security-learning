package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @RequestMapping("/notices")
    public String notice() {
        return "/notices";
    }
}
