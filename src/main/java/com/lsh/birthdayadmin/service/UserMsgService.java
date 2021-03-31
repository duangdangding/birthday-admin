package com.lsh.birthdayadmin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.birthdayadmin.entry.UserMsg;

public interface UserMsgService {

    IPage<UserMsg> findAll(Integer page, Integer size,UserMsg userMsg);
    
    int deleteUsers(Integer[] ids);
}
