package com.bootcamp.exercise2.bc_forum.infra;

import lombok.Getter;

@Getter
public class RestTemplateRuntimeException extends RuntimeException {
 private int code;

 public RestTemplateRuntimeException(SysCode sysCode) {
  super(sysCode.getDesc());
  this.code = sysCode.getCode();
 }

}
