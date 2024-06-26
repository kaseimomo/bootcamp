package com.bootcamp.exercise2.bc_forum.infra;

public enum ErrorCode {
 NPE(99, "Null Pointer Exception."), //
 NFE(2, "Invalid Input."), //
 AE(3, "Arithmetic Exception."), //
 NSH(1, "User not found."), //
 NRF(4, "No Resource Found");

 private int code;
 private String desc;

 private ErrorCode(int code, String desc) {
  this.code = code;
  this.desc = desc;
 }

 public int getCode() {
  return this.code;
 }

 public String getDesc() {
  return this.desc;
 }
}
