package top.codezx.medicalsystem_admin.pojo;



public class Case {

  private Integer caseId;
  private java.sql.Timestamp createDate;
  private Integer createDoctorId;
  private String inspectionResults;
  private String inspectionImg;
  private Integer firstDoctorId;
  private String diagnosisResults;
  private Integer patientId;
  private Integer prescriptionId;


  public Integer getCaseId() {
    return caseId;
  }

  public void setCaseId(Integer caseId) {
    this.caseId = caseId;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public Integer getCreateDoctorId() {
    return createDoctorId;
  }

  public void setCreateDoctorId(Integer createDoctorId) {
    this.createDoctorId = createDoctorId;
  }


  public String getInspectionResults() {
    return inspectionResults;
  }

  public void setInspectionResults(String inspectionResults) {
    this.inspectionResults = inspectionResults;
  }


  public String getInspectionImg() {
    return inspectionImg;
  }

  public void setInspectionImg(String inspectionImg) {
    this.inspectionImg = inspectionImg;
  }


  public Integer getFirstDoctorId() {
    return firstDoctorId;
  }

  public void setFirstDoctorId(Integer firstDoctorId) {
    this.firstDoctorId = firstDoctorId;
  }


  public String getDiagnosisResults() {
    return diagnosisResults;
  }

  public void setDiagnosisResults(String diagnosisResults) {
    this.diagnosisResults = diagnosisResults;
  }


  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }


  public Integer getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(Integer prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

}
