package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * @version :
 * @ClassName: SysLog
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Data
public class SysLog {
    private Long id;

    private String userName;

    private String operation;

    private String method;

    private String params;

    private Long time;

    private String ip;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;
}
