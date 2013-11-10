package ru.ododo.logic.systemstate;

import ru.ododo.logic.SocNetAbstractFactory.AbstractFactory;
public class SysSinglton {
	
	private static SysSinglton singlton;
	
	private String userId=null;
	private String userFullName=null;
	
	private SysSinglton(){
		
	}
	static void initSinglton(){
		if(singlton==null){
			singlton=new SysSinglton();
		}
	}
	public static SysSinglton getInstance(){
		return singlton;
	}
	
	public void createUser(AbstractFactory factory){
		
		userId=factory.create().getUserId();
		userFullName=factory.create().getUserFullName();
	}
	public String getUserId() {
		return userId;
	}
	public String getUserFullName() {
		return userFullName;
	}
}
