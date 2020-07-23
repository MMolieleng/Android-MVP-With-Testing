package com.exampe.androidunittesting;

import androidx.appcompat.app.AppCompatActivity;
import com.exampe.androidunittesting.login.LoginView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void renderErrorState() {

    }

    @Override
    public void renderLoadingState() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void showEmailError() {

    }

    @Override
    public void showPasswordError() {

    }
}