package com.bootcamp.demo.demo_sb_weather.infra;

import lombok.Getter;

@Getter
public class BusinessRuntimeException extends RuntimeException {

  private int code;

  public BusinessRuntimeException(SysCode sysCode) {
    super(sysCode.getDesc());
    this.code = sysCode.getCode();
  }

}