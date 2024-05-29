package com.bootcamp.demo.demo_sb_dto.exceptions;

import com.bootcamp.demo.demo_sb_dto.infra.BusinessException;
import com.bootcamp.demo.demo_sb_dto.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_dto.infra.SysCode;

public class UserNotFoundException extends BusinessRuntimeException {
 
 public UserNotFoundException() {
  super(SysCode.USER_ID_NOT_FOUND);
 }
}
