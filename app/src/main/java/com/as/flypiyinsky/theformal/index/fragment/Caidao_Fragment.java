package com.as.flypiyinsky.theformal.index.fragment;


import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.as.flypiyinsky.Const;
import com.as.flypiyinsky.R;
import com.as.flypiyinsky.databinding.CustomShimmerBinding;
import com.as.flypiyinsky.databinding.FragmentCaidaoBinding;
import com.as.flypiyinsky.theformal.adapter.recyclerview.FeatureAdapter;
import com.as.flypiyinsky.theformal.adapter.shimmer.ShimmerAdapter;
import com.as.flypiyinsky.theformal.banner_imageloader.GlideImageLoader;
import com.as.flypiyinsky.theformal.bean.caidao.CaidaoBean;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Const;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Model;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Presenter;
import com.as.flypiyinsky.thelibrary.BaseUi.fragment.BaseMvpFragment;
import com.as.flypiyinsky.thelibrary.BaseUtils.android_util_code.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureLinearLayoutManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class Caidao_Fragment extends BaseMvpFragment<Cus_Presenter,Cus_Model,FragmentCaidaoBinding> implements Cus_Const.custom_View {

    private String banner0="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=745096747,3395666420&fm=27&gp=0.jpg";
    private String banner1="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2735633715,2749454924&fm=27&gp=0.jpg";
    private String banner2="https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=935292084,2640874667&fm=27&gp=0.jpg";
    private List<CaidaoBean> beanList;

    public static Caidao_Fragment getInstance() {
        Caidao_Fragment caidao_fragment=new Caidao_Fragment();
//        Bundle bundle=new Bundle();
//        bundle.putInt();
//        beiBao_fragment.setArguments(bundle);
        return caidao_fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_caidao_;
    }

    @Override
    public void initView(View rootView) {

        CaidaoBean c1 = new CaidaoBean(Const.image0,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c2 = new CaidaoBean(Const.image1,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c3 = new CaidaoBean(Const.image2,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c4 = new CaidaoBean(Const.image3,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c5 = new CaidaoBean(Const.image4,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c6 = new CaidaoBean(Const.image5,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c7 = new CaidaoBean(Const.image6,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c8 = new CaidaoBean(Const.image7,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c9 = new CaidaoBean(Const.image8,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c10 = new CaidaoBean(Const.image9,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c11 = new CaidaoBean(Const.image10,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c12 = new CaidaoBean(Const.image11,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c13 = new CaidaoBean(Const.image12,"我是标题,你呢", "我是内容,你呢");
        CaidaoBean c14 = new CaidaoBean(Const.image13,"我是标题,你呢", "我是内容,你呢");

        beanList = new ArrayList<>();
        beanList.add(c1);
        beanList.add(c2);
        beanList.add(c3);
        beanList.add(c4);
        beanList.add(c5);
        beanList.add(c6);
        beanList.add(c7);
        beanList.add(c8);
        beanList.add(c9);
        beanList.add(c10);
        beanList.add(c11);
        beanList.add(c12);
        beanList.add(c13);
        beanList.add(c14);


        List<String> images=new ArrayList<>();
        images.add(banner0);
        images.add(banner1);
        images.add(banner2);
        //设置图片加载器
        mViewBinding.banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mViewBinding.banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        mViewBinding.banner.start();

    }
    /*
    @Override
    public void onSupportInvisible() {
        super.onSupportInvisible();
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
//        mViewBinding.shimmerRecycler.showShimmerAdapter();
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    sleep(2000);
//                    _mActivity.runOnUiThread(() -> mViewBinding.shimmerRecycler.hideShimmerAdapter());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();

    }*/

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
        mPresenter.setMvp();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void showData(String string) {
        mViewBinding.stateLayout.showContentView();

        FeatureAdapter featureAdapter=new FeatureAdapter(beanList);
        FeatureLinearLayoutManager layoutManager = new FeatureLinearLayoutManager(_mActivity);
        mViewBinding.featuredRecyclerView.setAdapter(featureAdapter);
        mViewBinding.featuredRecyclerView.setLayoutManager(layoutManager);

        featureAdapter.setOnItemClick(position ->
                {
                    ToastUtils.showShort(position + "");
                    mViewBinding.appBarLayout.setExpanded(false);
                }
        );
        featureAdapter.setOnBottomClick(position -> {
            ToastUtils.showShort("底部区域被点击"+position  );
        });
    }

    @Override
    public void showLoading() {
        View custom_shimmer = View.inflate(_mActivity, R.layout.custom_shimmer, null);
        CustomShimmerBinding customShimmerBinding = DataBindingUtil.bind(custom_shimmer);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        customShimmerBinding.recyclerShimmer.setAdapter(new ShimmerAdapter(R.layout.shimmer_item,list));
        customShimmerBinding.recyclerShimmer.setLayoutManager(new LinearLayoutManager(_mActivity));
        mViewBinding.stateLayout.showCustomView(custom_shimmer);
    }

    @Override
    public void showError() {

    }

    @Override
    public void showSuccess() {

    }
}
