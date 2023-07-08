package com.example.sharedprefrencedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    private SharedPrefManager sharedPrefManager;
    private EditText etUsername, etpassword;
    private Button btnLogin;
    private ProgressBar pdLogin;
    private ImageView ivLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPrefManager = new SharedPrefManager (this);
        if (sharedPrefManager.getIsLogin()){
            startHomeUI();

        }
    }
    public  void startHomeUI(){
        Intent i;
        i = new Intent(MainActivity.this,
                HomeActivity.class);
        startActivity(i);
    }
}