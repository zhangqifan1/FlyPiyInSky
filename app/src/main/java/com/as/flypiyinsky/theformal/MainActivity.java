package com.as.flypiyinsky.theformal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.databinding.ActivityMainBinding;
import com.as.flypiyinsky.theformal.adapter.viewpager.Index_Vp_adapter;
import com.as.flypiyinsky.theformal.index.fragment.BeiBao_Fragment;
import com.as.flypiyinsky.theformal.index.fragment.Caidao_Fragment;
import com.as.flypiyinsky.theformal.index.fragment.Lengfeng_Fragment;
import com.as.flypiyinsky.theformal.index.fragment.Tuohai_Fragment;
import com.as.flypiyinsky.thelibrary.BaseUi.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {



    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void initView() {
        final List<Fragment> list = new ArrayList<>();

        list.add(BeiBao_Fragment.getInstance());
        list.add(Caidao_Fragment.getInstance());
        list.add(Lengfeng_Fragment.getInstance());
        list.add(Tuohai_Fragment.getInstance());

//        mViewBinding.bottomtNgv.enableItemShiftingMode(false);//为true 时  只有当前选中项 会显示文字
//        mViewBinding.bottomtNgv.enableShiftingMode(false);//为true 时,当前选中项宽度改变
//        mViewBinding.bottomtNgv.enableAnimation(false);//开启或关闭点击动画(文字放大效果和图片移动效果)。默认为 true.


        Index_Vp_adapter vpAdapter = new Index_Vp_adapter(getSupportFragmentManager());
        vpAdapter.setFragments(list);

        mViewBinding.vp.setAdapter(vpAdapter);

        //设置联动的ViewPager
        mViewBinding.bottomtNgv.setupWithViewPager(mViewBinding.vp);

//        mViewBinding.vp.setOffscreenPageLimit(1);

    }

    @Override
    protected void initData() {

    }


    @Override
    protected void initListener() {

    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
////        super.onSaveInstanceState(outState, outPersistentState);
//
//        // 重写 onSaveInstanceState 不执行super 方法 ，
//        // 当Activity 处于后台 长时间 被回收后，不保存Fragment状态，
//
//
//
//    }

}
