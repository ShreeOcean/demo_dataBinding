package com.ocean.databindingdemo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    private User user;

    public MainViewModel(@NonNull Application application) {
        super(application);

        user = new User("ocean", "shree");

    }
    public User getUser(){
        return this.user;
    }
}
