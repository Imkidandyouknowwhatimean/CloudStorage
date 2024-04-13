package com.example.cloudstorage;

import android.util.Log;

public class Storage {
	private static final String TAG = "StorageClass";
	
	public void SaveStorage() {
		Log.d(TAG, "Сохранение хранилища");
		//Сохранение файлов в базы данных
		DataCollection();
		RefreshStorage();
	}
	public void RefreshStorage() {
		Log.d(TAG, "Обновление хранилища");
		//Обновление хранилища
	}
	
	public void DataCollection() {
		Log.d(TAG, "Сбор данных из всех хранилищ");
		//Сбор данных из всех хранилищ
	}
	
	public class DataBase {
		private static final String TAG = "DataBaseClass";
		
		//База данных
		public void ImportDB() {
			Log.d(TAG, "Импортирование базы данных");
			//Импортирование базы данных
		}
		
		public void RefreshDataBase() {
			Log.d(TAG, "Обновление базы данных");
			//Обновление базы данных
		}
		
		public void DeleteDataBase() {
			Log.d(TAG, "Удаление базы данных");
			//Удаление базыданных
			RefreshDataBase();
		}
		
		public void EditDataBase() {
			Log.d(TAG, "Редактирование базы данных");
			//Редактирование базы данных
			RefreshDataBase();
		}
	}
	
	public class Cloud {
		private static final String TAG = "CloudClass";
		
		//Облачное хранилище
		public void RefreshCloud() {
			Log.d(TAG, "Обновление облачного хранилища");
			//Обновление базы данных
		}
		public void SaveToCloud() {
			Log.d(TAG, "Сохранение данных в облако");
			//Сохранение данных в облако
			RefreshCloud();
		}
	}
	

}
