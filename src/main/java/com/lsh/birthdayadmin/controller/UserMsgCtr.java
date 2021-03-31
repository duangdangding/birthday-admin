package com.lsh.birthdayadmin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.birthdayadmin.entry.*;
import com.lsh.birthdayadmin.service.UserMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserMsgCtr {
    
    @Autowired
    private UserMsgService userMsgService;

    @RequestMapping("/usersList")
    public BootStrapResult<UserMsg> getAll(Integer pageNumber, Integer pageSize,UserMsg userMsg, HttpServletRequest request) {
        IPage<UserMsg> all = userMsgService.findAll(pageNumber, pageSize,userMsg);
        return new BootStrapResult<UserMsg>(all.getRecords(),all.getTotal());
    }

    @RequestMapping("/delUsers")
    public ResultDto<String> deleteCommonts(Integer[] ids) {
        int i = userMsgService.deleteUsers(ids);
        String res = "";
        if (i > 0) {
            res = "删除成功，数量：" + i;
        } else {
            res = "删除失败！";
        }
        return ResultDtoManager.success(res);
    }
}
