package phung.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @RequestMapping("/myLoans")
    public String myLoans() {
        return "/myLoans";
    }
}
