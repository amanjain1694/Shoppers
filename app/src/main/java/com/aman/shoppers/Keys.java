package com.aman.shoppers;

/**
 * Created by Aman Jain on 12/04/2016.
 */
public class Keys {
    private static Keys ourInstance = new Keys();

    public static Keys getInstance() {
        return ourInstance;
    }

    public String USERNAME = "username";
    public String PASSWORD = "password";
    private Keys() {
    }
}