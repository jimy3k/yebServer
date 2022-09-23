package com.nicole.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nicole.server.pojo.Role;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户ID查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRolesByAdminId(Integer adminId);
}
