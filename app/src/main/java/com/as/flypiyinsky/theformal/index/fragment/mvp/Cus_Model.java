package com.as.flypiyinsky.theformal.index.fragment.mvp;

import android.content.Context;

import com.as.flypiyinsky.theformal.http.BeanCallbackNoDialog;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;


/**
 * -----------------------------
 * Created by zqf on 2018/2/5.
 * ---------------------------
 */

public class Cus_Model implements Cus_Const.custom_Model {


    @Override
    public void requestData(CallBack callBack, Context context) {
        OkGo.<String>get("https://www.oschina.net/action/apiv2/question?catalog=1&nextPageToken=DBA816934CD")
                .tag(context)
                .execute(new BeanCallbackNoDialog<String>() {

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        callBack.showLoading();
                    }

                    @Override
                    public String convertResponse(okhttp3.Response response) throws Throwable {
                        String string = response.body().string();
//                        JSONObject jsonObject = new JSONObject(string);
//                        jsonObject.getInt("code")
//                            if(code==200)
//                        new Gson().fromJson()
                        return string;
                    }

                    @Override
                    public void onError(Response<String> response) {
                        callBack.showError();
                    }

                    @Override
                    public void onSuccess(Response<String> response) {
                        callBack.showSuccess();
                        callBack.setString(response.body());
                    }
                });
    }

    @Override
    public void OnDestroy() {

    }
}
