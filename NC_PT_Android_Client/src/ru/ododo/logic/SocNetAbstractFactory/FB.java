package ru.ododo.logic.SocNetAbstractFactory;

public class FB extends AbstractFactory{

	@Override
	public AbstractProductSocNetConnect create() {
		// TODO Auto-generated method stub
		return new FBConnect();
	}

}
