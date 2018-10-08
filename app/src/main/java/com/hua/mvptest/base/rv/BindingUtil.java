package com.hua.mvptest.base.rv;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * BindingUtil.java
 *
 * @author hua
 * @date 2018/9/21
 */

public class BindingUtil {

    @BindingAdapter(value = {"app:base_adapter","app:layout_manager"},requireAll = false)
    public static void baseAdapter(RecyclerView recyclerView,BaseBindingAdapter adapter,RecyclerView.LayoutManager manager){
        //默认竖直方向
        if (manager == null){
            manager = new LinearLayoutManager(recyclerView.getContext());
        }
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
