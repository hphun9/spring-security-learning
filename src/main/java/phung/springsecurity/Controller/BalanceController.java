package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @RequestMapping("myBalance")
    public String myBalance() {
        return "/myBalance";
    }
}

