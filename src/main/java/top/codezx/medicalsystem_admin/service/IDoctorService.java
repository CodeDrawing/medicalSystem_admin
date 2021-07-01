package top.codezx.medicalsystem_admin.service;

import top.codezx.medicalsystem_admin.pojo.Doctor;
import top.codezx.medicalsystem_admin.tool.ResultMap;

import java.util.List;
import java.util.Map;

public interface IDoctorService {
    public Map queryAllDoctor(Integer page, Integer limit);
    public Map editStateById(String operate,Integer doctorId);
    public Map removeDoctor(String[] ids);
    public Map fuzzyQuery(String doctorName,String departmentName,String title);
    public Map saveDoctor(Doctor doctor,String createAdmin);
    public Doctor queryDoctorByDcotorId(Integer doctorId);
    public ResultMap update(Doctor doctor);
}
