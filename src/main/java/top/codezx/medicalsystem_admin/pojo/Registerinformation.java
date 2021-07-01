package top.codezx.medicalsystem_admin.pojo;



public class Registerinformation {

  private Integer patientId;
  private Integer registerId;
  private Integer departmentId;
  private Integer isOrNotPay;
  private java.sql.Timestamp makeATime;
  private String selfAccusationOfIllness;
  private java.sql.Timestamp commitDate;


  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }


  public Integer getRegisterId() {
    return registerId;
  }

  public void setRegisterId(Integer registerId) {
    this.registerId = registerId;
  }


  public Integer getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
  }


  public Integer getIsOrNotPay() {
    return isOrNotPay;
  }

  public void setIsOrNotPay(Integer isOrNotPay) {
    this.isOrNotPay = isOrNotPay;
  }


  public java.sql.Timestamp getMakeATime() {
    return makeATime;
  }

  public void setMakeATime(java.sql.Timestamp makeATime) {
    this.makeATime = makeATime;
  }


  public String getSelfAccusationOfIllness() {
    return selfAccusationOfIllness;
  }

  public void setSelfAccusationOfIllness(String selfAccusationOfIllness) {
    this.selfAccusationOfIllness = selfAccusationOfIllness;
  }


  public java.sql.Timestamp getCommitDate() {
    return commitDate;
  }

  public void setCommitDate(java.sql.Timestamp commitDate) {
    this.commitDate = commitDate;
  }

}
