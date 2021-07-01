package top.codezx.medicalsystem_admin.mapper;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.codezx.medicalsystem_admin.pojo.Doctor;

import java.util.List;

@Mapper
@Repository
public interface DoctorMapper {
    /**
     * 查询所有医生信息，显示医生列表
     * @param page
     * @param limit
     * @return
     */
    public List<Doctor> queryAllDoctor(Integer page, Integer limit);

    /**
     * 删除指定医生信息
     * @param state
     * @return
     */
    public int editStateById(Integer state,Integer doctorId);

    /**
     * 统计医生的总数
     * @return
     */
    public Integer countDoctor();

    /**
     * 删除医生信息，真删除
     * @param doctorId
     * @return int
     */
    public int removeDoctor(String[]  doctorId);

    /**
     * 模糊查询
     * @param doctorName 医生姓名
     * @param departmentName 科室
     * @param title 职称
     * @return
     */

    public List<Doctor> fuzzyQuery(String doctorName,String departmentName,String title);

    public int saveDoctor(Doctor doctor);

    public Doctor queryDoctorByDcotorId(Integer doctorId);

    public int update(Doctor doctor);
}
