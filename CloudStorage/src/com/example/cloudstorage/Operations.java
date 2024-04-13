package com.example.cloudstorage;

import android.util.Log;

public class Operations {
	private static final String TAG = "OperationClass";
	
	public class ShareFiles {
		private static final String TAG = "ShareClass";

		//Поделиться файлом
		public void ChangeFiles() {
			Log.d(TAG, "Выбор файлов");
			//Выбор файлов
		}
		public void CloudSynch() {
			Log.d(TAG, "Синхронизация с облаком");
			//Cинхронизация с облаком
		}
		public void SharingFiles() {
			Log.d(TAG,"Поделиться файлом");
			//Поделиться файлом
		}
		
	}
	
	public void RefreshStorage() {
		Log.d(TAG, "Обновление хранилища");
		//Обновление хранилища
	}
	
	public class UploadFile {
		private static final String TAG = "UploadClass";
		
		//Загрузить файлы
		public void ChangeFiles() {
			Log.d(TAG, "Выбор файлов");
			//Выбор файлов
		}
		public void CloudSynch() {
			Log.d(TAG, "Синхронизация с облаком");
			//Cинхронизация с облаком
		}
		public void FilesFormat() {
			Log.d(TAG, "Установка формата файлов");
			//Установка форматов файлов
		}
		public void SaveToCloud() {
			Log.d(TAG, "Сохранение файлов в облако");
			//Сохранение файлов в облако
			RefreshStorage();
		}
	}
	
	public class UnloadFile {
		private static final String TAG = "UnloadClass";
		
		//Выгрузить файлы
		public void ChangeFiles() {
			Log.d(TAG, "Выбор файлов");
			//Выбор файлов
		}
		public void CloudSynch() {
			Log.d(TAG, "Синхронизация с облаком");
			//Cинхронизация с облаком
		}
		public void UnloadingFiles() {
			Log.d(TAG, "Выгрузить файлы");
			//Выгрузить файлы 
			RefreshStorage();
		}
	
	}
	
	public class DeleteFiles {
		private static final String TAG = "DeleteClass";
		//Удаление файлов
		public void ChangeFiles() {
			Log.d(TAG, "Выбор файлов");
			//Выбор файлов
		}
		public void CloudSynch() {
			Log.d(TAG, "Синхронизация с облаком");
			//Cинхронизация с облаком
		}
		public void DeletingFiles() {
			Log.d(TAG, "Выгрузить файлы");
			//Выгрузить файлы 
			RefreshStorage();
		}
	}

}
