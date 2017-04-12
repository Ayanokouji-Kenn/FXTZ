package cn.thactclub.fxtz.base;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Auther：xzj
 * Date： 2017/4/12.
 */

public class BaseActivity extends Activity {
    protected Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=this;
        init();
    }

    private void init() {
        initView();
        initData();
        initEvent();
    }

    protected  void initView(){
        //固定横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    protected void initData(){}
    protected void initEvent(){}


}
