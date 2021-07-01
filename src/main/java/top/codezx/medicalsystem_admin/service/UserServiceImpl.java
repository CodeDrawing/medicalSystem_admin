package top.codezx.medicalsystem_admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.codezx.medicalsystem_admin.mapper.UserMapper;
import top.codezx.medicalsystem_admin.pojo.Administrator;
import top.codezx.medicalsystem_admin.pojo.Doctor;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:6/27/2021 9:32 AM
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<Administrator> adminLogin(String administratorName, String password){
        List<Administrator> result = userMapper.adminLogin(administratorName, password);
        return result;
    }

}
