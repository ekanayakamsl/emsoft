package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * School
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

public class School   {
  @JsonProperty("schid")
  private String schid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNo")
  @Valid
  private List<String> phoneNo = null;

  @JsonProperty("address")
  private String address = null;

  public School schid(String schid) {
    this.schid = schid;
    return this;
  }

    public School(String schid, String name, List<String> phoneNo, String address) {
        this.schid = schid;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    /**
   * Get schid
   * @return schid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSchid() {
    return schid;
  }

  public void setSchid(String schid) {
    this.schid = schid;
  }

  public School name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public School phoneNo(List<String> phoneNo) {
    this.phoneNo = phoneNo;
    return this;
  }

  public School addPhoneNoItem(String phoneNoItem) {
    if (this.phoneNo == null) {
      this.phoneNo = new ArrayList<String>();
    }
    this.phoneNo.add(phoneNoItem);
    return this;
  }

  /**
   * Get phoneNo
   * @return phoneNo
  **/
  @ApiModelProperty(value = "")


  public List<String> getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(List<String> phoneNo) {
    this.phoneNo = phoneNo;
  }

  public School address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.schid, school.schid) &&
        Objects.equals(this.name, school.name) &&
        Objects.equals(this.phoneNo, school.phoneNo) &&
        Objects.equals(this.address, school.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schid, name, phoneNo, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    schid: ").append(toIndentedString(schid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

    public String getPhoneNoString() {
    String phoneNo = "";
    for (String s: this.phoneNo) {
      phoneNo = phoneNo + s + "|";
    }
    return phoneNo;
  }
}

