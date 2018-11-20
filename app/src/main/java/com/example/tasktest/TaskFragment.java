package com.example.tasktest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class TaskFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        findView(view);
        initTab();
        initViewPager();
        return view;

    }

    private void findView(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.tl_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.vp_today_task);
    }

    private void initTab() {
        //添加分割线
        LinearLayout linearLayout = (LinearLayout) mTabLayout.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(getContext(),
                R.drawable.divider_vertical));
    }

    private void initViewPager() {
        ArrayList<String> titleDatas = new ArrayList<>();
        titleDatas.add("今日任务");
        titleDatas.add("活动任务");
        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new TodayTaskFragment());
        fragmentList.add(new TodayTaskFragment());
        mViewPager.setAdapter(new MyTodayTaskPageAdapter(getActivity().getSupportFragmentManager(),
                titleDatas, fragmentList));
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
