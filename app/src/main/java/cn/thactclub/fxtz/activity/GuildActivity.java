package cn.thactclub.fxtz.activity;

import android.content.Intent;

import java.util.concurrent.TimeUnit;

import cn.thactclub.fxtz.MainActivity;
import cn.thactclub.fxtz.R;
import cn.thactclub.fxtz.base.BaseActivity;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * Auther：xzj
 * Date： 2017/4/12.
 */

public class GuildActivity extends BaseActivity {
    @Override
    protected void initView() {
        super.initView();
        setContentView(R.layout.activity_guild);
        Observable.timer(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        startActivity(new Intent(mContext, MainActivity.class));
                    }
                });
    }
}
