package com.louis.mango.admin.dao;

import com.louis.mango.admin.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version :
 * @InterfaceName: SysUserMapper
 * @Description: TODO
 * @Auther: fyy
 * @Date: 2020/1/5
 */
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);
    int insert(SysUser record);
    int insertSelective(SysUser record);
    int updateByPrimaryKey(SysUser record);
    int updateByPrimaryKeySelective(SysUser record);
    SysUser selectByPrimaryKey(Long id);
    /***
     *  查找全部
     * @Return: java.util.List<com.louis.mango.admin.model.SysUser>
     */
    List<SysUser> findAll();
}
