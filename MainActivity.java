package com.example.android.newapp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.newapp.R;

import java.io.InputStream;

import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    EditText app_name,app_pass;
    String login_name,login_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_name=(EditText) findViewById(R.id.uName);
        app_pass=(EditText) findViewById(R.id.pass);
    }


    public void userReg(View view)
    {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    public void userLogin(View view)
    {
        login_name=app_name.getText().toString();
        login_pass=app_pass.getText().toString();

        String option="login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(option,login_name,login_pass);
    }

}