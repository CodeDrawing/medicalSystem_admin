package top.codezx.medicalsystem_admin.service;

import top.codezx.medicalsystem_admin.pojo.Administrator;
import top.codezx.medicalsystem_admin.pojo.Doctor;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public List<Administrator> adminLogin(String administratorName, String password);

}
