package top.codezx.medicalsystem_admin.pojo;


import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {

  private Integer doctorId;
  private String skill;
  private String doctorImg;
  private String personalProfile;
  private Date entryData;
  private String departmentId;
  private String departmentName;
  private Integer gender;
  private Date birthday;
  private String title;
  private String doctorName;
  private char state;
  private String username;
  private String phone;
  private String createAdmin;
  private String password;


}
