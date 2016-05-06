package models;

/*
 * Created by Xiaoyu Wang on 4/17/2016
 */
public class ModelFactory extends AbstractFactory {

	@Override 
	public Model getModel(String name) {
		switch(name) {
			case "ClimateService": 
			    return new ClimateService();
			    
			case "User":
			    return new User();

			default:
			    return null;
		}		
	}

	@Override
	public Repository getRepository(String name) {
		return null;
	}

}