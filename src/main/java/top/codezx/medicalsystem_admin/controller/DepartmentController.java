package top.codezx.medicalsystem_admin.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.codezx.medicalsystem_admin.pojo.Department;
import top.codezx.medicalsystem_admin.service.IDeparmentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DepartmentController
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:2021/6/30 10:18
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    IDeparmentService iDeparmentService;

    @GetMapping("/dept/tree")
    @ResponseBody
    public Object showAllDepartment() {
        HashMap<String, Object> map = new HashMap<>();
        List<Department> departments = iDeparmentService.showAllDepartment();
//        HashMap<String, Object> map1 = new HashMap<>();
//        map1.put("code",0);
//        map1.put("msg","成功");
//        map.put("status",map1);
        map.put("code",200);
        map.put("msg","操作成功");
        Object o = JSONObject.toJSON(departments);
        map.put("data",o);
        Object o1 = JSONObject.toJSON(map);
        return o1;
    }
}
