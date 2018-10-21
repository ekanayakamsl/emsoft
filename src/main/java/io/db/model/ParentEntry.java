package io.db.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "parent", schema = "tution", catalog = "")
public class ParentEntry {
    private Integer parentId;
    private String name;
    private String telephoneNo;
    private String address;
    private Timestamp lastModifiedTime;

    @Id
    @Column(name = "PARENT_ID", nullable = false)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
    @Column(name = "TELEPHONE_NO", nullable = true, length = 32)
    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
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
        ParentEntry that = (ParentEntry) o;
        return Objects.equals(parentId, that.parentId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(telephoneNo, that.telephoneNo) &&
                Objects.equals(address, that.address) &&
                Objects.equals(lastModifiedTime, that.lastModifiedTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parentId, name, telephoneNo, address, lastModifiedTime);
    }
}
