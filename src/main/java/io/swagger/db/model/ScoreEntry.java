package io.swagger.db.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "score", schema = "tution", catalog = "")
@IdClass(ScoreEntryPK.class)
public class ScoreEntry {
    private Integer studentStudentId;
    private Integer examExamId;
    private Double score;
    private String note;
    private byte[] participate;

    @Id
    @Column(name = "STUDENT_STUDENT_ID", nullable = false)
    public Integer getStudentStudentId() {
        return studentStudentId;
    }

    public void setStudentStudentId(Integer studentStudentId) {
        this.studentStudentId = studentStudentId;
    }

    @Id
    @Column(name = "EXAM_EXAM_ID", nullable = false)
    public Integer getExamExamId() {
        return examExamId;
    }

    public void setExamExamId(Integer examExamId) {
        this.examExamId = examExamId;
    }

    @Basic
    @Column(name = "SCORE", nullable = true, precision = 0)
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 127)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "PARTICIPATE", nullable = true)
    public byte[] getParticipate() {
        return participate;
    }

    public void setParticipate(byte[] participate) {
        this.participate = participate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreEntry that = (ScoreEntry) o;
        return Objects.equals(studentStudentId, that.studentStudentId) &&
                Objects.equals(examExamId, that.examExamId) &&
                Objects.equals(score, that.score) &&
                Objects.equals(note, that.note) &&
                Arrays.equals(participate, that.participate);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(studentStudentId, examExamId, score, note);
        result = 31 * result + Arrays.hashCode(participate);
        return result;
    }
}
