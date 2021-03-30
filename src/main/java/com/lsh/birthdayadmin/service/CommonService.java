package com.lsh.birthdayadmin.service;

import com.lsh.birthdayadmin.entry.Common;

public interface CommonService {

    int updateById(Common common);

    int updateByKey(Common common);
    
    Common getByEnabled(Common common);
}
