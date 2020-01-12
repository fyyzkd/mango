package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysRoleDept
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysRoleDept {
    private Long id;

    private Long roleId;

    private Long deptId;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;
}
