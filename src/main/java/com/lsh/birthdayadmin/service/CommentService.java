package com.lsh.birthdayadmin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lsh.birthdayadmin.entry.Comment;

public interface CommentService extends IService<Comment> {

    IPage<Comment> findAll(Integer page, Integer size,String content);
    
    int deleteCommonts(Integer[] ids);
}
