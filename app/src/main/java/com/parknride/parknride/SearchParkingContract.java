package com.parknride.parknride;

import android.support.annotation.StringRes;

import util.BasePresenter;
import util.BaseView;

/**
 * Created by anurag on 16/11/17.
 */

public interface SearchParkingContract {

    interface View extends BaseView<Presenter> {
        void makeToast(@StringRes int stringId);

        String getArriving();

        String getLeaving();

        String getLocation();

        String getSelectLocation();

        String getCardSelection();
    }

    interface Presenter extends BasePresenter{

        void onSearch();

        void onSelectLocation();

        void onCardSelection();

        void subscribe();

        void unsubscribe();
    }

}
