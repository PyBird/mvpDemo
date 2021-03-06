package com.onepeak.mvpdemo;

import android.os.Bundle;

import com.onepeak.mvpdemo.base.mvp.BasePresenter;
import com.onepeak.mvpdemo.base.mvp.Callback.ViewCallBack;

/**
 * Created by OnePeak on 2018/4/19
 */

public class MainPresenter extends BasePresenter{

    public MainPresenter(ViewCallBack viewCallBack) {
        super(viewCallBack);
    }


    protected void onTvClick(){
        if(null == mBaseModel){
            mBaseModel = new MainModel(mViewCallBack);
        }

        mBaseModel.getData();
    }

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
    }

    @Override
    protected void onBackPressed(){
        super.onBackPressed();
    }
}
