package com.example.cloudstorage;

import android.util.Log;

public class Archivation {
	private static final String TAG = "ArchivationClass";
	
	public void SaveArchive() {
		Log.d(TAG, "Сохранение архива в облако");
		//Сохранение архива в облако
	}
	
	public class CloudArchivationFiles {
		private static final String TAG = "CloudArchivationClass";
		//Архивация файлов в облако
		
		public void CompressionFiles() {
			Log.d(TAG, "Сжатие файлов в архив облака");
			//Сжатие файлов в архив облака
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "Синхронизация с облаком");
			//Синхронизация с облаком
			SaveArchive();
		}
	}
	
	public class Zip {
		private static final String TAG = "ZipClass";
		//Создание сжатого архива
		
		public void CompressionFiles() {
			Log.d(TAG, "Сжатие файлов");
			//Сжатие файлов в облако
		}
		public void ArchiveFormat() {
			Log.d(TAG, "Сжатие в определенный архив");
			//Сжатие в определенный архив
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "Синхронизация с облаком");
			//Синхронизация с облаком
			SaveArchive();
		}
		
	}
	public class UnZip {
		private static final String TAG = "UnZipClass";
		
		//Разархивирование файлов
		public void DecompressionFiles() {
			Log.d(TAG, "Разжатие файлов");
			//Разжатие файлов
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "Синхронизация с облаком");
			//Синхронизация с облаком
			SaveArchive();
		}
	}

}
