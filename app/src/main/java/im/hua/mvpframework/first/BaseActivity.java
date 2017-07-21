package im.hua.mvpframework.first;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hua on 2017/7/20.
 */

public abstract class BaseActivity<V extends IBaseView, P extends IBasePresenter> extends AppCompatActivity implements IBaseView{

    private P mPresenter;

    public abstract P createPresenter();

    public P getPresenter() {
        return mPresenter;
    }

    @CallSuper
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mPresenter = securePresenter(createPresenter());
        mPresenter.onAttached((V) this);
    }

    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P presenter = securePresenter(createPresenter());
        presenter.onAttached((V) this);
    }

    @CallSuper
    @Override
    protected void onDestroy() {
        super.onDestroy();
        P presenter = securePresenter(mPresenter);
        presenter.onDetached((V) this);
    }

    private P securePresenter(P presenter) {
        if (presenter == null) {
            throw new NullPointerException("presenter can not be null!");
        }
        return presenter;
    }
}
