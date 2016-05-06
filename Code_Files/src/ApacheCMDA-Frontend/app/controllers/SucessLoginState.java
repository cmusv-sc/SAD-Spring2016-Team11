package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import controllers.Application.Login;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class SucessLoginState extends Controller implements AppState {
	private JsonNode response;
	private  Form<Login> loginForm;
	
	public SucessLoginState(JsonNode response, Form<Login> loginForm) {
		this.response = response;
		this.loginForm = loginForm;
	}
	

	@Override
	public Result handle() {
		// TODO Auto-generated method stub
		flash("success", "Login successfully.");
        session().clear();
        session("id", response.get("id").toString());
        session("username", response.get("userName").textValue());
        session("email", loginForm.data().get("email"));
        return redirect("/timeline/0");
	}
	

}
