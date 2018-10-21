package io.db.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ScoreEntryPK implements Serializable {
    private Integer studentStudentId;
    private Integer examExamId;

    @Column(name = "STUDENT_STUDENT_ID", nullable = false)
    @Id
    public Integer getStudentStudentId() {
        return studentStudentId;
    }

    public void setStudentStudentId(Integer studentStudentId) {
        this.studentStudentId = studentStudentId;
    }

    @Column(name = "EXAM_EXAM_ID", nullable = false)
    @Id
    public Integer getExamExamId() {
        return examExamId;
    }

    public void setExamExamId(Integer examExamId) {
        this.examExamId = examExamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreEntryPK that = (ScoreEntryPK) o;
        return Objects.equals(studentStudentId, that.studentStudentId) &&
                Objects.equals(examExamId, that.examExamId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentStudentId, examExamId);
    }
}
