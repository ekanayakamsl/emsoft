package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.db.model.StudentEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Parent;
import io.swagger.model.School;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

public class Student   {
  private static final String SINHALA = "SINHALA";
  @JsonProperty("regid")
  private String regid = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("grade")
  private Integer grade = null;

  public Student() {
  }

  public Student(String regid, String firstName, String lastName, LocalDate dateOfBirth, Integer age, Integer grade, MediumEnum medium, School school, List<Parent> parent) {
    this.regid = regid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.age = age;
    this.grade = grade;
    this.medium = medium;
    this.school = school;
    this.parent = parent;
  }

  public Integer _getMedium() {
    Integer medium = getMedium() != null ? MediumEnum.SINHALA == getMedium() ? 1 : 0 : 0;
    return medium;
  }

    /**
   * Gets or Sets medium
   */
  public enum MediumEnum {
    SINHALA("SINHALA"),
    
    ENGLISH("ENGLISH"),
    
    TAMIL("TAMIL");

    private String value;

    MediumEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediumEnum fromValue(String text) {
      for (MediumEnum b : MediumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("medium")
  private MediumEnum medium = null;

  @JsonProperty("school")
  private School school = null;

  @JsonProperty("parent")
  @Valid
  private List<Parent> parent = null;

  public Student regid(String regid) {
    this.regid = regid;
    return this;
  }

  /**
   * Get regid
   * @return regid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=12,max=12) 
  public String getRegid() {
    return regid;
  }

  public void setRegid(String regid) {
    this.regid = regid;
  }

  public Student firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Student lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Student dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Student age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Student grade(Integer grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")


  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }

  public Student medium(MediumEnum medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
  **/
  @ApiModelProperty(value = "")


  public MediumEnum getMedium() {
    return medium;
  }

  public void setMedium(MediumEnum medium) {
    this.medium = medium;
  }

  public Student school(School school) {
    this.school = school;
    return this;
  }

  /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")

  @Valid

  public School getSchool() {
    return school;
  }

  public void setSchool(School school) {
    this.school = school;
  }

  public Student parent(List<Parent> parent) {
    this.parent = parent;
    return this;
  }

  public Student addParentItem(Parent parentItem) {
    if (this.parent == null) {
      this.parent = new ArrayList<Parent>();
    }
    this.parent.add(parentItem);
    return this;
  }

  /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Parent> getParent() {
    return parent;
  }

  public void setParent(List<Parent> parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.regid, student.regid) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.dateOfBirth, student.dateOfBirth) &&
        Objects.equals(this.age, student.age) &&
        Objects.equals(this.grade, student.grade) &&
        Objects.equals(this.medium, student.medium) &&
        Objects.equals(this.school, student.school) &&
        Objects.equals(this.parent, student.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regid, firstName, lastName, dateOfBirth, age, grade, medium, school, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    regid: ").append(toIndentedString(regid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

