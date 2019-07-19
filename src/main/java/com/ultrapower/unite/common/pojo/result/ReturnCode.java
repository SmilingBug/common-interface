package com.ultrapower.unite.common.pojo.result;

public enum ReturnCode {

    SUCCESS("0000","操作成功"),
    CHECKFAILURE("0001","数据校验异常"),
    DEALORDERFAILURE("0002", "工单处理异常"),
    SENDDATA("0003","工单回调处理异常");

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
