package com.bootcamp.demo.demo_sb_dto.exceptions;

import com.bootcamp.demo.demo_sb_dto.infra.BusinessException;
import com.bootcamp.demo.demo_sb_dto.infra.BusinessRuntimeException;
import com.bootcamp.demo.demo_sb_dto.infra.SysCode;

public class ListAddExecption extends BusinessRuntimeException{
 
 public ListAddExecption() {
  super(SysCode.LIST_ADD_FAIL);
 }
}
