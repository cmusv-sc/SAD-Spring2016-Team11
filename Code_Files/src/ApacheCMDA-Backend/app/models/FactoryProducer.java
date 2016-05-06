package models;

/*
 * Created by Xiaoyu Wang on 4/17/2016
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("Model"))
			return new ModelFactory();
		else if (factoryType.equalsIgnoreCase("Repository"))
			return new RepositoryFactory();
		return null;
	}
}