package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysConfig
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysConfig {
    private Long id;
    private String value;
    private String label;
    private String type;
    private String description;
    private Long sort;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private String remarks;
    private Byte delFlag;
}
