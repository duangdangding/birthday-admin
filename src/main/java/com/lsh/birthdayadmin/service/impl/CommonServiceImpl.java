package com.lsh.birthdayadmin.service.impl;

import com.lsh.birthdayadmin.entry.Common;
import com.lsh.birthdayadmin.mapper.CommonMapper;
import com.lsh.birthdayadmin.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    
    @Autowired
    private CommonMapper commonMapper;
    
    @Override
    public int updateById(Common common) {
        int i = commonMapper.updateById(common);
        return i;
    }

    @Override
    public int updateByKey(Common common) {
        int i = commonMapper.updateByKey(common);
        return i;
    }

    @Override
    public Common getByEnabled(Common common) {
        Common byEnabled = commonMapper.getByEnabled(common);
        return byEnabled;
    }
}
