package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.IBasePresenter;
import im.hua.mvpframework.first.IBaseView;

/**
 * Created by hua on 2017/7/21.
 */

public interface IFavPresenter<V extends IBaseView> extends IBasePresenter<V> {
    void fav(long songID);
}
