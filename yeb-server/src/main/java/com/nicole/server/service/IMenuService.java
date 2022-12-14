package com.nicole.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nicole.server.pojo.Menu;

import java.util.List;

/**
 * 服务类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IMenuService extends IService<Menu> {

    //通过用户ID查询菜单列表
    List<Menu> getMenusByAdminId();

    //根据角色查询菜单
    List<Menu> getMenusWithRole();

    //获取所有菜单
    List<Menu> getAllMenus();
}
