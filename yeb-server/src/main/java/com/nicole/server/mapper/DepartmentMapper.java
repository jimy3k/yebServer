package com.nicole.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nicole.server.pojo.Department;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @param parentId
     * @return
     */
    List<Department> getAllDepartmentsByParentId(Integer parentId);

    /**
     * 添加部门
     * @param dep
     */
    void addDep(Department dep);

    /**
     * 删除部门
     * @param dep
     */
    void deleteDep(Department dep);

}
