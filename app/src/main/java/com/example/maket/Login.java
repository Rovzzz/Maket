package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private android.widget.EditText edtPassword;
    private CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        checkbox = (CheckBox) findViewById(R.id.visible_eye);
        edtPassword = (EditText) findViewById(R.id.editTextTextPassword);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                // show password
                    edtPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                // hide password
                    edtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }

    public void LogCongrats(View v)
    {
        Intent intent = new Intent(this, Congrats.class);
        startActivity(intent);
    }
    public void LogReg(View v)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}