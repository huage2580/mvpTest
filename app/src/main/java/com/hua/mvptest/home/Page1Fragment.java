package com.hua.mvptest.home;

import com.hua.mvptest.R;
import com.hua.mvptest.base.BaseViewFragment;
import com.hua.mvptest.databinding.Page1FragBinding;

public class Page1Fragment extends BaseViewFragment<Page1ViewModel,Page1FragBinding> {

    @Override
    public void linkViewModel(Page1ViewModel viewModel) {
        binding.setViewmodel(viewModel);
    }

    @Override
    protected int layoutId() {
        return R.layout.page1_frag;
    }
}
