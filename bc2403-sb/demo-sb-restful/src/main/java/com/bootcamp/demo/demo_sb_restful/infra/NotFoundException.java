package com.bootcamp.demo.demo_sb_restful.infra;

public class NotFoundException extends BusinessRuntimeException {
  
 public NotFoundException() {
   super(SysCode.NOT_FOUND);
 }

}
