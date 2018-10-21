package io.swagger.db.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "teacher", schema = "tution", catalog = "")
public class TeacherEntry {
    private Integer teacherId;
    private String name;
    private String subjects;
    private String grades;
    private String phoneNo;
    private String address;
    private String qualifications;
    private Date dateOfBirth;
    private Timestamp lastModifiedTime;
    private Integer schoolSchoolId;

    @Id
    @Column(name = "TEACHER_ID", nullable = false)
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SUBJECTS", nullable = true, length = 127)
    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Basic
    @Column(name = "GRADES", nullable = true, length = 45)
    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Basic
    @Column(name = "PHONE_NO", nullable = false, length = 45)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "QUALIFICATIONS", nullable = true, length = 255)
    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
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
    @Column(name = "LAST_MODIFIED_TIME", nullable = true)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "SCHOOL_SCHOOL_ID", nullable = true)
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
        TeacherEntry that = (TeacherEntry) o;
        return Objects.equals(teacherId, that.teacherId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(subjects, that.subjects) &&
                Objects.equals(grades, that.grades) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(address, that.address) &&
                Objects.equals(qualifications, that.qualifications) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(lastModifiedTime, that.lastModifiedTime) &&
                Objects.equals(schoolSchoolId, that.schoolSchoolId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teacherId, name, subjects, grades, phoneNo, address, qualifications, dateOfBirth, lastModifiedTime, schoolSchoolId);
    }
}
