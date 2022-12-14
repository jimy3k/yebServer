package com.nicole.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nicole.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper 接口
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

  /**
   * 添加操作员角色
   *
   * @param adminId
   * @param rids
   * @return
   */
  Integer addRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
