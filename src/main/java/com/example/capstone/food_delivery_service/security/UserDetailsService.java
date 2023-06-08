package com.example.capstone.food_delivery_service.security;

import com.example.capstone.food_delivery_service.entity.AuthGroupEntity;
import com.example.capstone.food_delivery_service.entity.CustomersCredentialsEntity;
import com.example.capstone.food_delivery_service.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private DatabaseService databaseService;


    public UserDetailsService() {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        CustomersCredentialsEntity user = databaseService.findByUsername(username).orElse(null);

        if (user == null) {
            throw new UsernameNotFoundException("cannot find username: " + username);

        }

        List<AuthGroupEntity> authGroups = user.getAuthGroupEntityList();
        return new UserPrincipal(user, authGroups);
    }
}
