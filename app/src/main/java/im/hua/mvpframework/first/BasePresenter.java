package im.hua.mvpframework.first;

import org.reactivestreams.Subscription;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by hua on 2017/7/20.
 */

public class BasePresenter<V extends IBaseView> implements IBasePresenter{
    private List<Subscription> mSubscriptions = new ArrayList<>();
    private WeakReference<IBaseView> mWeakView;

    public void excute(Observable observable, Subscription subscriber, boolean autoDestory) {
        if (autoDestory) {
            mSubscriptions.add(subscriber);
        }
    }

    @Override
    public void onAttached(IBaseView view) {
        mWeakView = new WeakReference<>(view);
    }

    @Override
    public void onDetached(IBaseView view) {
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

    public V getView() {
        return (V)mWeakView.get();
    }
}
