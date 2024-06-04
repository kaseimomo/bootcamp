package com.bootcamp.demo.demo_sb_restful.infra;

public enum ErrorCode {
 NPE(99, "Null Pointer Exception."), //
 NFE(99, "Number Format Exception."), //
 AE(99, "Arithmetic Exception."),;

private int code;
private String desc;

private ErrorCode(int code, String desc) {
 this.code = code;
 this.desc = desc;
}

public int getCode() {
 return this.code;
}

public String getDesc() {
 return this.desc;
}
}
