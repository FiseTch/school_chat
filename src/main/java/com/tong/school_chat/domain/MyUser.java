package com.tong.school_chat.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/14 13:29
 */
@Entity
@Table(name = "sys_user")
@Data
@Builder
public class MyUser {
    
    @Id
    @Column(name = "user_id", length = 20)
    private String userId;//根据系统及相关规则生成
    
    @NotNull
    @Column(unique = true)
    private String username;
    
    @NotNull
    @Column()
    private String password;
    
    @Column(name = "nick_name")
    private String nickName;
    
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_basic_info", referencedColumnName = "user_id", nullable = false)
    private BasicInfo basicInfo;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "read_user_id")
    private Set<Message> messages;
    
}
