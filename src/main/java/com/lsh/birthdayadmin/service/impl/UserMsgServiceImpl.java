package com.lsh.birthdayadmin.service.impl;

import com.lsh.birthdayadmin.entry.UserMsg;
import com.lsh.birthdayadmin.mapper.UserMsgMapper;
import com.lsh.birthdayadmin.service.UserMsgService;
import com.lsh.birthdayadmin.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMsgServiceImpl implements UserMsgService {
    
    @Autowired
    private UserMsgMapper userMsgMapper;
    @Autowired
    private RedisUtil redisUtil;
    
    @Override
    public int updateSum(UserMsg userMsg) {
        int i = userMsgMapper.updateSum(userMsg);
        return i;
    }

    @Override
    public Integer addUser(UserMsg userMsg) {
        Integer i = userMsgMapper.addUser(userMsg);
        return i;
    }

    @Override
    public UserMsg findBynameip(UserMsg userMsg) {
        UserMsg msg = userMsgMapper.findBynameip(userMsg);
        return msg;
    }

    @Override
    public int updateBg(UserMsg userMsg) {
        int i = userMsgMapper.updateBg(userMsg);
        return i;
    }

}
