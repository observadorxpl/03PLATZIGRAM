package com.joseluis.platzigram.login.presenter;

import com.joseluis.platzigram.login.iteractor.LoginInteractor;
import com.joseluis.platzigram.login.iteractor.LoginInteractorImpl;
import com.joseluis.platzigram.login.view.LoginActivity;
import com.joseluis.platzigram.login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter{
    private LoginInteractor loginInteractor;
    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImpl(this);
    }

    @Override
    public void singIn(String username, String password) {
        loginView.disableIntputs();
        loginView.showProgressbar();
        loginInteractor.singIn(username, password);
    }

    @Override
    public void loginSuccess() {
        loginView.goHome();
        loginView.hideProgressbar();
    }

    @Override
    public void showError(String error) {
        loginView.enableInputs();
        loginView.hideProgressbar();
        loginView.loginError(error);
    }
}
