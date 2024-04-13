package com.example.cloudstorage;

import android.util.Log;

public class Login {
	private static final String TAG = "LoginClass";
	String authorization_code;
	
	public String AuthGenerate(String authorization_code) {
		Log.d(TAG, "Генерация кода авторизации");
		return authorization_code;
	}
	
	public class Registration {
		private static final String TAG = "RegistrationClass";
		//Регистрация
		
		public void NewPassword() {
			Log.d(TAG, "Ввод нового пароля");
			//Ввод нового пароля
		}
		public void NewLogin() {
			Log.d(TAG, "Ввод нового логина");
			//Ввод нового логина
		}
		public void SaveLogin() {
			Log.d(TAG, "Сохранение логина и пароля");
			//Сохранение логина и пароля 
		}
	}
	
	public class Authorization {
		private static final String TAG = "AuthorizationClass";
		//Авторизация пользователя
		
		public void EnterLogin() {
			Log.d(TAG, "Ввод логина");
			//Ввод логина
		}
		public void EnterPassword() {
			Log.d(TAG, "Ввод пароля");
			//Ввод пароля
		}
	}
	
	public class LoginDirector {
		private static final String TAG = "LoginDirectorClass";
		//Авторизация директора
		public void EnterDirectorLogin() {
			Log.d(TAG, "Ввод логина директора");
			//Ввод логина директора
		}
		public void EnterDirectorPassword() {
			Log.d(TAG, "Ввод пароля директора");
			//Ввод пароля директора
		}
	}
	
	
	public class ForgotLogin {
		private static final String TAG = "ForgotLoginClass";
		
		Integer RecoverCode;
		String PhoneNumber;
		String Mail;
		
		public void ForgottenLogin() {
			RecoveringLogin();
			Log.d(TAG, "Забыли логин");
			//Забыли логин
		}
		
		public void ForgotPassword() {
			RecoveringPassword();
			Log.d(TAG, "Забыли пароль");
			//Забыли пароль
		}
		
		public Integer GeneratedCode(Integer RecoverCode) {
			Log.d(TAG, "Генерация кода");
			//Генерация кода
			return RecoverCode;
		}
		public String EnterPhoneNumber(String PhoneNumber) {
			Log.d(TAG, "Ввод номера телефона");
			//Ввод номера телефона
			return PhoneNumber;
		}
		
		public void RecoveringLogin() {
			EnterPhoneNumber(PhoneNumber);
			Log.d(TAG, "Восстановление пароля");
			//Восстановление пароля 
		}
		
		public void RecoveringPassword() {
			EnterMail(Mail);
			SendMail();
		}

		private String EnterMail(String Mail) {
			GeneratedCode(RecoverCode);
			Log.d(TAG, "Ввод почты");
			//Ввод почты
			return Mail;
		}
		
		public void SendMail() {
			Log.d(TAG, "Отправка письма");
			//Отправка письма на почту
		}
	}
		

}
