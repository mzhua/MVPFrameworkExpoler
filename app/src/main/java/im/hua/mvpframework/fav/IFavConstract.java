package im.hua.mvpframework.fav;

import im.hua.mvpframework.base.IBasePresenter;
import im.hua.mvpframework.base.IBaseView;

/**
 * Created by minhua.zmh on 2017/7/21.
 *
 * @author minhua.zmh
 * @version 1.0.0
 * @since ${since}
 */

public interface IFavConstract {
    interface IFavPresenter<V extends IBaseView> extends IBasePresenter<V> {
        void fav(long songID);
    }

    interface IFavView extends IBaseView {
        void favSuccess();

        void favFailed(String errorMsg);
    }
}
