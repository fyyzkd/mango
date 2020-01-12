package com.louis.mango.admin.controller;

import com.louis.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version :
 * @ClassName: SysUserController
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@RestController
//@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }
}
