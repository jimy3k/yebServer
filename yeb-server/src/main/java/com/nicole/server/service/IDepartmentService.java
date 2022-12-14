package com.nicole.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nicole.server.pojo.Department;
import com.nicole.server.pojo.RespBean;

import java.util.List;

/**
 * 服务类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    /**
     * 删除部门
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
