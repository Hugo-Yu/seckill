package com.seckillproject.error;

/**
 * @author hugo Yu
 * @create 2020-07-21
 */
public interface CommonError {
    public int getErrorCode();

    public String getErrtMsg();

    public CommonError setErrMsg(String errMsg);
}
