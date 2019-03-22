package com.joseluis.platzigram.login.view;


import android.view.View;

public interface LoginView {
    void goCreateAcoount(View view);
    void goHome();

    void enableInputs();
    void disableIntputs();

    void showProgressbar();
    void hideProgressbar();

    void loginError(String error);
}
