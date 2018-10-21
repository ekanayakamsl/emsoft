package io.db.model;

import io.swagger.model.Student;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "tution", catalog = "")
public class StudentEntry {
    private Integer studentId;
    private String regId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Integer age;
    private Integer grade;
    private Integer medium;
    private Timestamp lastModifiedTime;
    private Integer schoolSchoolId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID", nullable = false)
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "REG_ID", nullable = false, length = 12)
    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, length = 32)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 32)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH", nullable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "AGE", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "GRADE", nullable = false)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "MEDIUM", nullable = false)
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_TIME", nullable = true)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "SCHOOL_SCHOOL_ID", nullable = false)
    public Integer getSchoolSchoolId() {
        return schoolSchoolId;
    }

    public void setSchoolSchoolId(Integer schoolSchoolId) {
        this.schoolSchoolId = schoolSchoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntry that = (StudentEntry) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(regId, that.regId) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(age, that.age) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(medium, that.medium) &&
                Objects.equals(lastModifiedTime, that.lastModifiedTime) &&
                Objects.equals(schoolSchoolId, that.schoolSchoolId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, regId, firstName, lastName, dateOfBirth, age, grade, medium, lastModifiedTime, schoolSchoolId);
    }

    public Student.MediumEnum _getMedium() {
        if (getMedium() == 1) {
            return Student.MediumEnum.SINHALA;
        } else if (getMedium() == 2) {
            return Student.MediumEnum.ENGLISH;
        } else {
            return Student.MediumEnum.TAMIL;
        }
    }

}
