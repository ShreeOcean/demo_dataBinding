package com.ocean.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.ocean.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private  MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);


        /** Basically static data binding*/
        binding.setViewModelUser(mainViewModel);

        /** using set get through viewModel method */
        binding.setUser(mainViewModel.getUser());
//        binding.setName("This is First Name");
//        binding.setLastName("This is Last Name");

        binding.includeLayout2.tvAge.setText("29");


    }
}