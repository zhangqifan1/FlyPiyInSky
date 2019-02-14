package com.as.flypiyinsky.theformal.index.fragment;


import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.databinding.FragmentTuohaiBinding;
import com.as.flypiyinsky.theformal.adapter.recyclerview.TuohaiAdapter;
import com.as.flypiyinsky.theformal.bean.tuohai.TuohaiBean;
import com.as.flypiyinsky.theformal.bean.tuohai.Tuohai_DiffCallBack;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Const;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Model;
import com.as.flypiyinsky.theformal.index.fragment.mvp.Cus_Presenter;
import com.as.flypiyinsky.thelibrary.BaseUi.fragment.BaseMvpFragment;
import com.as.flypiyinsky.thirdview.zhifubao_head.APHeaderView;
import com.chad.library.adapter.base.animation.ScaleInAnimation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tuohai_Fragment extends BaseMvpFragment<Cus_Presenter,Cus_Model,FragmentTuohaiBinding> implements Cus_Const.custom_View {

    private List<TuohaiBean> newList=new ArrayList<>();

    public static Tuohai_Fragment getInstance() {
        Tuohai_Fragment tuohai_fragment=new Tuohai_Fragment();
//        Bundle bundle=new Bundle();
//        bundle.putInt();
//        beiBao_fragment.setArguments(bundle);
        return tuohai_fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tuohai_;
    }

    @Override
    public void initView(View rootView) {



        final LinearLayoutManager lm = new LinearLayoutManager(_mActivity, LinearLayoutManager.VERTICAL, false) {

            @Override
            public int scrollVerticallyBy(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
                int scrolled = super.scrollVerticallyBy(dy, recycler, state);
                if (dy < 0 && scrolled != dy) {
                    // 有剩余
                    APHeaderView.Behavior behavior = mViewBinding.alipayHeader.getBehavior();
                    if (behavior != null) {
                        int unconsumed = dy - scrolled;
                        int consumed = behavior.scroll((CoordinatorLayout) mViewBinding.alipayHeader.getParent(), mViewBinding.alipayHeader, unconsumed, -mViewBinding.alipayHeader.getScrollRange(), 0);
                        scrolled += consumed;
                    }
                }
                return scrolled;
            }
        };

        mViewBinding.alipayHeader.setOnHeaderFlingUnConsumedListener(new APHeaderView.OnHeaderFlingUnConsumedListener() {
            @Override
            public int onFlingUnConsumed(APHeaderView header, int targetOffset, int unconsumed) {
                APHeaderView.Behavior behavior = mViewBinding.alipayHeader.getBehavior();
                int dy = -unconsumed;
                if (behavior != null) {
                    mViewBinding.recycler.scrollBy(0, dy);
                }
                return dy;
            }
        });



        List<TuohaiBean> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new TuohaiBean(i, "俺是数据撒"+i));
        }
        TuohaiAdapter tuohaiAdapter = new TuohaiAdapter(R.layout.tuohai_item, list);
        mViewBinding.recycler.setAdapter(tuohaiAdapter);
        mViewBinding.recycler.setLayoutManager(lm);

        tuohaiAdapter.openLoadAnimation(new ScaleInAnimation());

        mViewBinding.recycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    APHeaderView.Behavior behavior = mViewBinding.alipayHeader.getBehavior();
                    if (behavior != null) {
                        behavior.checkSnap((CoordinatorLayout) mViewBinding.alipayHeader.getParent(), mViewBinding.alipayHeader);
                    }
                }
            }
        });

        mViewBinding.tvXianshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                newList.clear();
                newList.addAll(list);

                int i = random.nextInt(20);
//            list.add(new TuohaiBean(i, "俺是数据撒"+i));
//            list.add(new TuohaiBean(i, "俺是数据撒"+i));
//            list.add(new TuohaiBean(i, "俺是数据撒"+i));

                list.set(i,new TuohaiBean((i+1)%list.size(), "俺是修改过的数据撒"+i)) ;
                list.set((i+1)%list.size(),new TuohaiBean((i+1)%list.size(), "俺是修改过的数据撒"+(i+1)%list.size())) ;
                list.set((i+2)%list.size(),new TuohaiBean((i+2)%list.size(), "俺是修改过的数据撒"+(i+2)%list.size())) ;
                list.set((i+3)%list.size(),new TuohaiBean((i+3)%list.size(), "俺是修改过的数据撒"+(i+3)%list.size())) ;
                // 获取DiffResut结果
                DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new Tuohai_DiffCallBack(newList, list));
                //使用DiffResult分发给apdate热更新
                diffResult.dispatchUpdatesTo(tuohaiAdapter);
            }
        });
//        tuohaiAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//                Random random = new Random();
//                newList.clear();
//                newList.addAll(list);
//
//                int i = random.nextInt(20);
////            list.add(new TuohaiBean(i, "俺是数据撒"+i));
////            list.add(new TuohaiBean(i, "俺是数据撒"+i));
////            list.add(new TuohaiBean(i, "俺是数据撒"+i));
//
//                list.set(i,new TuohaiBean((i+1)%list.size(), "俺是修改过的数据撒"+i)) ;
//                list.set((i+1)%list.size(),new TuohaiBean((i+1)%list.size(), "俺是修改过的数据撒"+(i+1)%list.size())) ;
//                list.set((i+2)%list.size(),new TuohaiBean((i+2)%list.size(), "俺是修改过的数据撒"+(i+2)%list.size())) ;
//                list.set((i+3)%list.size(),new TuohaiBean((i+3)%list.size(), "俺是修改过的数据撒"+(i+3)%list.size())) ;
//                // 获取DiffResut结果
//                DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new Tuohai_DiffCallBack(newList, list));
//                //使用DiffResult分发给apdate热更新
//                diffResult.dispatchUpdatesTo(tuohaiAdapter);
//
//            }
//        });


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void showData(String string) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showSuccess() {

    }
}
