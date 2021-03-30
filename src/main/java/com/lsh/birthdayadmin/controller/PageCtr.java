package com.lsh.birthdayadmin.controller;

import com.lsh.birthdayadmin.entry.Honey;
import com.lsh.birthdayadmin.service.HoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageCtr {
    
    @RequestMapping("/tologin")
    public String toLogin(HttpSession session) {
        return "login";
    }
    @RequestMapping("/{page}")
    public String toPage(@PathVariable("page") String page) {
        if (page.isEmpty()) {
            return "index";
        }
        return page;
    }
    @RequestMapping("/toindex")
    public String toIndex(HttpSession session) {
        return "index";
    }
    @RequestMapping("/tocommonts")
    public String tocommonts() {
        
        return "comments";
    }
    
}
