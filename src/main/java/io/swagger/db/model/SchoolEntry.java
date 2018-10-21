package io.swagger.db.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "school", schema = "tution", catalog = "")
public class SchoolEntry {
    private Integer schoolId;
    private String neme;
    private String address;
    private String telephoneNo;
    private Timestamp lastModifiedTime;

    public SchoolEntry() {
    }

    public SchoolEntry(String neme, String address, String telephoneNo) {
        this.neme = neme;
        this.address = address;
        this.telephoneNo = telephoneNo;
    }

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "SCHOOL_ID", nullable = false)
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "NEME", nullable = false, length = 45)
    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "TELEPHONE_NO", nullable = true, length = 255)
    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
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
        SchoolEntry that = (SchoolEntry) o;
        return Objects.equals(schoolId, that.schoolId) &&
                Objects.equals(neme, that.neme) &&
                Objects.equals(address, that.address) &&
                Objects.equals(telephoneNo, that.telephoneNo) &&
                Objects.equals(lastModifiedTime, that.lastModifiedTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(schoolId, neme, address, telephoneNo, lastModifiedTime);
    }

    public List<String> _getTelephoneNoList() {
        return Arrays.asList(this.telephoneNo.split("|"));
    }
}
