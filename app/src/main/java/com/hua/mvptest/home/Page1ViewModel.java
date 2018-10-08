package com.hua.mvptest.home;

import android.databinding.ObservableField;

import com.hua.mvptest.base.ViewModel;

public class Page1ViewModel extends ViewModel {
    public final ObservableField<String> text = new ObservableField<>("page1");

}
