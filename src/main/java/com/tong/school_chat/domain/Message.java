package com.tong.school_chat.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/14 14:37
 */
@Entity
@Table(name = "message")
@Data
@Builder
public class Message {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name = "write_user_id",length = 20)
    private String writeUserId;
    
    @NotNull
    @Column(name = "read_user_id",length = 20)
    private String readUserId;
    
    @Column(name = "write_time")
    private Date writeTime;
    
    private String description;
    
    private int praise;//点赞数
    
}
