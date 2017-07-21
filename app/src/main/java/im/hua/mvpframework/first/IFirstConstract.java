package im.hua.mvpframework.first;

import im.hua.mvpframework.expression.IExpressionConstract.IExpressionPresenter;
import im.hua.mvpframework.expression.IExpressionConstract.IExpressionView;
import im.hua.mvpframework.fav.IFavConstract.IFavPresenter;
import im.hua.mvpframework.fav.IFavConstract.IFavView;

/**
 * Created by minhua.zmh on 2017/7/21.
 *
 * @author minhua.zmh
 * @version 1.0.0
 * @since ${since}
 */

public interface IFirstConstract {
    interface IFirstPresenter<V extends IFirstView> extends IFavPresenter<V>,IExpressionPresenter<V> {

    }

    interface IFirstView extends IFavView, IExpressionView {
    }
}
