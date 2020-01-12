package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysUser
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysUser {
    private Long id;
    private String name;
    private String nickName;
    private String avatar;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Byte status;
    private Long deptId;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private Byte delFlag;
}