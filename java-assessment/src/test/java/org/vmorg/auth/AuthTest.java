package org.vmorg.auth;

import org.hamcrest.core.AnyOf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Any;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthTest {

    @Test
   public void testUserIsAuthorized() {
        AuthorisingService mockAuthorisingService = mock(AuthorisingService.class);
        when(mockAuthorisingService.isAuthorised("user1")).thenReturn(true);
        Assertions.assertTrue(mockAuthorisingService.isAuthorised("user1"));
    }


    @Test
    public void testUserIsNotAuthorized() {
        AuthorisingService mockAuthorisingService = mock(AuthorisingService.class);
        when(mockAuthorisingService.isAuthorised("")).thenReturn(false);
        Assertions.assertFalse(mockAuthorisingService.isAuthorised(""));
    }
}
