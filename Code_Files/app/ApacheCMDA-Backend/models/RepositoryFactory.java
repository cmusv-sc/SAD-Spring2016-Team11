package models;

/*
 * Created by Xiaoyu Wang on 4/17/2016
 */
public class RepositoryFactory extends AbstractFactory {
	@Override
	public Model getModel(String name) {
		return null;
	}

	@Override
	public Repository getRepository(String name) {
		return new Only4DemoRepository();
	}
}