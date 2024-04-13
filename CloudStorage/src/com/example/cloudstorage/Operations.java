package com.example.cloudstorage;

import android.util.Log;

public class Operations {
	private static final String TAG = "OperationClass";
	
	public class ShareFiles {
		private static final String TAG = "ShareClass";

		//���������� ������
		public void ChangeFiles() {
			Log.d(TAG, "����� ������");
			//����� ������
		}
		public void CloudSynch() {
			Log.d(TAG, "������������� � �������");
			//C������������ � �������
		}
		public void SharingFiles() {
			Log.d(TAG,"���������� ������");
			//���������� ������
		}
		
	}
	
	public void RefreshStorage() {
		Log.d(TAG, "���������� ���������");
		//���������� ���������
	}
	
	public class UploadFile {
		private static final String TAG = "UploadClass";
		
		//��������� �����
		public void ChangeFiles() {
			Log.d(TAG, "����� ������");
			//����� ������
		}
		public void CloudSynch() {
			Log.d(TAG, "������������� � �������");
			//C������������ � �������
		}
		public void FilesFormat() {
			Log.d(TAG, "��������� ������� ������");
			//��������� �������� ������
		}
		public void SaveToCloud() {
			Log.d(TAG, "���������� ������ � ������");
			//���������� ������ � ������
			RefreshStorage();
		}
	}
	
	public class UnloadFile {
		private static final String TAG = "UnloadClass";
		
		//��������� �����
		public void ChangeFiles() {
			Log.d(TAG, "����� ������");
			//����� ������
		}
		public void CloudSynch() {
			Log.d(TAG, "������������� � �������");
			//C������������ � �������
		}
		public void UnloadingFiles() {
			Log.d(TAG, "��������� �����");
			//��������� ����� 
			RefreshStorage();
		}
	
	}
	
	public class DeleteFiles {
		private static final String TAG = "DeleteClass";
		//�������� ������
		public void ChangeFiles() {
			Log.d(TAG, "����� ������");
			//����� ������
		}
		public void CloudSynch() {
			Log.d(TAG, "������������� � �������");
			//C������������ � �������
		}
		public void DeletingFiles() {
			Log.d(TAG, "��������� �����");
			//��������� ����� 
			RefreshStorage();
		}
	}

}
