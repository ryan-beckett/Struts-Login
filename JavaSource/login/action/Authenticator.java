
package login.action;

/**
 * This class serves as simplistic verification mechanism for authenticating
 * front-end login attempts.
 */
public class Authenticator
{
     private final String USERNAME = "user123";
     private final String PASSWORD = "pass987";

     public boolean verify(String username, String password)
     {
          return username.equals(USERNAME) && password.equals(PASSWORD);
     }
}
