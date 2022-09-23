package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.SalaryMapper;
import com.nicole.server.pojo.Salary;
import com.nicole.server.service.ISalaryService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary>
    implements ISalaryService {}
