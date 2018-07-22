package com.springBoot.demo;


import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPassWordEncoder implements PasswordEncoder {

    private final static String SALT="12345";
    @Override
    public String encode(CharSequence rawPassword) {
        Md5PasswordEncoder md5=new Md5PasswordEncoder();
        return md5.encodePassword(rawPassword.toString(),SALT);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        Md5PasswordEncoder md5=new Md5PasswordEncoder();
        return md5.isPasswordValid(encodedPassword,rawPassword.toString(),SALT);
    }
}
