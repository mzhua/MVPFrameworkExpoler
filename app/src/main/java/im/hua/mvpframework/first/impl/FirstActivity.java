package im.hua.mvpframework.first.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import im.hua.mvpframework.R;
import im.hua.mvpframework.first.BaseActivity;

/**
 * Created by hua on 2017/7/21.
 */

public class FirstActivity extends BaseActivity<IFirstView, IFirstPresenter> implements IFirstView {

    @Override
    public IFirstPresenter createPresenter() {
        return new FirstPresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void fav(View view) {
        getPresenter().fav(1);
    }

    public void expression(View view) {
        getPresenter().postExpression(2);
    }

    @Override
    public void favSuccess() {
        Toast.makeText(this, "favSuccess", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void favFailed(String errorMsg) {
        Toast.makeText(this, "favFailed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void postSuccess() {
        Toast.makeText(this, "postSuccess", Toast.LENGTH_SHORT).show();
    }
}
