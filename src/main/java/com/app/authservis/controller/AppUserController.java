package com.app.authservis.controller;

import com.app.authservis.entity.AppUser;
import com.app.authservis.exception.AppUserNotFoundException;
import com.app.authservis.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppUserController {
    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping(path = "/appUsers")
    List<AppUser> all(){
        return appUserRepository.findAll();
    }

    @GetMapping(path = "/appUsers/{id}")
    AppUser oneUser(@PathVariable Integer id){
        return appUserRepository.findById(id).orElseThrow(()->new AppUserNotFoundException(id));
    }
}
