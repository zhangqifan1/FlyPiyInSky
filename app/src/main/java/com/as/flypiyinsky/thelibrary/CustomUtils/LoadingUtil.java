package com.as.flypiyinsky.thelibrary.CustomUtils;

import android.content.Context;
import android.view.View;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.thelibrary.BaseUtils.flycodialog._FlycoDialog.BaseDialog;


/**
 * -----------------------------
 * Created by zqf on 2018/7/13.
 * 用这个 单例  做工具类
 * ---------------------------
 */

public class LoadingUtil {


    private BaseDialog baseDialog;

    private LoadingUtil() {
    }

    private static class LoadingUtil_Holder {
        private static LoadingUtil INSTANCE = new LoadingUtil();
    }

    /**
     * 获取实例
     */
    public static LoadingUtil getInstance() {
        return LoadingUtil_Holder.INSTANCE;
    }


    public void show(final Context context) {
        if(baseDialog!=null && baseDialog.isShowing()){
            return;
        }

        //如果要改动画的时间的话 可以下载源码 然后在Duration 那里修改  默认时间为1200
//        if (baseDialog == null) {
            baseDialog = new BaseDialog(context) {
                @Override
                public View onCreateView() {
                    dimEnabled(false);
                    setCanceledOnTouchOutside(true);
                    //如果要改动画的时间的话 可以下载源码   RotatingPlane 然后在Duration 那里修改  默认时间为1200
                    View inflate = View.inflate(context, R.layout.custom_loading, null);
                    return inflate;
                }
                @Override
                public void setUiBeforShow() {
                }
            };
//        }
            baseDialog.show();

    }

    public void dismiss(){

        if(baseDialog!=null){
            baseDialog.dismiss();
        }
    }

}
