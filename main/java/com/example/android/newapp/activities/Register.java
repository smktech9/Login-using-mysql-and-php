package com.example.android.newapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.newapp.R;

public class Register extends Activity {
    EditText app_name,app_user_name,app_user_pass;
    String name,user_name,user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        app_name = (EditText) findViewById(R.id.name);
        app_user_name = (EditText) findViewById(R.id.userName);
        app_user_pass = (EditText) findViewById(R.id.password);
    }

    public void userReg(View view)
    {
        name = app_name.getText().toString();
        user_pass=app_user_pass.getText().toString();
        user_name=app_user_name.getText().toString();

        String option = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(option,name,user_name,user_pass);

        finish();
    }
}
