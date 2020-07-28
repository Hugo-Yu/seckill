package com.seckillproject.error;

/**
 * @author hugo Yu
 * @create 2020-07-21
 */
public interface CommonError {
    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
