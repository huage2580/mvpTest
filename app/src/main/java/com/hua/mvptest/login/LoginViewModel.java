package com.hua.mvptest.login;

import android.databinding.ObservableField;
import android.util.Log;

import com.hua.mvptest.base.ViewModel;

public class LoginViewModel extends ViewModel {
    private static final String TAG = "LoginViewModel";

    public final ObservableField<String> userName = new ObservableField<>();
    public final ObservableField<String> psw = new ObservableField<>();

    public void loginClick(){
        Log.i(TAG, "loginClick: "+userName.get()+psw.get());
    }

}
