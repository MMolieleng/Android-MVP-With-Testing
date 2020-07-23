package com.exampe.androidunittesting.login;

public class LoginPresenter {

    private final LoginView view;
    private final LoginModel model;

    public LoginPresenter(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    public void updateUserEmail(String emailInput) {
        if (emailInput == null || emailInput.isEmpty()) {
            view.showEmailError();
        } else {
            this.model.setEmail(emailInput);
        }
    }

    public void updatePassword(String passwordInput) {
        if (passwordInput == null || passwordInput.isEmpty()) {
            view.showPasswordError();
        } else {
            this.model.setPassword(passwordInput);
        }
    }
}
