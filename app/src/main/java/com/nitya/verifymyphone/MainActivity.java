 package com.nitya.verifymyphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.nitya.verifymyphone.databinding.ActivityMainBinding;

 public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),PhoneActivity.class));
                finish();
            }
        },2000);

        

    }
}