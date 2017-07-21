package im.hua.mvpframework.expression;

import im.hua.mvpframework.base.BasePresenter;
import im.hua.mvpframework.expression.IExpressionConstract.IExpressionPresenter;
import im.hua.mvpframework.expression.IExpressionConstract.IExpressionView;

/**
 * Created by hua on 2017/7/21.
 */

public class ExpressionPresenter<V extends IExpressionView> extends BasePresenter<V> implements IExpressionPresenter<V> {
    @Override
    public void postExpression(long expressionId) {
        getView().postSuccess();
    }
}
