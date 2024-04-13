package com.example.cloudstorage;

import android.util.Log;

public class Login {
	private static final String TAG = "LoginClass";
	String authorization_code;
	
	public String AuthGenerate(String authorization_code) {
		Log.d(TAG, "��������� ���� �����������");
		return authorization_code;
	}
	
	public class Registration {
		private static final String TAG = "RegistrationClass";
		//�����������
		
		public void NewPassword() {
			Log.d(TAG, "���� ������ ������");
			//���� ������ ������
		}
		public void NewLogin() {
			Log.d(TAG, "���� ������ ������");
			//���� ������ ������
		}
		public void SaveLogin() {
			Log.d(TAG, "���������� ������ � ������");
			//���������� ������ � ������ 
		}
	}
	
	public class Authorization {
		private static final String TAG = "AuthorizationClass";
		//����������� ������������
		
		public void EnterLogin() {
			Log.d(TAG, "���� ������");
			//���� ������
		}
		public void EnterPassword() {
			Log.d(TAG, "���� ������");
			//���� ������
		}
	}
	
	public class LoginDirector {
		private static final String TAG = "LoginDirectorClass";
		//����������� ���������
		public void EnterDirectorLogin() {
			Log.d(TAG, "���� ������ ���������");
			//���� ������ ���������
		}
		public void EnterDirectorPassword() {
			Log.d(TAG, "���� ������ ���������");
			//���� ������ ���������
		}
	}
	
	
	public class ForgotLogin {
		private static final String TAG = "ForgotLoginClass";
		
		Integer RecoverCode;
		String PhoneNumber;
		String Mail;
		
		public void ForgottenLogin() {
			RecoveringLogin();
			Log.d(TAG, "������ �����");
			//������ �����
		}
		
		public void ForgotPassword() {
			RecoveringPassword();
			Log.d(TAG, "������ ������");
			//������ ������
		}
		
		public Integer GeneratedCode(Integer RecoverCode) {
			Log.d(TAG, "��������� ����");
			//��������� ����
			return RecoverCode;
		}
		public String EnterPhoneNumber(String PhoneNumber) {
			Log.d(TAG, "���� ������ ��������");
			//���� ������ ��������
			return PhoneNumber;
		}
		
		public void RecoveringLogin() {
			EnterPhoneNumber(PhoneNumber);
			Log.d(TAG, "�������������� ������");
			//�������������� ������ 
		}
		
		public void RecoveringPassword() {
			EnterMail(Mail);
			SendMail();
		}

		private String EnterMail(String Mail) {
			GeneratedCode(RecoverCode);
			Log.d(TAG, "���� �����");
			//���� �����
			return Mail;
		}
		
		public void SendMail() {
			Log.d(TAG, "�������� ������");
			//�������� ������ �� �����
		}
	}
		

}
