package io.db.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "exam", schema = "tution", catalog = "")
public class ExamEntry {
    private Integer examId;
    private String subject;
    private Integer grade;
    private Integer medium;
    private Timestamp date;
    private String note;
    private Timestamp lastModifiedTime;

    @Id
    @Column(name = "EXAM_ID", nullable = false)
    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    @Basic
    @Column(name = "SUBJECT", nullable = true, length = 15)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
    @Column(name = "DATE", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 45)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_TIME", nullable = true)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamEntry examEntry = (ExamEntry) o;
        return Objects.equals(examId, examEntry.examId) &&
                Objects.equals(subject, examEntry.subject) &&
                Objects.equals(grade, examEntry.grade) &&
                Objects.equals(medium, examEntry.medium) &&
                Objects.equals(date, examEntry.date) &&
                Objects.equals(note, examEntry.note) &&
                Objects.equals(lastModifiedTime, examEntry.lastModifiedTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(examId, subject, grade, medium, date, note, lastModifiedTime);
    }
}
