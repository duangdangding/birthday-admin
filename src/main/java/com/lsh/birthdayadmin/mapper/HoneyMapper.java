package com.lsh.birthdayadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsh.birthdayadmin.entry.Honey;

public interface HoneyMapper extends BaseMapper<Honey> {
    int update(Honey honey);
}
