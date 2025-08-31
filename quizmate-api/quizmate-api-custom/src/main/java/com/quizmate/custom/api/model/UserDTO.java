package com.quizmate.custom.api.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author moru
 * @Description
 * @since 2025/8/29 00:12
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户头像
     */
    private String userAvatar;
    /**
     * 用户简介
     */
    private String userProfile;
    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;
    /**
     * 创建时间
     */
    private Date createTime;
}
