package com.hua.mvptest.base;

import android.content.Context;
import android.databinding.BaseObservable;

import com.hua.mvptest.aop.ContextAble;

import java.lang.ref.WeakReference;

/**
 * ViewModel.java
 * 隐藏生命周期
 * @author hua
 * @date 2018/9/21
 */

public class ViewModel extends BaseObservable implements BaseViewModel, ContextAble {
    public WeakReference<BaseView> viewWeakReference;
    @Override
    public void setView(BaseView view) {
        viewWeakReference = new WeakReference<>(view);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public Context getContext() {
        if (viewWeakReference!=null && viewWeakReference.get()!=null){
            return viewWeakReference.get().getXContext();
        }
        return null;
    }
}
