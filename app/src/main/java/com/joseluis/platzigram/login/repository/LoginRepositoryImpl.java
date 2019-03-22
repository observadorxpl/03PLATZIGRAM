package com.joseluis.platzigram.login.repository;

import com.joseluis.platzigram.login.presenter.LoginPresenter;

public class LoginRepositoryImpl implements LoginRepository {
    private  LoginPresenter loginPresenter;

    public LoginRepositoryImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void singIn(String username, String password) {
        boolean success = true;
        if(success){
            loginPresenter.loginSuccess();
        }else{
            loginPresenter.showError("Ocurrio un error");
        }
    }

}
