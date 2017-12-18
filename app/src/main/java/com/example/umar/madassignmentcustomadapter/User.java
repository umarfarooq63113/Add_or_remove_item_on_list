package com.example.umar.madassignmentcustomadapter;

/**
 * Created by umar on 18/12/2017.
 */

public class User {
    private int image;
    private String name;
    private String email;


    public User(int image ,String name, String email) {
        this.image=image;
        this.name = name;
        this.email = email;
    }
    public int getImage()
    {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
