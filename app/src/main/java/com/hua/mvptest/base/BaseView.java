package com.hua.mvptest.base;

import android.content.Context;

/**
 * BaseView.java
 *
 * @author hua
 * @date 2018/9/21
 */

public interface BaseView<T> {

    void linkViewModel(T viewModel);

    Context getXContext();

}
