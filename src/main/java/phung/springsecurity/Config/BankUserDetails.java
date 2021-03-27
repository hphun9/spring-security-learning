package phung.springsecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import phung.springsecurity.Model.Customer;
import phung.springsecurity.Model.SecurityCustomer;
import phung.springsecurity.Repository.CustomerRepository;

import java.util.List;

public class BankUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if(customer.size() == 0) {
            throw new UsernameNotFoundException("User Details not found!" + username);
        }
        return new SecurityCustomer(customer.get(0));
    }
}
