package com.hua.mvptest.base.rv;

import android.databinding.BindingAdapter;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * BindingUtil.java
 *
 * @author hua
 * @date 2018/9/21
 */

public class BindingUtil {

    @BindingAdapter(value = {"base_adapter","layout_manager","gridCount","divider","flex"},requireAll = false)
    public static void baseAdapter(RecyclerView recyclerView, BaseBindingAdapter adapter, RecyclerView.LayoutManager manager,int gridCount,boolean divider,boolean flex){
        //默认竖直方向
        if (manager == null && gridCount<=0){
            manager = new LinearLayoutManager(recyclerView.getContext());
            if (divider){
                DividerItemDecoration itemDecoration = new DividerItemDecoration(recyclerView.getContext(),DividerItemDecoration.VERTICAL);
                itemDecoration.setDrawable(recyclerView.getContext().getResources().getDrawable(com.hua.mvptest.R.drawable.divider_rv));
                recyclerView.addItemDecoration(itemDecoration);
            }
        }
        //grid
        if (gridCount>0){
            manager = new GridLayoutManager(recyclerView.getContext(),gridCount);
//            if (divider){
//                recyclerView.addItemDecoration(new GridDividerItemDecoration(2,Color.parseColor("#e7eaed")));
//            }
        }
//        if (flex){
//            manager = new FlexboxLayoutManager(recyclerView.getContext());
//        }
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

//    @BindingAdapter(value = {"url"},requireAll = false)
//    public static void imgUrl(SimpleDraweeView view,String url){
//        if(url == null) return;
//        if (url.startsWith("http")){
//            view.setImageURI(Uri.parse(url));
//        }else {
//            view.setImageURI(Uri.parse(AppConfig.imgUrl +url));
//
//        }
//    }
    @BindingAdapter(value = {"gone"},requireAll = false)
    public static void gone(View view,boolean b){
        view.setVisibility(b?View.GONE:View.VISIBLE);
    }
    @BindingAdapter(value = {"visible"},requireAll = false)
    public static void visible(View view,boolean b){
        view.setVisibility(b?View.VISIBLE:View.GONE);
    }
}

