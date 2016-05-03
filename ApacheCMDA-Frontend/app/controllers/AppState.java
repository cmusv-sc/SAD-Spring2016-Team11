package controllers;
import play.api.mvc.Request;
import play.mvc.Controller;
import play.mvc.Result;

public interface AppState {
	public abstract Result handle();
}
