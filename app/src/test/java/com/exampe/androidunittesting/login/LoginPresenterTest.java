package com.exampe.androidunittesting.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

public class LoginPresenterTest {

    private LoginView viewMock;
    private LoginPresenter presenter;
    private LoginModel userMock;

    @Before
    public void setUp() throws Exception {
        viewMock = mock(LoginView.class);
        userMock = mock(LoginModel.class);
        presenter = new LoginPresenter(viewMock, userMock);
    }

    @After
    public void tearDown() throws Exception {
        presenter = null;
    }

    @Test
    public void updateUserEmail_with_bad_data_must_render_showEmailError() {
        presenter.updateUserEmail(null);
        verify(viewMock, times(1)).showEmailError();

        presenter.updateUserEmail(" ");
        verify(viewMock, times(1)).showEmailError();
    }

    @Test
    public void updateEmail_with_correct_email_must_update_userEmail() {
        presenter.updateUserEmail("doe@gmail.com");
        verifyNoInteractions(viewMock);
        verify(userMock).setEmail("doe@gmail.com");
    }

    @Test
    public void updatePassword_with_bad_data_must_render_error() {
        presenter.updatePassword(null);
        verify(viewMock, times(1)).showPasswordError();

        presenter.updatePassword(" ");
        verify(viewMock, times(1)).showPasswordError();
    }

    @Test
    public void updatePassword_with_valid_data_must_setPassword() {
        presenter.updatePassword("password");

        verifyNoInteractions(viewMock);
        verify(userMock).setPassword("password");
    }
}