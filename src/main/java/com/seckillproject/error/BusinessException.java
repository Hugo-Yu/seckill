package com.seckillproject.error;

/**
 * @author hugo Yu
 * @create 2020-07-21
 */
//包装器业务异常实现

public class BusinessException  extends Exception implements CommonError{
    private CommonError commonError;

    //构造方法：直接接受EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    //构造方法：接收自定义errMsg的方式构造业务异常
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrtMsg() {
        return this.commonError.getErrtMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
