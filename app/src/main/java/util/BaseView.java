package util;

import android.support.annotation.StringRes;

/**
 * Created by anurag on 17/11/17.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void makeToast(@StringRes int stringId);

    void makeToast(String message);
}
