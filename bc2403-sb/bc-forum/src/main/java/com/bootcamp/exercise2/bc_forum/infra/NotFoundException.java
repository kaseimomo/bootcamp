package com.bootcamp.exercise2.bc_forum.infra;

public class NotFoundException extends BusinessRuntimeException {
  
 public NotFoundException() {
   super(SysCode.NOT_FOUND);
 }

}
