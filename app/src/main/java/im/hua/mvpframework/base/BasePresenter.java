package im.hua.mvpframework.base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import org.reactivestreams.Subscription;

/**
 * Created by hua on 2017/7/20.
 */

public class BasePresenter<V extends IBaseView> implements IBasePresenter<V>{
    private List<Subscription> mSubscriptions = new ArrayList<>();
    private WeakReference<V> mWeakView;

    public void excute(Observable observable, Subscription subscriber, boolean autoDestory) {
        if (autoDestory) {
            mSubscriptions.add(subscriber);
        }
    }

    @Override
    public void onAttached(V view) {
        mWeakView = new WeakReference<>(view);
    }

    @Override
    public void onDetached(V view) {
        for (Subscription subscriber : mSubscriptions) {
            subscriber.cancel();
        }
        mSubscriptions.clear();
        mSubscriptions = null;
        if (mWeakView == null) {
            return;
        }
        mWeakView.clear();
        mWeakView = null;
    }

    @Override
    public V getView() {
        return mWeakView.get();
    }
}
