package io.db.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "class_has_student", schema = "tution", catalog = "")
public class ClassHasStudentEntry {
    private Integer id;
    private Integer classClassId;
    private Integer studentStudentId;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CLASS_CLASS_ID", nullable = true)
    public Integer getClassClassId() {
        return classClassId;
    }

    public void setClassClassId(Integer classClassId) {
        this.classClassId = classClassId;
    }

    @Basic
    @Column(name = "STUDENT_STUDENT_ID", nullable = true)
    public Integer getStudentStudentId() {
        return studentStudentId;
    }

    public void setStudentStudentId(Integer studentStudentId) {
        this.studentStudentId = studentStudentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassHasStudentEntry that = (ClassHasStudentEntry) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(classClassId, that.classClassId) &&
                Objects.equals(studentStudentId, that.studentStudentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, classClassId, studentStudentId);
    }
}
