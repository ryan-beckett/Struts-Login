
package login.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * This class serves as a form bean for the login page view.
 */
public class LoginForm extends ActionForm
{
     private String username;
     private String password;

     /**
      * Validate the form input and return a set of validation errors of any
      * validation rule wasn't met.
      */
     public ActionErrors validate(ActionMapping mapping,
               HttpServletRequest request)
     {
          ActionErrors errors = new ActionErrors();

          // Check for empty username field
          if (username == null || username.trim().equals(""))
               errors.add("username", new ActionMessage(
                         "error.username.required"));

          // Check for empty password field
          if (password == null || password.trim().equals(""))
               errors.add("password", new ActionMessage(
                         "error.password.required"));

          return errors;
     }

     /**
      * Get the username.
      */
     public String getUsername()
     {
          return username;
     }

     /**
      * Set the username.
      */
     public void setUsername(String username)
     {
          this.username = username;
     }

     /**
      * Get the password.
      */
     public String getPassword()
     {
          return password;
     }

     /**
      * Set the password.
      */
     public void setPassword(String password)
     {
          this.password = password;
     }

}
