package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping("/myAccount")
    public String myAccount() {
        return "/myAccount";
    }
}
