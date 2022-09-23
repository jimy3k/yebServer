package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.MailLogMapper;
import com.nicole.server.pojo.MailLog;
import com.nicole.server.service.IMailLogService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog>
    implements IMailLogService {}
