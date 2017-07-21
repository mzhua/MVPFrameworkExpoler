package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.BasePresenter;

/**
 * Created by hua on 2017/7/21.
 */

public class ExpressionPresenter<V extends IExpressionView> extends BasePresenter<V> implements IExpressionPresenter<V>{
    @Override
    public void postExpression(long expressionId) {
        getView().postSuccess();
    }
}
