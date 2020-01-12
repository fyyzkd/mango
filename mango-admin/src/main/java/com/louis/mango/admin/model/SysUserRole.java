package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysUserRole
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysUserRole {
    private Long id;
    private Long userId;
    private Long roleId;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
}
