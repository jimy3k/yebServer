package com.nicole.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nicole.server.pojo.Employee;
import com.nicole.server.pojo.RespBean;
import com.nicole.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * 服务类
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IEmployeeService extends IService<Employee> {

  /**
   * 获取所有员工（分页）
   *
   * @param currentPage
   * @param size
   * @param employee
   * @param beginDateScope
   * @return
   */
  RespPageBean getEmployeeByPage(
      Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkId();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean insertEmployee(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

  /**
   * 获取所有员工套账
   *
   * @param currentPage
   * @param size
   * @return
   */
  RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
