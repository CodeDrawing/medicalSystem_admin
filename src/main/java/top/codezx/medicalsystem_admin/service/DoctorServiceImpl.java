package top.codezx.medicalsystem_admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codezx.medicalsystem_admin.mapper.DoctorMapper;
import top.codezx.medicalsystem_admin.pojo.Doctor;
import top.codezx.medicalsystem_admin.tool.ResultMap;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DoctorServiceImpl
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/28/2021 4:15 PM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Service
public class DoctorServiceImpl implements IDoctorService{

    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public Map queryAllDoctor(Integer page, Integer limit) {
        HashMap<String, Object> map = new HashMap<>();
        Integer integer = doctorMapper.countDoctor();
        List<Doctor> doctors = doctorMapper.queryAllDoctor(page,limit);
        Integer count = doctorMapper.countDoctor();
        map.put("code",0);
        map.put("count",count);
        map.put("msg","...");
        map.put("data",doctors);
        return map;
    }

    @Override
    public Map editStateById(String operate,Integer doctorId) {
        HashMap<String, Object> map = new HashMap<>();
        Integer state=0;
        if("enable".equals(operate)){
            state=1;
        }
        int i = doctorMapper.editStateById(state,doctorId);
        if(i==0){
            map.put("result",2004);
            map.put("msg","操作失败，请重试！");
        }else{
            map.put("result",2003);
            map.put("msg","操作成功！");
        }
        return map;
    }

    @Override
    public Map removeDoctor(String[] ids) {
        HashMap<String, Object> map = new HashMap<>();
        int i = doctorMapper.removeDoctor(ids);
        if(i!=0){
            map.put("result",2007);
            map.put("msg","批量删除成功！");
        }else{
            map.put("result",2008);
            map.put("msg","操作失败，请重试！");
        }
        return map;
    }

    @Override
    public Map fuzzyQuery(String doctorName, String departmentName, String title) {
        HashMap<String, Object> map = new HashMap<>();
        List<Doctor> doctors = doctorMapper.fuzzyQuery(doctorName, departmentName, title);
        map.put("code",0);
        map.put("data",doctors);
        map.put("msg","...");
        map.put("count",doctors.size());
        return map;
    }

    @Override
    public Map saveDoctor(Doctor doctor,String createAdmin) {
        HashMap<String, Object> map = new HashMap<>();
        doctor.setCreateAdmin(createAdmin);
        doctor.setEntryData(new Date());
        int i = doctorMapper.saveDoctor(doctor);
        if(i==1){
            map.put("msg","添加成功！");
            map.put("result",2005);
        }else{
            map.put("msg","添加失败!请重试！");
            map.put("result",2006);
        }
        return map;
    }

    @Override
    public Doctor queryDoctorByDcotorId(Integer doctorId) {
        Doctor doctor = doctorMapper.queryDoctorByDcotorId(doctorId);
        return doctor;
    }

    @Override
    public ResultMap update(Doctor doctor) {
        ResultMap resultMap = new ResultMap();
        int update = doctorMapper.update(doctor);
        if(update!=0){
            resultMap.setCode(2003);
            resultMap.setMsg("修改成功!");
        }else{
            resultMap.setCode(2004);
            resultMap.setMsg("修改失败，请重试！");
        }
        return resultMap;
    }


}
