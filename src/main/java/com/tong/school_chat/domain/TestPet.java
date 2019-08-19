package com.tong.school_chat.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author tongch -Administrator
 * @version 1.0
 * @classname TestPet
 * @date 2019/08/19 20:54
 * @description autowired 和resource 的区别
 *  一个根据类型来注入，一个根据属性名来注入。当注入的接口有多个实现时
 *  如果使用autowired 则可以通过qualifier注解来表明多个实现类的区别
 *  也可以通过@Priamry注解来标明接口的主要实现类 -- 默认只能使用一个接口的实现 -不推荐
 *  如果使用Resource注解，则可以通过在后面添加name属性来区分
 **/
@Data
@Component
public class TestPet {
    @Value("1")
    private int id;
    
    @Value("Jack")
    private String name;
    
    
//    @Autowired
//    @Qualifier("dog")
    @Resource(name = "bird")
    private Pet pet;
    
    public void move(){
        pet.move();
    }
    
    
    @Override
    public String toString() {
        return "I'm" + name + " age :" + id;
    }
}
