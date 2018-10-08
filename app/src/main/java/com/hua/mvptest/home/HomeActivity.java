package com.hua.mvptest.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hua.mvptest.R;

/**
 * HomeActivity.java
 *
 * @author hua
 * @date 2018/9/20
 */

public class HomeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Page1Fragment page1Fragment = new Page1Fragment();
        page1Fragment.setViewModel(new Page1ViewModel());
        getSupportFragmentManager().beginTransaction().add(R.id.content,page1Fragment).commit();
    }
}
