package com.bootcamp.exercise2.bc_forum.infra;

import lombok.Getter;

@Getter
public enum SysCode {
 OK(0, "success."), //
 NOT_FOUND(1, "not found."), //
 USER_ID_NOT_FOUND(2, "User id not found."), //
 RestTemplate_ERROR(3, "RestTemplate ERROR - JsonPlacerHolder"), //
 LIST_ADD_FAIL(4, "List Add Fail."), //
 ;

 private int code;
 private String desc;

 private SysCode(int code, String desc) {
  this.code = code;
  this.desc = desc;
 }
}
