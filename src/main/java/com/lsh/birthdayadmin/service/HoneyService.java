package com.lsh.birthdayadmin.service;


import com.lsh.birthdayadmin.entry.Honey;

public interface HoneyService {
    Honey find();
    
    int update(String hName);
}
