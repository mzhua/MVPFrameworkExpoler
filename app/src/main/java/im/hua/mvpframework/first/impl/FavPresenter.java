package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.BasePresenter;

/**
 * Created by hua on 2017/7/21.
 */

public class FavPresenter<V extends IFavView> extends BasePresenter<V> implements IFavPresenter<V> {
    @Override
    public void fav(long songID) {
        getView().favFailed("test");
    }
}
