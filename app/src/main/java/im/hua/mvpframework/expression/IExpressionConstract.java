package im.hua.mvpframework.expression;

import im.hua.mvpframework.base.IBasePresenter;
import im.hua.mvpframework.base.IBaseView;

/**
 * Created by minhua.zmh on 2017/7/21.
 *
 * @author minhua.zmh
 * @version 1.0.0
 * @since ${since}
 */

public interface IExpressionConstract {
    interface IExpressionPresenter<V extends IBaseView> extends IBasePresenter<V> {
        void postExpression(long expressionId);
    }

    interface IExpressionView extends IBaseView {
        void postSuccess();
    }

}
