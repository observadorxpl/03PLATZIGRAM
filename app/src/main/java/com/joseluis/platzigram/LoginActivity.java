package com.joseluis.platzigram;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.joseluis.platzigram.view.ContainerActivity;
import com.joseluis.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAcoount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goLoginAccount(View view){
        TextInputEditText username = (TextInputEditText)findViewById(R.id.login_username);
        TextInputEditText password = (TextInputEditText)findViewById(R.id.login_password);

        if(username.getText().toString().equals("usuario01") && password.getText().toString().equals("123456")){
            Intent intent = new Intent(this, ContainerActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

}

