package com.tong.school_chat.domain;

import org.springframework.stereotype.Component;

/**
 * @author tongch -Administrator
 * @version 1.0
 * @classname Dog
 * @date 2019/08/19 20:51
 * @description
 **/
@Component
public class Dog implements Pet {
    @Override
    public void move() {
        System.out.println("Running");
    }
}
