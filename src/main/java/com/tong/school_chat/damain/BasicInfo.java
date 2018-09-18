package com.tong.school_chat.damain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/14 13:43
 */
@Entity
@Table(name = "basic_info")
@Data
@Builder
public class BasicInfo {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "user_id",length = 20)
    private String userId;
    
    //头像地址
    private String profileUrl;
}
