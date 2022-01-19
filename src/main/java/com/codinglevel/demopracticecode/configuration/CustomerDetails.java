package com.codinglevel.demopracticecode.configuration;

import java.util.List;

import com.codinglevel.demopracticecode.entites.Customer;
import com.codinglevel.demopracticecode.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetails implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       List<Customer> customers = adminRepository.findByEmail(username);
       if(customers.size() == 0) {
           throw new BadCredentialsException("User not Found");
       }
        return new ApplicationSecurity(customers.get(0));
    }
    
}
