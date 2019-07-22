package com.sharding.entity;

import com.sharding.enums.UserSexEnum;
import lombok.Data;

import java.io.Serializable;


@Data
public class UserEntity implements Serializable {

    private Long id;
    private Long order_id;
    private Long user_id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

}
