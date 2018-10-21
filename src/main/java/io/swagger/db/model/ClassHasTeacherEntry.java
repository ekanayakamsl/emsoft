package io.swagger.db.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "class_has_teacher", schema = "tution", catalog = "")
public class ClassHasTeacherEntry {
    private Integer id;
    private Integer classClassId;
    private Integer teacherTeacherId;

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
    @Column(name = "TEACHER_TEACHER_ID", nullable = true)
    public Integer getTeacherTeacherId() {
        return teacherTeacherId;
    }

    public void setTeacherTeacherId(Integer teacherTeacherId) {
        this.teacherTeacherId = teacherTeacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassHasTeacherEntry that = (ClassHasTeacherEntry) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(classClassId, that.classClassId) &&
                Objects.equals(teacherTeacherId, that.teacherTeacherId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, classClassId, teacherTeacherId);
    }
}
