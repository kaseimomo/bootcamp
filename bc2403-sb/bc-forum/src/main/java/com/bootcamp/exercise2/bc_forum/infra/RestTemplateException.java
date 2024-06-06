package com.bootcamp.exercise2.bc_forum.infra;

import lombok.Getter;

@Getter
public class RestTemplateException extends Exception {
 private int code;

 public RestTemplateException(SysCode sysCode) {
  super(sysCode.getDesc());
  this.code = sysCode.getCode();
 }

}
