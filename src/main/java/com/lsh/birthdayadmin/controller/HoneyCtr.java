package com.lsh.birthdayadmin.controller;

import com.lsh.birthdayadmin.entry.ResultDto;
import com.lsh.birthdayadmin.entry.ResultDtoManager;
import com.lsh.birthdayadmin.service.HoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoneyCtr {
    
    @Autowired
    private HoneyService honeyService;
    
    @RequestMapping("/updateHY")
    public ResultDto<String> updateHoney(String hName){
        int i = honeyService.update(hName);
        if (i > 0) {
            return ResultDtoManager.success("设置成功~");
        } else {
            return ResultDtoManager.success("设置失败~");
        }
    }
    
}
