package com.lsh.birthdayadmin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsh.birthdayadmin.entry.Common;

public interface CommonMapper extends BaseMapper<Common> {
    int updateById(Common common);
    
    int updateByKey(Common common);

    Common getByEnabled(Common common);
}
