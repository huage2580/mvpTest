package com.hua.mvptest.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hua.mvptest.R;
import com.hua.mvptest.base.BaseViewActivity;
import com.hua.mvptest.databinding.LoginActBinding;

public class LoginActivity extends BaseViewActivity<LoginViewModel,LoginActBinding>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected LoginViewModel createViewModel() {
        return new LoginViewModel();
    }

    @Override
    protected int layoutId() {
        return R.layout.login_act;
    }

    @Override
    public void linkViewModel(LoginViewModel viewModel) {
        binding.setViewmodel(viewModel);
    }


}
