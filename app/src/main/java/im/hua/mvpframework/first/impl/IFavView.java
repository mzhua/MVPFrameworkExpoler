package im.hua.mvpframework.first.impl;

import im.hua.mvpframework.first.IBaseView;

/**
 * Created by hua on 2017/7/21.
 */

public interface IFavView extends IBaseView {
    void favSuccess();

    void favFailed(String errorMsg);
}
