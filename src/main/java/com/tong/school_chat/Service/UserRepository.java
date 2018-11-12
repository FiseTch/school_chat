package com.tong.school_chat.Service;

import com.tong.school_chat.domain.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/5 16:29
 */
public interface UserRepository extends JpaRepository<MyUser,String> {

}
