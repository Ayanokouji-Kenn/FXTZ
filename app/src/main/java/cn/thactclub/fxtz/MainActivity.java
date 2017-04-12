package cn.thactclub.fxtz;

import android.support.constraint.ConstraintLayout;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.thactclub.fxtz.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @BindView(R.id.cl_bg)
    ConstraintLayout mClBg;
    @BindView(R.id.midhill)
    View mMidhill;
    @BindView(R.id.fronthill)
    View mFronthill;

    @Override
    protected void initView() {
        super.initView();
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

}
