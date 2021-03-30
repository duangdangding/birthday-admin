package com.lsh.birthdayadmin.mapper;


import com.lsh.birthdayadmin.entry.UserMsg;

public interface UserMsgMapper {
    
    int updateSum(UserMsg userMsg);
    
    Integer addUser(UserMsg userMsg);
    
    UserMsg findBynameip(UserMsg userMsg);
    
    int updateBg(UserMsg userMsg);
}
