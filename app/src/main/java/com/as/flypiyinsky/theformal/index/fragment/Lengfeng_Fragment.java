package com.as.flypiyinsky.theformal.index.fragment;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.databinding.FragmentLengfengBinding;
import com.as.flypiyinsky.theformal.adapter.recyclerview.LengFengAdapter;
import com.as.flypiyinsky.theformal.adapter.recyclerview.StickyItemDecoration;
import com.as.flypiyinsky.theformal.bean.lengfeng.ContentBean;
import com.as.flypiyinsky.theformal.bean.lengfeng.LengfengBean;
import com.as.flypiyinsky.theformal.bean.lengfeng.TitleBean;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Const;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Model;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Presenter;
import com.as.flypiyinsky.thelibrary.BaseUi.fragment.BaseMvpFragment;
import com.as.flypiyinsky.thelibrary.CustomUtils.LoadingUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Lengfeng_Fragment extends BaseMvpFragment<Cus_Presenter,Cus_Model,FragmentLengfengBinding> implements Cus_Const.custom_View {


    private int lastY;
    private String imagetitle0="http://img0.imgtn.bdimg.com/it/u=2882284884,1913504836&fm=26&gp=0.jpg";
    private String imagetitle1="http://img1.imgtn.bdimg.com/it/u=79077423,2311992760&fm=26&gp=0.jpg";
    private String imagetitle2="http://img2.imgtn.bdimg.com/it/u=2688221569,1478210953&fm=26&gp=0.jpg";
    private String imagetitle3="http://img5.imgtn.bdimg.com/it/u=1463182331,104886018&fm=26&gp=0.jpg";
    private String imagetitle4="http://img3.imgtn.bdimg.com/it/u=17762083,4294052148&fm=26&gp=0.jpg";
    private String imagetitle5="http://img4.imgtn.bdimg.com/it/u=2455324172,163851104&fm=26&gp=0.jpg";
    private String imagetitle6="http://img5.imgtn.bdimg.com/it/u=2556599638,4266873083&fm=26&gp=0.jpg";
    private String imagetitle7="http://img0.imgtn.bdimg.com/it/u=2648575681,451707947&fm=26&gp=0.jpg";


    private String imagecontent0="http://img3.imgtn.bdimg.com/it/u=1141586279,2886100024&fm=26&gp=0.jpg";
    private String imagecontent1="http://img3.imgtn.bdimg.com/it/u=1352614346,1148201041&fm=26&gp=0.jpg ";
    private String imagecontent2="http://img3.imgtn.bdimg.com/it/u=813455171,3455775580&fm=26&gp=0.jpg";
    private String imagecontent3="http://img1.imgtn.bdimg.com/it/u=3621120145,2402931784&fm=26&gp=0.jpg";
    private String imagecontent4="http://img1.imgtn.bdimg.com/it/u=172181738,2368148147&fm=26&gp=0.jpg";
    private String imagecontent5="http://img4.imgtn.bdimg.com/it/u=4073751799,1712936335&fm=26&gp=0.jpg";
    private String imagecontent6="http://img4.imgtn.bdimg.com/it/u=3327416916,257169400&fm=26&gp=0.jpg";
    private String imagecontent7="http://img0.imgtn.bdimg.com/it/u=725823361,1622128019&fm=26&gp=0.jpg";



    public static Lengfeng_Fragment getInstance() {
        Lengfeng_Fragment lengfeng_fragment=new Lengfeng_Fragment();
//        Bundle bundle=new Bundle();
//        bundle.putInt();
//        beiBao_fragment.setArguments(bundle);
        return lengfeng_fragment;
    }



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_lengfeng_;
    }

    @Override
    public void initView(View rootView) {
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onSupportVisible() {
        mPresenter.setMvp();
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void showData(String string) {
        List<LengfengBean> lengfengBeans=new ArrayList<>();
        LengfengBean title0 = new LengfengBean(LengfengBean.Type0, new TitleBean(imagetitle0, "吾乃标题0"));
        LengfengBean title1 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle1,"吾乃标题1" ));
        LengfengBean title2 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle2,"吾乃标题2" ));
        LengfengBean title3 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle3,"吾乃标题3" ));
        LengfengBean title4 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle4,"吾乃标题4" ));
        LengfengBean title5 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle5,"吾乃标题5" ));
        LengfengBean title6 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle6,"吾乃标题6" ));
        LengfengBean title7 =new LengfengBean(LengfengBean.Type0,new TitleBean(imagetitle7,"吾乃标题7" ));


        LengfengBean c0 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent0,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c1 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent1,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c2 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent2,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c3 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent3,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c4 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent4,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c5 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent5,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c6 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent6,"毁天灭地小钒哥斗智斗勇0" ));
        LengfengBean c7 =new LengfengBean(LengfengBean.Type1,new ContentBean(imagecontent7,"毁天灭地小钒哥斗智斗勇0" ));

        lengfengBeans.add(title0);
        lengfengBeans.add(c0);
        lengfengBeans.add(title1);
        lengfengBeans.add(c1);
        lengfengBeans.add(title2);
        lengfengBeans.add(c2);
        lengfengBeans.add(title3);
        lengfengBeans.add(c3);
        lengfengBeans.add(title4);
        lengfengBeans.add(c4);
        lengfengBeans.add(title5);
        lengfengBeans.add(c5);
        lengfengBeans.add(title6);
        lengfengBeans.add(c6);
        lengfengBeans.add(title7);
        lengfengBeans.add(c7);

        LengFengAdapter lengFengAdapter = new LengFengAdapter(lengfengBeans);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(_mActivity);
        mViewBinding.recycler.setLayoutManager(linearLayoutManager);
        //在设置Adapter之前
        mViewBinding.recycler.addItemDecoration(new StickyItemDecoration());

        mViewBinding.recycler.setAdapter(lengFengAdapter);

    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void showLoading() {
//        if(getActivity().isActivityTransitionRunning())
        LoadingUtil.getInstance().show(_mActivity);
    }

    @Override
    public void showError() {

    }

    @Override
    public void showSuccess() {
        LoadingUtil.getInstance().dismiss();
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
