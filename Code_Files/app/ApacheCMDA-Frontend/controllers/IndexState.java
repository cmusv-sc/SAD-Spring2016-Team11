package controllers;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import models.Workflow;
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



public class IndexState extends Controller implements AppState {
	
	public static boolean notpass() {
		if (session("id") == null) {
			return true;
		}
		return false;
	}
	
	public static List<Workflow> getTop3Workflow() {
        List<Workflow> result = new ArrayList<>();
        JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + "workflow/getTop3WorkFlow");
        System.out.println("response is " + response);
        for (JsonNode n: response) {
            Workflow cur = new Workflow(n);
            result.add(cur);
        }
        return result;
    }
	
	public Result handle() {
		if (notpass()) return redirect(routes.Application.login());
	    List<Workflow> top3Wf = getTop3Workflow();
	    return ok(home.render(session("username"), session("id")));
	}
	
}
