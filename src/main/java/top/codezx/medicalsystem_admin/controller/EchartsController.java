package top.codezx.medicalsystem_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName EchartController
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/28/2021 11:44 AM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Controller
@RequestMapping("/echars")
public class EchartsController {
    @RequestMapping("/toEchars")
    public String toEchars(){
        return "/admin/echarts/echarts";
    }
}
