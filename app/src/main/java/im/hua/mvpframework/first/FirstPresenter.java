package im.hua.mvpframework.first;

import im.hua.mvpframework.base.BasePresenter;
import im.hua.mvpframework.expression.IExpressionConstract.IExpressionPresenter;
import im.hua.mvpframework.fav.IFavConstract.IFavPresenter;
import im.hua.mvpframework.first.IFirstConstract.IFirstPresenter;
import im.hua.mvpframework.first.IFirstConstract.IFirstView;

/**
 * Created by hua on 2017/7/21.
 */

public class FirstPresenter extends BasePresenter<IFirstView> implements IFirstPresenter<IFirstView> {
    private IExpressionPresenter mExpressionPresenter;

    private IFavPresenter mFavPresenter;

    public FirstPresenter(IExpressionPresenter expressionPresenter,
                          IFavPresenter favPresenter) {
        mExpressionPresenter = expressionPresenter;
        mFavPresenter = favPresenter;
    }

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
