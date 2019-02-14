package com.as.flypiyinsky.theformal.index.fragment.mvp;


/**
 * -----------------------------
 * Created by zqf on 2018/2/5.
 * ---------------------------
 */

public class Cus_Presenter extends Cus_Const.pCssPresenter {

    @Override
    public void setMvp() {
       mModel.requestData(new Cus_Const.custom_Model.CallBack() {
           @Override
           public void setString(String string) {
                mView.showData(string);
           }

           @Override
           public void showError() {
               mView.showError();
           }

           @Override
           public void showSuccess() {
               mView.showSuccess();
           }

           @Override
           public void showLoading() {
               mView.showLoading();
           }
       },mView.getCt());


    }
}
