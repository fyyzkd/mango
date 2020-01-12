package com.louis.mango.admin.service;

import com.louis.mango.admin.model.SysUser;

import java.util.List;

/**
 * @version :
 * @InterfaceName: SysUserService
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
public interface SysUserService {

    /***
     *
     * 查找所有用户
     * @Return: java.util.List<com.louis.mango.admin.model.SysUser>
     */
    List<SysUser> findAll();
}
