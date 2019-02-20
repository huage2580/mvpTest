package com.hua.mvptest.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * BaseViewActivity.java
 * Activity作View ,viewModel由自身生成，不依赖外部
 * @author hua
 * @date 2018/9/20
 */

public abstract class BaseViewActivity<T extends BaseViewModel,B extends ViewDataBinding> extends AppCompatActivity implements BaseView<T> {
    protected T viewModel;
    protected B binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (viewModel==null){
            viewModel = createViewModel();
        }
        binding = DataBindingUtil.setContentView(this, layoutId());
        linkViewModel(viewModel);
        viewModel.setView(this);
        viewModel.onCreate();
    }

    @Override
    public Context getXContext() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    protected abstract T createViewModel();
    protected abstract @LayoutRes int layoutId();

}
