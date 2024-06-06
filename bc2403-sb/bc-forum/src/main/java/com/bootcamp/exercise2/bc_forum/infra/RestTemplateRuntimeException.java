package com.bootcamp.exercise2.bc_forum.infra;

import org.springframework.web.client.HttpClientErrorException;
import lombok.Getter;

@Getter
public class RestTemplateRuntimeException extends RuntimeException {
 private int code;

 public RestTemplateRuntimeException(SysCode sysCode) {
  super(sysCode.getDesc());
  this.code = sysCode.getCode();
 }

}
