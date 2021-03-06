package com.onepeak.mvpdemo.base.mvp;



import com.onepeak.mvpdemo.base.mvp.Callback.ViewCallBack;


/**
 *
 * Created by OnePeak on 2018/4/19
 *
 */
public abstract class BaseModel {

    protected ViewCallBack mViewCallBack;

    public BaseModel(ViewCallBack modelCallBack) {
        mViewCallBack = modelCallBack;
    }

    public abstract void getData();
}
