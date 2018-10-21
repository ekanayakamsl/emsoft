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
 * Parent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

public class Parent   {
  @JsonProperty("prid")
  private String prid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNo")
  @Valid
  private List<String> phoneNo = null;

  @JsonProperty("address")
  private String address = null;

  public Parent prid(String prid) {
    this.prid = prid;
    return this;
  }

  /**
   * Get prid
   * @return prid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPrid() {
    return prid;
  }

  public void setPrid(String prid) {
    this.prid = prid;
  }

  public Parent name(String name) {
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

  public Parent phoneNo(List<String> phoneNo) {
    this.phoneNo = phoneNo;
    return this;
  }

  public Parent addPhoneNoItem(String phoneNoItem) {
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

  public Parent address(String address) {
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
    Parent parent = (Parent) o;
    return Objects.equals(this.prid, parent.prid) &&
        Objects.equals(this.name, parent.name) &&
        Objects.equals(this.phoneNo, parent.phoneNo) &&
        Objects.equals(this.address, parent.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prid, name, phoneNo, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parent {\n");
    
    sb.append("    prid: ").append(toIndentedString(prid)).append("\n");
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
}

