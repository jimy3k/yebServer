package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.EmployeeTrainMapper;
import com.nicole.server.pojo.EmployeeTrain;
import com.nicole.server.service.IEmployeeTrainService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class EmployeeTrainServiceImpl extends ServiceImpl<EmployeeTrainMapper, EmployeeTrain>
    implements IEmployeeTrainService {}
