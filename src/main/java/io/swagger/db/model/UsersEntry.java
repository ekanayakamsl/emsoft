package io.swagger.db.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "tution", catalog = "")
public class UsersEntry {
    private Integer id;
    private String name;
    private Integer salary;
    private String teamName;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "salary", nullable = true)
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "team_name", nullable = true, length = 255)
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntry that = (UsersEntry) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, salary, teamName);
    }
}
