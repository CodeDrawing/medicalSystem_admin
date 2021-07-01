package top.codezx.medicalsystem_admin.pojo;



public class Supplier {

  private Integer supplierId;
  private String supplierAdd;
  private Integer contactPhoneNumber;
  private String contactName;
  private java.sql.Timestamp cooperationStartTime;
  private java.sql.Timestamp cooperationEndTime;


  public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }


  public String getSupplierAdd() {
    return supplierAdd;
  }

  public void setSupplierAdd(String supplierAdd) {
    this.supplierAdd = supplierAdd;
  }


  public Integer getContactPhoneNumber() {
    return contactPhoneNumber;
  }

  public void setContactPhoneNumber(Integer contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
  }


  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public java.sql.Timestamp getCooperationStartTime() {
    return cooperationStartTime;
  }

  public void setCooperationStartTime(java.sql.Timestamp cooperationStartTime) {
    this.cooperationStartTime = cooperationStartTime;
  }


  public java.sql.Timestamp getCooperationEndTime() {
    return cooperationEndTime;
  }

  public void setCooperationEndTime(java.sql.Timestamp cooperationEndTime) {
    this.cooperationEndTime = cooperationEndTime;
  }

}
