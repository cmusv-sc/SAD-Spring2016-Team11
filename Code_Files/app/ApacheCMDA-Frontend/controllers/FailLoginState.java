package controllers;

import play.Logger;
import play.data.Form;
import play.mvc.Controller; 
import play.mvc.Result;
import views.html.login;
public class FailLoginState extends Controller implements AppState {
	
	public Result handle() {
		flash("error", "Login Failed.");
        Logger.debug("Auth failed!");
        return redirect(routes.Application.login());
	}

}
