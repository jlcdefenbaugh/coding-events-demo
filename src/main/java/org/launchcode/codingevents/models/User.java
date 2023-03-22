package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity{

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

//    private static final BCryptPasswordEncoder encoder =

    public User() {}



    //constructor takes parameter named password, uses it to set value of pwHash. Never store passwords - will update line by creating hash from given password to store
    public User(String username, String password) {
        this.username = username;
        this.pwHash = password;
    }




    public String getUsername() {
        return username;
    }
}
