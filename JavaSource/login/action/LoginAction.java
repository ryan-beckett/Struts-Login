
package login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.form.LoginForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * This class encapsulates the logic needed to authenticate the login
 * credentials. If the login credentials are valid, a success action is taken,
 * otherwise, a fail action is taken. For either action, the appropriate view
 * will be rendered.
 */
public class LoginAction extends Action
{
     private Authenticator auth;

     public LoginAction()
     {
          auth = new Authenticator();
     }

     /**
      * Process the login request and foward this action to the appropriate
      * view.
      */
     public ActionForward execute(ActionMapping mapping, ActionForm form,
               HttpServletRequest request, HttpServletResponse response)
               throws Exception
     {
          // Get the login form
          LoginForm loginForm = (LoginForm) form;

          // Get the login credentials
          String username = loginForm.getUsername();
          String password = loginForm.getPassword();

          // Verify the credentials and forward to view
          if (auth.verify(username, password))
          {
               // Set login credentials to view
               request.setAttribute("username", username);
               request.setAttribute("password", password);
               return mapping.findForward("success");
          }
          else
          {
               return mapping.findForward("failure");
          }
     }
}
