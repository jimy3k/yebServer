package com.nicole.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.server.mapper.MenuRoleMapper;
import com.nicole.server.pojo.MenuRole;
import com.nicole.server.pojo.RespBean;
import com.nicole.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole>
    implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
    menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));
    if (mids == null || mids.length == 0) {
            return RespBean.success("更新成功");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
    if (mids.length == result) {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
