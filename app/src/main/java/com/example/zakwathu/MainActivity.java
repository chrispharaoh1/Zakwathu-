package com.example.zakwathu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.zakwathu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new RadiosFragment());

        binding.bottomNavigationView2.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.radio:
                    replaceFragment(new RadiosFragment());
                    break;

                case R.id.tv:
                    replaceFragment(new TvFragment());
                    break;

                case R.id.news:
                    replaceFragment(new NewsFragment());
                    break;


            }

            return  true;
        });


        //intent functions

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}