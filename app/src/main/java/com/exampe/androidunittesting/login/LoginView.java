package com.exampe.androidunittesting.login;

public interface LoginView {
    void renderErrorState();

    void renderLoadingState();

    void hideProgressBar();

    void showEmailError();

    void showPasswordError();
}
