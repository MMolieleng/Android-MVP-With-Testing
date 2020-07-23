package com.exampe.androidunittesting.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

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
    }

    @Test
    public void updateUserEmail_with_bad_data_must_render_showEmailError() {
        presenter.updateUserEmail(null);
        Mockito.verify(viewMock, times(1)).showEmailError();

        presenter.updateUserEmail(" ");
        Mockito.verify(viewMock, times(1)).showEmailError();
    }

    @Test
    public void updateEmail_with_correct_email_must_update_userEmail() {
        presenter.updateUserEmail("doe@gmail.com");
        Mockito.verifyNoInteractions(viewMock);
        Mockito.verify(userMock).setEmail("doe@gmail.com");
    }

    @Test
    public void updatePassword_with_bad_data_must_render_error() {
        presenter.updatePassword(null);
        Mockito.verify(viewMock, times(1)).showEmailError();

        presenter.updatePassword(" ");
        Mockito.verify(viewMock, times(1)).showEmailError();
    }
}