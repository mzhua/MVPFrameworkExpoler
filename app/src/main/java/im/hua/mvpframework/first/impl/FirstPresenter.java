package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.BasePresenter;
import im.hua.mvpframework.first.IBaseView;

/**
 * Created by hua on 2017/7/21.
 */

public class FirstPresenter extends BasePresenter<IFirstView> implements IFirstPresenter {
    private IExpressionPresenter mExpressionPresenter = new ExpressionPresenter();

    private IFavPresenter mFavPresenter = new FavPresenter();

    @Override
    public void onAttached(IFirstView view) {
        super.onAttached(view);
        mExpressionPresenter.onAttached(view);
        mFavPresenter.onAttached(view);
    }

    @Override
    public void onDetached(IFirstView view) {
        super.onDetached(view);
        mExpressionPresenter.onDetached(view);
        mFavPresenter.onDetached(view);
    }

    @Override
    public void postExpression(long expressionId) {
        mExpressionPresenter.postExpression(expressionId);
    }

    @Override
    public void fav(long songID) {
        mFavPresenter.fav(songID);
    }

}
