package com.hua.mvptest.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * BaseViewFragment.java
 * Fragment 作View, viewModel由外部注入(由Activity/其他 )
 * @author hua
 * @date 2018/9/20
 */

public abstract class BaseViewFragment<T extends BaseViewModel,B extends ViewDataBinding> extends Fragment implements BaseView<T> {
    protected T viewModel;
    protected B binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,layoutId() ,container,false);
        linkViewModel(viewModel);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (viewModel!=null){
            viewModel.onCreate();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (viewModel!=null){
            viewModel.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (viewModel!=null){
            viewModel.onResume();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (viewModel!=null){
            viewModel.onDestroy();
        }
    }

    public void setViewModel(T viewModel) {
        this.viewModel = viewModel;
    }
    protected abstract  @LayoutRes int layoutId();
}
