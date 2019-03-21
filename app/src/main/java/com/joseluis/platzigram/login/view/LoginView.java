package com.joseluis.platzigram.login.view;

public interface LoginView {
    void goCreateAcoount();
    void goLoginAccount();

    void enableInputs();
    void disableIntputs();

    void showProgressbar();
    void hideProgressbar();
}
