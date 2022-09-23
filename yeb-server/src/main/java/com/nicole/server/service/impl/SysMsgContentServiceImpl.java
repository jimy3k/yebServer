package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.SysMsgContentMapper;
import com.nicole.server.pojo.SysMsgContent;
import com.nicole.server.service.ISysMsgContentService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class SysMsgContentServiceImpl extends ServiceImpl<SysMsgContentMapper, SysMsgContent>
    implements ISysMsgContentService {}
