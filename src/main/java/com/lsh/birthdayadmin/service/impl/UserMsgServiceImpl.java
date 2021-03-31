package com.lsh.birthdayadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lsh.birthdayadmin.entry.UserMsg;
import com.lsh.birthdayadmin.mapper.UserMsgMapper;
import com.lsh.birthdayadmin.service.UserMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserMsgServiceImpl implements UserMsgService {
    
    @Autowired
    private UserMsgMapper userMsgMapper;
    
    @Override
    public IPage<UserMsg> findAll(Integer page, Integer size,UserMsg userMsg) {
        Page<UserMsg> pageData = new Page<>(page,size);
        QueryWrapper<UserMsg> wrapper = new QueryWrapper<>();
        String name = userMsg.getUserName();
        String xz = userMsg.getUserXz();
        String address = userMsg.getUserAddress();
        if (!name.isEmpty()) {
            wrapper.like("user_name","%" + name + "%");
        }
        if (!address.isEmpty()) {
            wrapper.like("user_address","%" + address + "%");
        }
        if (!xz.isEmpty()) {
            wrapper.eq("user_xz",xz);
        }
        wrapper.orderByDesc("login_time");
        IPage<UserMsg> pages = userMsgMapper.selectPage(pageData,wrapper);
        return pages;
    }

    @Override
    public int deleteUsers(Integer[] ids) {
       /* List<Integer> iids =Arrays.stream(ids)
                .map(s->Integer.parseInt(s.trim()))
                .collect(Collectors.toList());*/
        int i = userMsgMapper.deleteBatchIds(Arrays.asList(ids));
        return i;
    }

}
