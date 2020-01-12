package com.louis.mango.admin.service.impl;

import com.louis.mango.admin.dao.SysUserMapper;
import com.louis.mango.admin.model.SysUser;
import com.louis.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version :
 * @ClassName: SysUserServiceImpl
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
