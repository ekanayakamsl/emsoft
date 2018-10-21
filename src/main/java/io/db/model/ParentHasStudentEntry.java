package io.db.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "parent_has_student", schema = "tution", catalog = "")
public class ParentHasStudentEntry {
    private Integer id;
    private Integer parentParentId;
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
    @Column(name = "PARENT_PARENT_ID", nullable = true)
    public Integer getParentParentId() {
        return parentParentId;
    }

    public void setParentParentId(Integer parentParentId) {
        this.parentParentId = parentParentId;
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
        ParentHasStudentEntry that = (ParentHasStudentEntry) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(parentParentId, that.parentParentId) &&
                Objects.equals(studentStudentId, that.studentStudentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, parentParentId, studentStudentId);
    }
}
