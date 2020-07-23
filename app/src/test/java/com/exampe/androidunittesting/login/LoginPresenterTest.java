package com.exampe.androidunittesting.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginPresenterTest {

    private LoginView viewMock;
    private LoginPresenter presenter;
    @Before
    public void setUp() throws Exception {
        viewMock = mock(LoginView.class);
        presenter = new LoginPresenter(viewMock, mock(LoginModel.class));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateUserEmail() {
        presenter.updateUserEmail(null);
        Mockito.verify(viewMock, times(1)).showEmailError();

        presenter.updateUserEmail(" ");
        Mockito.verify(viewMock, times(1)).showEmailError();
    }

    @Test
    public void updatePassword() {
    }
}