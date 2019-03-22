package com.joseluis.platzigram.login.presenter;

public interface LoginPresenter {
    void singIn(String username, String password);
    void loginSuccess();

  void showError(String error);
}
