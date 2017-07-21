package im.hua.mvpframework.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;
import im.hua.mvpframework.R;
import im.hua.mvpframework.base.BaseActivity;
import im.hua.mvpframework.expression.ExpressionPresenter;
import im.hua.mvpframework.fav.FavPresenter;
import im.hua.mvpframework.first.IFirstConstract.IFirstPresenter;
import im.hua.mvpframework.first.IFirstConstract.IFirstView;

/**
 * Created by hua on 2017/7/21.
 */

public class FirstActivity extends BaseActivity<IFirstView, IFirstPresenter> implements IFirstView {


    @Override
    public IFirstPresenter createPresenter() {
        return new FirstPresenter(new ExpressionPresenter(), new FavPresenter());
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
