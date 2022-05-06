package com.app.authservis.exception;

public class AppUserNotFoundException extends RuntimeException{
    public AppUserNotFoundException(Integer id){
        super ("Could not find user " + id);
    }
}
