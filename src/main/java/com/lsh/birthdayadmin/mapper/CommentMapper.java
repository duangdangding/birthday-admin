package com.lsh.birthdayadmin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsh.birthdayadmin.entry.Comment;

public interface CommentMapper extends BaseMapper<Comment> {
//    public List<Comment> findAll();
    IPage<Comment> selectByPage1(IPage<Comment> iPage);
    
    Long addComm(Comment comment);
}
