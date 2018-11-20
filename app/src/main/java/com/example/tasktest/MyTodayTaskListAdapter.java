package com.example.tasktest;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MyTodayTaskListAdapter extends BaseQuickAdapter<TodayTask, BaseViewHolder> {
    public MyTodayTaskListAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TodayTask item) {
        helper.setText(R.id.tv_description, item.getDescription());
        helper.setText(R.id.tv_bonus, item.getBonus());
        helper.setImageResource(R.id.img_sender, item.getSenderImg());
        helper.addOnClickListener(R.id.btn_go);
        // 加载网络图片
        //Glide.with(mContext).load(item.getUserAvatar()).crossFade().into((ImageView) helper.getView(R.id.iv));
    }
}

