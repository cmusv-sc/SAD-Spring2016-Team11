package models;

/*
 * Created by Xiaoyu Wang on 4/17/2016
 */
public abstract class AbstractFactory {
	public abstract Model getModel(String name);
	public abstract Repository getRepository(String name);
}