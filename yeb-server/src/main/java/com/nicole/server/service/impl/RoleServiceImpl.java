package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.RoleMapper;
import com.nicole.server.pojo.Role;
import com.nicole.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {}
