package controllers;

import controllers.Application.Login;
import play.api.templates.Html;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import play.api.mvc.Request;
import play.mvc.*;
import views.html.*;
import play.data.*;
import util.APICall;
import util.Constants;
import util.APICall.ResponseType;
import play.Logger;

public class LogoutState extends Controller implements AppState {

	public Result handle() {
		String curruser = session("id");
		if (curruser != null) {
			session().clear();
			flash("success", "Log out successfully.");
			return redirect(routes.Application.login());
		}
		return badRequest();
	}

}
