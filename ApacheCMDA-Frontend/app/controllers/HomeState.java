package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.api.templates.Html;
import play.data.Form;
import views.html.home;
import views.html.login;
import play.api.mvc.Request;
import play.mvc.*;
import views.html.*;
import play.data.*;
import util.APICall;
import util.Constants;
import util.APICall.ResponseType;
import play.Logger;

public class HomeState extends Controller implements AppState {

	public static boolean notpass() {
		if (session("id") == null) {
			return true;
		}
		return false;
	}

	public Result handle() {
		if (notpass()) {
			return ok(home.render("undefined", "-1"));
		}
		return ok(home.render(session("username"), session("id")));
	}

}
