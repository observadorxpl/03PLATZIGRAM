package com.joseluis.platzigram.login.view;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.joseluis.platzigram.R;
import com.joseluis.platzigram.login.presenter.LoginPresenter;
import com.joseluis.platzigram.login.presenter.LoginPresenterImpl;
import com.joseluis.platzigram.view.ContainerActivity;
import com.joseluis.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private TextInputEditText username;
    private TextInputEditText password;
    private Button btnLogin;
    private ProgressBar login_progressBar;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextInputEditText) findViewById(R.id.login_username);
        password = (TextInputEditText) findViewById(R.id.login_password);
        btnLogin = (Button) findViewById(R.id.login_buttonlogin);
        login_progressBar = (ProgressBar) findViewById(R.id.login_progressBbar);
        hideProgressbar();

        loginPresenter = new LoginPresenterImpl(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.singIn(username.getText().toString(), password.getText().toString());
            }
        });
    }


    @Override
    public void goCreateAcoount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }

    @Override
    public void goHome() {
        /*TextInputEditText username = (TextInputEditText)findViewById(R.id.login_username);
        TextInputEditText password = (TextInputEditText)findViewById(R.id.login_password);

        if(username.getText().toString().equals("usuario01") && password.getText().toString().equals("123456")){
            Intent intent = new Intent(this, ContainerActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }*/

        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    @Override
    public void enableInputs() {
        username.setEnabled(true);
        password.setEnabled(true);
        btnLogin.setEnabled(true);
    }

    @Override
    public void disableIntputs() {
        username.setEnabled(false);
        password.setEnabled(false);
        btnLogin.setEnabled(false);
    }

    @Override
    public void showProgressbar() {

        login_progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressbar() {

        login_progressBar.setVisibility(View.GONE);
    }

    @Override
    public void loginError(String error) {
        Toast.makeText(this, getString(R.string.login_error) + error, Toast.LENGTH_SHORT).show();
    }
}

