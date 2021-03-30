package com.lsh.birthdayadmin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.birthdayadmin.entry.Comment;
import com.lsh.birthdayadmin.mapper.CommentMapper;
import com.lsh.birthdayadmin.service.CommentService;
import com.lsh.birthdayadmin.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper,Comment> implements CommentService {
    
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private RedisUtil redisUtil;
    
    @Override
    public IPage<Comment> findAll(Integer page, Integer size) {
        Page<Comment> pageData = new Page<>(page,size);
//        QueryWrapper<Comment> wrapper = new QueryWrapper<>();
//        wrapper.orderByDesc("createtime");
        IPage<Comment> commentIPage = commentMapper.selectByPage1(pageData);
//        pageData.setRecords(commentMapper.selectPage(pageData, wrapper).getRecords());
        return commentIPage;
    }

    @Override
    public Long addComm(Comment comment) {
        return commentMapper.addComm(comment);
    }

}
