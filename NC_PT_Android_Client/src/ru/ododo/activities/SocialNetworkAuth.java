package ru.ododo.activities;


import nc_project_team.nc_prototypeinterface.R;
import android.app.Activity;
import android.os.Bundle;



public class SocialNetworkAuth extends Activity {

	//���� ��� �������
	private final static String NAME_OF_SOCIAL_NETWORK="ru.ododo.android.client.SOCIALNETWORK";
	//� ������� ����� ���.���� ������
	private static String ENTRY_BY_;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setTitle("������� ����");
		setContentView(R.layout.social_network_auth);
		//�������� � ���� �������� ��� ���.����
		ENTRY_BY_=getIntent().getExtras().getString(NAME_OF_SOCIAL_NETWORK);
		}
		

}
