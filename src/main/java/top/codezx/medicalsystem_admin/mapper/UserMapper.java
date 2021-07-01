package top.codezx.medicalsystem_admin.mapper;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import top.codezx.medicalsystem_admin.pojo.Administrator;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<Administrator> adminLogin(String administratorName,String password);
}
