#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.io.Serializable;
import java.util.Date;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class NewPersonRetRs implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Date dateOfBirth;
  
  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPersonRetRs _setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(final String ssn) {
    this.ssn = ssn;
  }
  
  public NewPersonRetRs _setSsn(final String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  public NewPersonRetRs _setFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public NewPersonRetRs _setLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private String gender;
  
  public String getGender() {
    return this.gender;
  }
  
  public void setGender(final String gender) {
    this.gender = gender;
  }
  
  public NewPersonRetRs _setGender(final String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonRetRs [dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRetRs [dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
}
