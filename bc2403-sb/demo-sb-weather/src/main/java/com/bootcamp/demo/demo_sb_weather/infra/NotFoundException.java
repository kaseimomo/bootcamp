package com.bootcamp.demo.demo_sb_weather.infra;

public class NotFoundException extends BusinessException {
  
 public NotFoundException() {
   super(SysCode.NOT_FOUND);
 }

}
