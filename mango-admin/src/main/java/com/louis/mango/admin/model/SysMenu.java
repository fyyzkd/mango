package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysMenu
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysMenu {
    private Long id;

    private String name;

    private Long parentId;

    private String url;

    private String perms;

    private Integer type;

    private String icon;

    private Integer orderNum;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;
    private Date lastUpdateTime;

    private Byte delFlag;
}
