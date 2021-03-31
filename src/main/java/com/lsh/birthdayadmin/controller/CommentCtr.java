package com.lsh.birthdayadmin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.birthdayadmin.entry.BootStrapResult;
import com.lsh.birthdayadmin.entry.Comment;
import com.lsh.birthdayadmin.entry.ResultDto;
import com.lsh.birthdayadmin.entry.ResultDtoManager;
import com.lsh.birthdayadmin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CommentCtr {
    
    @Autowired
    private CommentService commentService;
    
    @RequestMapping("/commAll")
    public BootStrapResult<Comment> getAll(Integer pageNumber, Integer pageSize,String content, HttpServletRequest request) {
        IPage<Comment> all = commentService.findAll(pageNumber, pageSize,content);
        return new BootStrapResult<Comment>(all.getRecords(),all.getTotal());
    }
    
    @RequestMapping("/delCommonts")
    public ResultDto<String> deleteCommonts(Integer[] ids) {
        int i = commentService.deleteCommonts(ids);
        String res = "";
        if (i > 0) {
            res = "删除成功，数量：" + i;
        } else {
            res = "删除失败！";
        }
        return ResultDtoManager.success(res);
    }

}
