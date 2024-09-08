package com.ssc.taa.webservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * room details
 */


//@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RoomDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("roomGuid")
  private String roomGuid;

  @JsonProperty("roomNumber")
  private Integer roomNumber;

  @JsonProperty("roomType")
  private String roomType;

  public RoomDetails roomGuid(String roomGuid) {
    this.roomGuid = roomGuid;
    return this;
  }

  /**
   * Unique room guid
   * @return roomGuid
  */
  
  public String getRoomGuid() {
    return roomGuid;
  }

  public void setRoomGuid(String roomGuid) {
    this.roomGuid = roomGuid;
  }

  public RoomDetails roomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
    return this;
  }

  /**
   * Unique room number
   * @return roomNumber
  */
  
  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public RoomDetails roomType(String roomType) {
    this.roomType = roomType;
    return this;
  }

  /**
   * type of room
   * @return roomType
  */
  
  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomDetails roomDetails = (RoomDetails) o;
    return Objects.equals(this.roomGuid, roomDetails.roomGuid) &&
        Objects.equals(this.roomNumber, roomDetails.roomNumber) &&
        Objects.equals(this.roomType, roomDetails.roomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomGuid, roomNumber, roomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDetails {\n");
    sb.append("    roomGuid: ").append(toIndentedString(roomGuid)).append("\n");
    sb.append("    roomNumber: ").append(toIndentedString(roomNumber)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

