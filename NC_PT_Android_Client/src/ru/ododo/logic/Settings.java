package ru.ododo.logic;

//����� � �����������
class Settings {
	public final static String VK_AUTH_URL="https://oauth.vk.com/authorize?";
	//������������� ����������
	public final static String VK_CLINT_ID="client_id= &";
	//�������� �� ����, ��� standalone ���������� �������� ����� ��������
	public final static String VK_REDIRECT_URL="edirect_uri=https://oauth.vk.com/blank.htm&";
	//��������� ������� ����������
	public final static String VK_SCOPE="scope=offline&";
	//��������� ��� ����������� �������� 
	public final static String VK_DISPLAY="display=mobile&";
	//��� ������, ������� �� ������ ��������
	public final static String VK_RESPONSE_TYPE="response_type = token";
}
