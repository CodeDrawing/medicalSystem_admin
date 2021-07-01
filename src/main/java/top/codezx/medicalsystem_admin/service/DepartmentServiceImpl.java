package top.codezx.medicalsystem_admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codezx.medicalsystem_admin.mapper.DepartmentMapper;
import top.codezx.medicalsystem_admin.pojo.Department;

import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:2021/6/30 10:22
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Service
public class DepartmentServiceImpl implements IDeparmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> showAllDepartment() {
        List<Department> departments = departmentMapper.showAllDepartment();
        return departments;
    }
}
