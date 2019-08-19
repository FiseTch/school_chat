package com.tong.school_chat.domain;

import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Component;

/**
 * @author tongch -Administrator
 * @version 1.0
 * @classname Bird
 * @date 2019/08/19 20:52
 * @description
 **/
@Component
public class Bird implements Pet{
    
    @Override
    public void move() {
        System.out.println("Flying");
    }
}
