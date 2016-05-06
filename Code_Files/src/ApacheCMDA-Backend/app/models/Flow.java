package models;
import java.util.*;

/*
 * Created by Xiaoyu Wang on 4/25/2016
 */
public abstract class Flow {
	
	public abstract void setWfContributors(List<User> contributor);
	public abstract void setWfRelated(List<Workflow> related);
	public abstract void setUserName(String username);
	public abstract void setStatus(String status);
	public abstract void setUser(User user);

	public void setInformation(List<User> contributor, List<Workflow> related, 
		String username,String status, User user) {

		setWfContributors(contributor);
		setWfRelated(related);
		setUserName(username);
		setStatus(status);
		setUser(user);

	}
		

}