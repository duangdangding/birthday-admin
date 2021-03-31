package com.lsh.birthdayadmin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.birthdayadmin.entry.Comment;
import com.lsh.birthdayadmin.mapper.CommentMapper;
import com.lsh.birthdayadmin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper,Comment> implements CommentService {
    
    @Autowired
    private CommentMapper commentMapper;
    
    @Override
    public IPage<Comment> findAll(Integer page, Integer size,String content) {
        Page<Comment> pageData = new Page<>(page,size);
//        QueryWrapper<Comment> wrapper = new QueryWrapper<>();
//        wrapper.orderByDesc("createtime");
        IPage<Comment> commentIPage = commentMapper.selectByPage1(pageData,content);
//        pageData.setRecords(commentMapper.selectPage(pageData, wrapper).getRecords());
        return commentIPage;
    }

    @Override
    public int deleteCommonts(Integer[] ids) {
        /*List<Integer> iids =Arrays.stream(ids)
                .map(s->Integer.parseInt(s.trim()))
                .collect(Collectors.toList());*/
        int i = commentMapper.deleteBatchIds(Arrays.asList(ids));
        return i;
    }

}
