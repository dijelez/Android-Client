package ru.ododo.activities;


import ru.ododo.logic.EnterBySocialNetwork;
import nc_project_team.nc_prototypeinterface.R;
import nc_project_team.nc_prototypeinterface.R.id;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;



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
		
		//��������� �����, ������� ��������� ��� � ���.�����
		//EnterBySocialNetwork.enterInSystem((WebView)findViewById(id.webBr_for_social), ENTRY_BY_);
		}
		

}
