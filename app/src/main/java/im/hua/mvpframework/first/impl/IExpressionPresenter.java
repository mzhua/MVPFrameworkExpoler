package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.IBasePresenter;

/**
 * Created by hua on 2017/7/21.
 */

public interface IExpressionPresenter extends IBasePresenter {
    void postExpression(long expressionId);
}
