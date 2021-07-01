package top.codezx.medicalsystem_admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.codezx.medicalsystem_admin.service.IDoctorService;

import java.util.Map;

@SpringBootTest
class MedicalSystemApplicationTests {
    @Autowired
    IDoctorService iDoctorService;

    @Test
    void text01() {
        Map doctors = iDoctorService.fuzzyQuery("", "内科", "");
        System.out.println(doctors);
    }

}
