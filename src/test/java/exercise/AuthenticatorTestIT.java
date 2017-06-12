package exercise;

import Utils.Mailer;
import exercise.realdatabase.UserFacadeRealDB;

import static org.mockito.Mockito.mock;

/**
 * Created by Luke
 */
public class AuthenticatorTestIT extends AuthenticatorTest{
    @Override
    public Authenticator makeAuthenticator() {
        Mailer mailer = mock(Mailer.class);
        return new Authenticator(new UserFacadeRealDB("pu_localDB"), mailer);
    }
}