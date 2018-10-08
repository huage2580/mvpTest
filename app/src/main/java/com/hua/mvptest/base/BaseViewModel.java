package com.hua.mvptest.base;

/**
 * BaseViewModel.java
 * viewModel 进行具体业务逻辑，数据控制
 * @author hua
 * @date 2018/9/21
 */

public interface BaseViewModel {
    void onCreate();
    void onResume();
    void onPause();
    void onDestroy();

}