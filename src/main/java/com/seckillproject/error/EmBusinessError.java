package com.seckillproject.error;

/**
 * @author hugo Yu
 * @create 2020-07-21
 */
public enum  EmBusinessError implements CommonError {
    //通用错误类型100001
    PARAMETER_VALIDATION_ERROR(100001, "参数不合法"),
    UNKNOWN_ERROR(100002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "手机号或密码不正确"),







            ;
    
    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrtMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
