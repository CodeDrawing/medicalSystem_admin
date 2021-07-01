package top.codezx.medicalsystem_admin.pojo;



public class Patient {

  private Integer patientId;
  private String patientName;
  private Integer emergencyContact;
  private String familyAddress;
  private String password;
  private Integer phoneNumber;
  private java.sql.Timestamp registerData;
  private Integer patientGender;
  private java.sql.Timestamp patientBirthday;
  private String patientImg;


  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }


  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }


  public Integer getEmergencyContact() {
    return emergencyContact;
  }

  public void setEmergencyContact(Integer emergencyContact) {
    this.emergencyContact = emergencyContact;
  }


  public String getFamilyAddress() {
    return familyAddress;
  }

  public void setFamilyAddress(String familyAddress) {
    this.familyAddress = familyAddress;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public Integer getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public java.sql.Timestamp getRegisterData() {
    return registerData;
  }

  public void setRegisterData(java.sql.Timestamp registerData) {
    this.registerData = registerData;
  }


  public Integer getPatientGender() {
    return patientGender;
  }

  public void setPatientGender(Integer patientGender) {
    this.patientGender = patientGender;
  }


  public java.sql.Timestamp getPatientBirthday() {
    return patientBirthday;
  }

  public void setPatientBirthday(java.sql.Timestamp patientBirthday) {
    this.patientBirthday = patientBirthday;
  }


  public String getPatientImg() {
    return patientImg;
  }

  public void setPatientImg(String patientImg) {
    this.patientImg = patientImg;
  }

}
