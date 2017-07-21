package im.hua.mvpframework.first;

/**
 * Created by hua on 2017/7/20.
 */

public interface IBasePresenter {
    void onAttached(IBaseView view);

    void onDetached(IBaseView view);
}
