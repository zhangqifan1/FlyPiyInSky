package com.as.flypiyinsky.theformal.index.fragment.mvp;

import android.content.Context;

import com.as.flypiyinsky.thelibrary.BaseUi.mvp.BaseIModel;
import com.as.flypiyinsky.thelibrary.BaseUi.mvp.BaseIView;
import com.as.flypiyinsky.thelibrary.BaseUi.mvp.BasePresenter;

/**
 * -----------------------------
 * Created by zqf on 2018/2/5.
 * ---------------------------
 */

public interface Cus_Const {

    interface custom_Model extends BaseIModel {
        interface CallBack{
            void setString(String string);
            void  showError();
            void  showSuccess();
            void  showLoading();
        }
        void  requestData(CallBack callBack, Context context);
    }

    interface custom_View extends BaseIView {
        void showData(String string);
    }

    abstract class pCssPresenter extends BasePresenter<custom_Model,custom_View> {
        public abstract  void setMvp();

    }

}
