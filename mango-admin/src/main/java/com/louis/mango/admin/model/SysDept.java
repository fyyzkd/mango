package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysDept
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysDept {
    private Long id;
    private String name;
    private Long parentId;
    private Integer orderNum;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private Byte delFlag;
}
