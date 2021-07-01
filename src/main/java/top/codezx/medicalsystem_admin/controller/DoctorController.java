package top.codezx.medicalsystem_admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.codezx.medicalsystem_admin.pojo.Doctor;
import top.codezx.medicalsystem_admin.service.IDoctorService;
import top.codezx.medicalsystem_admin.tool.ResultMap;

import javax.print.Doc;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DoctorController
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/28/2021 4:17 PM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Controller
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    IDoctorService iDoctorService;

    @GetMapping("toDoctorList")
    public String toDoctorList(){
        return "/doctor/doctorList";
    }


    @RequestMapping("queryAllDoctor")
    @ResponseBody
    public Map queryAllDoctor(@RequestParam("page")  Integer page,@RequestParam("limit")Integer limit){
        Map map = iDoctorService.queryAllDoctor((page-1)*limit, limit);
        return map;
    }

//    @DeleteMapping("/remove/{doctorId}")
//    @ResponseBody
//    public Map removeDoctor(@PathVariable Integer doctorId){
//        Map map = iDoctorService.editStateById(doctorId);
//        return map;
//    }

    @PutMapping("/editStateById/{operate}")
    @ResponseBody
    public Map editStateById(@PathVariable("operate") String operate,@RequestBody Doctor doctor){
        Map map = iDoctorService.editStateById(operate,doctor.getDoctorId());
        return map;
    }
    @DeleteMapping("batchRemove/{ids}")
    @ResponseBody
    public Map removeDoctor(@PathVariable String ids){
        Map map = iDoctorService.removeDoctor(ids.split(","));
        return map;
    }

    @RequestMapping("FuzzyQuery")
    @ResponseBody
    public Map FuzzyQuery(@RequestParam("doctorName") String doctorName,@RequestParam("departmentName") String departmentName,@RequestParam("title") String title){
        Map map = iDoctorService.fuzzyQuery(doctorName, departmentName, title);
        return map;
    }

    @RequestMapping("add")
    public String add(){
        return "/doctor/add";
    }
    @PostMapping("/save")
    @ResponseBody
    public Map saveDoctor(@RequestBody Doctor doctor, HttpSession httpSession){
        String departmentId = doctor.getDepartmentId();
        System.out.println(departmentId);
        String  loginUser =(String) httpSession.getAttribute("loginUser");
        Map map = iDoctorService.saveDoctor(doctor, loginUser);
        return map;
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam("doctorId")Integer doctorId,Model model){
        Doctor doctor = iDoctorService.queryDoctorByDcotorId(doctorId);
        model.addAttribute("doctor",doctor);
        return "/doctor/edit";
    }
    @RequestMapping("update")
    @ResponseBody
    public ResultMap update(@RequestBody Doctor doctor){
        ResultMap resultMap = iDoctorService.update(doctor);
        return resultMap;
    }
}
