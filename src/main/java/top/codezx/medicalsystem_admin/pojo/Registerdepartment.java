package top.codezx.medicalsystem_admin.pojo;



public class Registerdepartment {

  private Integer departmentId;
  private java.sql.Timestamp createTime;
  private Integer createDoctorId;
  private Integer numberLimit;
  private Integer remainingNumber;
  private Integer visitingPhysicianId;
  private Integer roomId;
  private Integer buildingId;
  private Integer floorId;


  public Integer getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public Integer getCreateDoctorId() {
    return createDoctorId;
  }

  public void setCreateDoctorId(Integer createDoctorId) {
    this.createDoctorId = createDoctorId;
  }


  public Integer getNumberLimit() {
    return numberLimit;
  }

  public void setNumberLimit(Integer numberLimit) {
    this.numberLimit = numberLimit;
  }


  public Integer getRemainingNumber() {
    return remainingNumber;
  }

  public void setRemainingNumber(Integer remainingNumber) {
    this.remainingNumber = remainingNumber;
  }


  public Integer getVisitingPhysicianId() {
    return visitingPhysicianId;
  }

  public void setVisitingPhysicianId(Integer visitingPhysicianId) {
    this.visitingPhysicianId = visitingPhysicianId;
  }


  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }


  public Integer getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }


  public Integer getFloorId() {
    return floorId;
  }

  public void setFloorId(Integer floorId) {
    this.floorId = floorId;
  }

}
