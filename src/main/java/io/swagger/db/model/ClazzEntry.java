package io.swagger.db.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "class", schema = "tution", catalog = "")
public class ClazzEntry {
    private Integer classId;
    private Integer grade;
    private Integer medium;
    private Time time;
    private Date startedDate;
    private String note;

    @Id
    @Column(name = "CLASS_ID", nullable = false)
    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "GRADE", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "MEDIUM", nullable = true)
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    @Basic
    @Column(name = "TIME", nullable = true)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Basic
    @Column(name = "STARTED_DATE", nullable = true)
    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntry that = (ClazzEntry) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(medium, that.medium) &&
                Objects.equals(time, that.time) &&
                Objects.equals(startedDate, that.startedDate) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classId, grade, medium, time, startedDate, note);
    }
}
