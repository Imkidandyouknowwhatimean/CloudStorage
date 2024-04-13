package com.example.cloudstorage;

import android.util.Log;

public class Archivation {
	private static final String TAG = "ArchivationClass";
	
	public void SaveArchive() {
		Log.d(TAG, "���������� ������ � ������");
		//���������� ������ � ������
	}
	
	public class CloudArchivationFiles {
		private static final String TAG = "CloudArchivationClass";
		//��������� ������ � ������
		
		public void CompressionFiles() {
			Log.d(TAG, "������ ������ � ����� ������");
			//������ ������ � ����� ������
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "������������� � �������");
			//������������� � �������
			SaveArchive();
		}
	}
	
	public class Zip {
		private static final String TAG = "ZipClass";
		//�������� ������� ������
		
		public void CompressionFiles() {
			Log.d(TAG, "������ ������");
			//������ ������ � ������
		}
		public void ArchiveFormat() {
			Log.d(TAG, "������ � ������������ �����");
			//������ � ������������ �����
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "������������� � �������");
			//������������� � �������
			SaveArchive();
		}
		
	}
	public class UnZip {
		private static final String TAG = "UnZipClass";
		
		//���������������� ������
		public void DecompressionFiles() {
			Log.d(TAG, "�������� ������");
			//�������� ������
		}
		
		public void SynchronizationCloud() {
			Log.d(TAG, "������������� � �������");
			//������������� � �������
			SaveArchive();
		}
	}

}
