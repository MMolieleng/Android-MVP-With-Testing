package com.exampe.androidunittesting.login;

class LoginPresenter {

    private final LoginView view;
    private final LoginModel model;

    public LoginPresenter(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }

    public void updateUserEmail(String userInput) {
        this.model.setEmail(userInput);
    }

    public void updatePassword(String passwordInput) {
        this.model.setPassword(passwordInput);
    }

}
