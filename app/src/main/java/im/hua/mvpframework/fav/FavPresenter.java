package im.hua.mvpframework.fav;

import im.hua.mvpframework.base.BasePresenter;
import im.hua.mvpframework.fav.IFavConstract.IFavPresenter;
import im.hua.mvpframework.fav.IFavConstract.IFavView;

/**
 * Created by hua on 2017/7/21.
 */

public class FavPresenter<V extends IFavView> extends BasePresenter<V> implements IFavPresenter<V> {
    @Override
    public void fav(long songID) {
        getView().favFailed("test");
    }
}
