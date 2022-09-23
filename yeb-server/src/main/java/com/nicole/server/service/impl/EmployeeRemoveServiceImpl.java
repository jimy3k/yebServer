package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.EmployeeRemoveMapper;
import com.nicole.server.pojo.EmployeeRemove;
import com.nicole.server.service.IEmployeeRemoveService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class EmployeeRemoveServiceImpl extends ServiceImpl<EmployeeRemoveMapper, EmployeeRemove>
    implements IEmployeeRemoveService {}
