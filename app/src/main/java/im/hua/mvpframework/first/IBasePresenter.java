package im.hua.mvpframework.first;

/**
 * Created by hua on 2017/7/20.
 */

public interface IBasePresenter<V extends IBaseView> {
    void onAttached(V view);

    void onDetached(V view);

    public V getView();
}
