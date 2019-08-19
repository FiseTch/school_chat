package com.tong.school_chat.Controller;

import com.tong.school_chat.Service.UserRepository;
import com.tong.school_chat.SpringContextHolder;
import com.tong.school_chat.domain.MyUser;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/5 16:26
 */

@RequestMapping
@Controller
public class LoginController {
    
   /* @RequestMapping("user_login")
    public ModelAndView userLogin(@RequestParam("user_name")String username, @RequestParam("password")String pwd){
        ModelAndView mv = new ModelAndView();
        MyUser u = MyUser.builder().build();
        u.setUsername(username);
        u.setPassword(pwd);
        u = SpringContextHolder.getBean(UserRepository.class).findOne(Example.of(u));
        if(u != null){
            mv.setViewName("MyPage");
            mv.addObject("user",u);
            return mv;
        }
        return null;
    
    }
*/}
