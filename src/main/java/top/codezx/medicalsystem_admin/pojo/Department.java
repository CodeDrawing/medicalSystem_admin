package top.codezx.medicalsystem_admin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Department {

  private Integer departmentId;
  private String departmentName;
  private Integer parentId;
  private String createUser;
  private java.sql.Timestamp createDate;



}
