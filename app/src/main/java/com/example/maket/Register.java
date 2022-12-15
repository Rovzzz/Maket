package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    private android.widget.EditText edtPassword;
    private android.widget.EditText edtConfPassword;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        checkbox1 = (CheckBox) findViewById(R.id.visible_eye_reg1);
        edtPassword = (EditText) findViewById(R.id.editPassword);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
        checkbox2 = (CheckBox) findViewById(R.id.visible_eye_reg2);
        edtConfPassword = (EditText) findViewById(R.id.editConfirmPassword);
        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    // show password
                    edtConfPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    // hide password
                    edtConfPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

    }


    public void Reg (View v)
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}