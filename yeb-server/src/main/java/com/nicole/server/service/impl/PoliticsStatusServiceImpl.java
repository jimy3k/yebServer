package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.PoliticsStatusMapper;
import com.nicole.server.pojo.PoliticsStatus;
import com.nicole.server.service.IPoliticsStatusService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus>
    implements IPoliticsStatusService {}
