package com.nicole.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nicole.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface AdminMapper extends BaseMapper<Admin> {

  /**
   * 获取所有操作员
   *
   * @param id
   * @param keywords
   * @return
   */
  List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
