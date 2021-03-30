package com.lsh.birthdayadmin.service;

import com.lsh.birthdayadmin.entry.UserMsg;

public interface UserMsgService {

    int updateSum(UserMsg userMsg);

    Integer addUser(UserMsg userMsg);

    UserMsg findBynameip(UserMsg userMsg);

    int updateBg(UserMsg userMsg);
    
}
