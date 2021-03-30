package com.lsh.birthdayadmin.service.impl;

import com.lsh.birthdayadmin.entry.Honey;
import com.lsh.birthdayadmin.mapper.HoneyMapper;
import com.lsh.birthdayadmin.service.HoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoneyServiceImpl implements HoneyService {

    @Autowired
    private HoneyMapper honeyMapper;
    
    @Override
    public Honey find() {
        return honeyMapper.selectOne(null);
    }

    @Override
    public int update(String hName) {
        Honey honey = new Honey(1,hName);
        return honeyMapper.update(honey);
    }
}
