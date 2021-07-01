package top.codezx.medicalsystem_admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import top.codezx.medicalsystem_admin.pojo.Department;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    @GetMapping("dept/tree")
    public List<Department> showAllDepartment();

}
