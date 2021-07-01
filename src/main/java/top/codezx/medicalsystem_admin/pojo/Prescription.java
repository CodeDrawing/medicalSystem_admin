package top.codezx.medicalsystem_admin.pojo;


public class Prescription {

  private Integer prescriptionId;
  private Integer patientId;
  private java.sql.Timestamp createTime;
  private Integer applyDoctorId;
  private Integer auditDoctorId;
  private Integer auditState;
  private String drugsPrescribed;
  private String doctorAdvice;


  public Integer getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(Integer prescriptionId) {
    this.prescriptionId = prescriptionId;
  }


  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public Integer getApplyDoctorId() {
    return applyDoctorId;
  }

  public void setApplyDoctorId(Integer applyDoctorId) {
    this.applyDoctorId = applyDoctorId;
  }


  public Integer getAuditDoctorId() {
    return auditDoctorId;
  }

  public void setAuditDoctorId(Integer auditDoctorId) {
    this.auditDoctorId = auditDoctorId;
  }


  public Integer getAuditState() {
    return auditState;
  }

  public void setAuditState(Integer auditState) {
    this.auditState = auditState;
  }


  public String getDrugsPrescribed() {
    return drugsPrescribed;
  }

  public void setDrugsPrescribed(String drugsPrescribed) {
    this.drugsPrescribed = drugsPrescribed;
  }


  public String getDoctorAdvice() {
    return doctorAdvice;
  }

  public void setDoctorAdvice(String doctorAdvice) {
    this.doctorAdvice = doctorAdvice;
  }

}
