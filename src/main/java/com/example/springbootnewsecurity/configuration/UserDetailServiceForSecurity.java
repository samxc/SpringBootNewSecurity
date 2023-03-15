package com.example.springbootnewsecurity.configuration;

import com.example.springbootnewsecurity.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class UserDetailServiceForSecurity implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailServiceForSecurity(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .map(UserDetailsForSecurity::new)
                .orElseThrow(()->new UsernameNotFoundException(" No user was found with " + username));
    }
}
