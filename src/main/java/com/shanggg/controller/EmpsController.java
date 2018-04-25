package com.shanggg.controller;

import com.shanggg.dao.DepartmentDao;
import com.shanggg.dao.EmployeeDao;
import com.shanggg.entities.Department;
import com.shanggg.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * @Author : yangxudong
 * @Description :
 * @Date : 上午9:34 2018/4/25
 */
@Controller
@RequestMapping
public class EmpsController {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("emps")
    public String empsList(Map<String, Object> map) {
        Collection<Employee> all = employeeDao.getAll();
        map.put("empsList", all);
        return "emps/list";
    }

    @GetMapping("emp")
    public String toEmpAdd(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "/emps/add";
    }

    @PostMapping("emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        //重新跳回到列表首页
        return "redirect:/emps";
    }

    @GetMapping("emp/{id}")
    public String toEmpUpdate(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "/emps/add";
    }

    @PutMapping("emp")
    public String updateEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
