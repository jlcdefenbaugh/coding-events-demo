package org.launchcode.codingevents.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity{

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password); //create hash from given password
    }

    public String getUsername() {
        return username;
    }


    //User objects responsible for determining if given password is a match for the hash stored by the object - use this method
    //note - bcrypt does not allow using .equals to compare hashes
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }



}
