package com.as.flypiyinsky.theformal.index.fragment;


import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.as.flypiyinsky.Const;
import com.as.flypiyinsky.R;
import com.as.flypiyinsky.databinding.FragmentBeiBaoBinding;
import com.as.flypiyinsky.theformal.adapter.recyclerview.BeibaoAdapter;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type0;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type1;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type2;
import com.as.flypiyinsky.theformal.bean.beibao.MultiBeibaoBean;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Const;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Model;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Presenter;
import com.as.flypiyinsky.thelibrary.BaseUi.fragment.BaseMvpFragment;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.fingdo.statelayout.StateLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 背包
 */
public class BeiBao_Fragment extends BaseMvpFragment<Cus_Presenter, Cus_Model, FragmentBeiBaoBinding> implements Cus_Const.custom_View {

    private BeibaoAdapter beibaoAdapter;
    private List<MultiBeibaoBean> list;
    private MultiBeibaoBean m1;
    private MultiBeibaoBean m5;
    private MultiBeibaoBean m9;
    private boolean ishowLoading = true;

    public static BeiBao_Fragment getInstance() {
        BeiBao_Fragment beiBao_fragment = new BeiBao_Fragment();
//        Bundle bundle=new Bundle();
//        bundle.putInt();
//        beiBao_fragment.setArguments(bundle);
        return beiBao_fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bei_bao_;
    }

    @Override
    public void initView(View rootView) {
        BeibaoBean_Type0 b0 = new BeibaoBean_Type0(Const.image0, "文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化");
        BeibaoBean_Type0 b1 = new BeibaoBean_Type0(Const.image1, "文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化");
        BeibaoBean_Type0 b2 = new BeibaoBean_Type0(Const.image2, "文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化");
        BeibaoBean_Type0 b3 = new BeibaoBean_Type0(Const.image3, "文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化文字的文化");

        m1 = new MultiBeibaoBean(1,MultiBeibaoBean.TYPE0, b0);
        MultiBeibaoBean m2 = new MultiBeibaoBean(2,MultiBeibaoBean.TYPE0, b1);
        MultiBeibaoBean m3 = new MultiBeibaoBean(3,MultiBeibaoBean.TYPE0, b2);
        MultiBeibaoBean m4 = new MultiBeibaoBean(4,MultiBeibaoBean.TYPE0, b3);

        BeibaoBean_Type1 b4 = new BeibaoBean_Type1(Const.image4, Const.image5, "最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行");
        BeibaoBean_Type1 b5 = new BeibaoBean_Type1(Const.image6, Const.image7, "最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行");
        BeibaoBean_Type1 b6 = new BeibaoBean_Type1(Const.image8, Const.image9, "最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行");
        BeibaoBean_Type1 b7 = new BeibaoBean_Type1(Const.image10, Const.image11, "最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行最多2行");

        m5 = new MultiBeibaoBean(5,MultiBeibaoBean.TYPE1, b4);
        MultiBeibaoBean m6 = new MultiBeibaoBean(6,MultiBeibaoBean.TYPE1, b5);
        MultiBeibaoBean m7 = new MultiBeibaoBean(7,MultiBeibaoBean.TYPE1, b6);
        MultiBeibaoBean m8 = new MultiBeibaoBean(8,MultiBeibaoBean.TYPE1, b7);


        BeibaoBean_Type2 b8 = new BeibaoBean_Type2(Const.image12, "比较精简");
        BeibaoBean_Type2 b9 = new BeibaoBean_Type2(Const.image13, "比较精简");
        BeibaoBean_Type2 b10 = new BeibaoBean_Type2(Const.image14, "比较精简");
        BeibaoBean_Type2 b11 = new BeibaoBean_Type2(Const.image15, "比较精简");

        m9 = new MultiBeibaoBean(9,MultiBeibaoBean.TYPE2, b8);
        MultiBeibaoBean m10 = new MultiBeibaoBean(10,MultiBeibaoBean.TYPE2, b9);
        MultiBeibaoBean m11 = new MultiBeibaoBean(11,MultiBeibaoBean.TYPE2, b10);
        MultiBeibaoBean m12 = new MultiBeibaoBean(12,MultiBeibaoBean.TYPE2, b11);

        list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        list.add(m7);
        list.add(m8);
        list.add(m9);
        list.add(m10);
        list.add(m11);
        list.add(m12);

        beibaoAdapter = new BeibaoAdapter(list);
        mViewBinding.recycler.setAdapter(beibaoAdapter);
        mViewBinding.recycler.setLayoutManager(new LinearLayoutManager(_mActivity));

        beibaoAdapter.openLoadAnimation(new ScaleInAnimation());
    }

    @Override
    protected void initData() {
        mPresenter.setMvp();
    }

    @Override
    protected void initListener() {
        mViewBinding.startLayout.setRefreshListener(new StateLayout.OnViewRefreshListener() {
            @Override
            public void refreshClick() {
                //showError 按钮的 点击事件
                mPresenter.setMvp();
            }

            @Override
            public void loginClick() {
                //showLogin  那个 按钮的 点击事件
            }
        });


        mViewBinding.refreshlayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {


                Random random = new Random();
                int i = random.nextInt(3);
                switch (i) {
                    case 0:
                        list.add(m1);
                        break;
                    case 1:
                        list.add(m5);
                        break;
                    case 2:
                        list.add(m9);
                        break;
                    default:
                        break;
                }

                beibaoAdapter.notifyItemChanged(list.size() - 1);
                mViewBinding.recycler.scrollToPosition(list.size() - 1);

                refreshLayout.finishLoadMore();
            }

            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                ishowLoading = false;
                mPresenter.setMvp();
//                Random random = new Random();
//                int i = random.nextInt(3);
//                switch (i) {
//                    case 0:
//                        list.add(m1);
//                        break;
//                    case 1:
//                        list.add(m5);
//                        break;
//                    case 2:
//                        list.add(m9);
//                        break;
//                    default:
//                        break;
//                }
//
//                beibaoAdapter.notifyDataSetChanged();
//                refreshLayout.finishRefresh();
            }
        });

    }

    @Override
    public void showData(String string) {
        mViewBinding.refreshlayout.finishRefresh();
//        Toast.makeText(_mActivity, ""+string    , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        if (ishowLoading)
            mViewBinding.startLayout.showLoadingView();
    }

    @Override
    public void showError() {
        mViewBinding.startLayout.showErrorView();
    }

    @Override
    public void showSuccess() {
        mViewBinding.startLayout.showContentView();
    }

}
