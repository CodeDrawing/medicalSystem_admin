package top.codezx.medicalsystem_admin.pojo;


/**
 *
 */
public class Administrator {

  private Integer administratorId;
  private String administratorName;
  private Integer createUserId;
  private String password;
  private Integer available;
  private java.sql.Timestamp createDate;


  public Integer getAdministratorId() {
    return administratorId;
  }

  public void setAdministratorId(Integer administratorId) {
    this.administratorId = administratorId;
  }


  public String getAdministratorName() {
    return administratorName;
  }

  public void setAdministratorName(String administratorName) {
    this.administratorName = administratorName;
  }


  public Integer getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }

}
