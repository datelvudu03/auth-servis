package com.app.authservis.repository;

import com.app.authservis.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser,Integer> {

}
