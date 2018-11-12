package com.tong.school_chat.Controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/18 16:43
 */

@Log4j
@RequestMapping
@Controller
public class UserController {
    
    @RequestMapping("upload")
    public void uploadProfile(MultipartFile multipartFile) {
        multipartFile.isEmpty();
    }
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    
    
    @RequestMapping("/login")
    public String login(){
        log.info("进入到login");
        return "login";
    }
}
