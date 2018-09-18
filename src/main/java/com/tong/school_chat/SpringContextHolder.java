package com.tong.school_chat;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/18 16:06
 */

@Configuration
public class SpringContextHolder implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext = null;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    public static <T> T getBean(Class<T> T) {
        return applicationContext.getBean(T);
    }
}
