package com.lsh.birthdayadmin.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.lsh.birthdayadmin.entry.ResultDto;
import com.lsh.birthdayadmin.entry.ResultDtoManager;
import com.lsh.birthdayadmin.entry.UserMsg;
import com.lsh.birthdayadmin.service.UserMsgService;
import com.lsh.birthdayadmin.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginCtr {

    private static final Logger logger = LoggerFactory.getLogger(LoginCtr.class);
    
    @Autowired
    private RedisUtil redisUtil;
    
    @Autowired
    private UserMsgService userMsgService;
    
    /**
     * 页面有规律的获取数据 into_num,peo_num,send_zfnum
     * @return
     */
    @RequestMapping("/interval/num")
    public Map<String,Object> getOtherNum() {
        Map<String,Object> numMap = new HashMap<>();
        Integer into_num = (Integer) redisUtil.get("into_num");
        if (ObjectUtil.hasNull(into_num)) {
            into_num = 0;
        }
        numMap.put("into_num",into_num.longValue());
        Integer peo_num = (Integer)redisUtil.get("peo_num");
        if (ObjectUtil.hasNull(peo_num)) {
            peo_num = 0;
        }
        numMap.put("peo_num",peo_num.longValue());
        Integer send_zfnum = (Integer) redisUtil.get("send_zfnum");
        if (ObjectUtil.hasNull(send_zfnum)) {
            send_zfnum = 0;
        }
        numMap.put("send_zfnum",send_zfnum.longValue());
        return numMap;
    }
    
    @RequestMapping("/changBg")
    public ResultDto<Object> changeBg(UserMsg userMsg,HttpSession session) {
        int i = userMsgService.updateBg(userMsg);
//        UserMsg user = (UserMsg) session.getAttribute("user");
//        UserMsg userMsg = userMsgService.findBynameip(user);
        session.setAttribute("user",userMsg);
        return ResultDtoManager.success(i);
    }
}
