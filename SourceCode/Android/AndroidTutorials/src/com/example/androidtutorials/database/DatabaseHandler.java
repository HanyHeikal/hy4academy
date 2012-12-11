package com.example.androidtutorials.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebChromeClient.CustomViewCallback;

import com.example.androidtutorials.constants.AndroidTutorialsConstants;

public class DatabaseHandler {

	private final Context context;
	private DatabaseOpenHelper databaseOpenHelper;
	private SQLiteDatabase sqLiteDatabase;
	
	public DatabaseHandler(Context context) {
		this.context = context;
	}
	
	public DatabaseHandler open() throws SQLException {
		databaseOpenHelper = new DatabaseOpenHelper(context);
		sqLiteDatabase = databaseOpenHelper.getWritableDatabase();
		return this;
	}
	
	public void close() {
		databaseOpenHelper.close();
	}
	
	public long createEntry(String name, String phoneNumber) {
		ContentValues contentValues = new ContentValues();
		contentValues.put(AndroidTutorialsConstants.CONTACT_NAME, name);
		contentValues.put(AndroidTutorialsConstants.PHONE_NUMBER, phoneNumber);
		return sqLiteDatabase.insert(AndroidTutorialsConstants.DATABASE_TABLE, null, contentValues);
	}
	
	public String retrieveData() {
		String[] columns = new String[] {
			AndroidTutorialsConstants.KEY_ID,
			AndroidTutorialsConstants.CONTACT_NAME,
			AndroidTutorialsConstants.PHONE_NUMBER
		};
		Cursor cursor = sqLiteDatabase.query(AndroidTutorialsConstants.DATABASE_TABLE, columns, null, null, null, null, null);
		int rowInt = cursor.getColumnIndex(AndroidTutorialsConstants.KEY_ID);
		int contactNameInt = cursor.getColumnIndex(AndroidTutorialsConstants.CONTACT_NAME);
		int phoneNumberInt = cursor.getColumnIndex(AndroidTutorialsConstants.PHONE_NUMBER);
		
		StringBuilder sb = new StringBuilder();
		for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			sb.append(cursor.getString(rowInt)).append(" ")
			.append(cursor.getString(contactNameInt)).append(" ")
			.append(cursor.getString(phoneNumberInt)).append("\n");
		}
		return sb.toString();
	}
	
	public String getName(long rowId) {
		String[] columns = new String[] {
				AndroidTutorialsConstants.KEY_ID,
				AndroidTutorialsConstants.CONTACT_NAME,
				AndroidTutorialsConstants.PHONE_NUMBER
			};
		Cursor cursor = sqLiteDatabase.query(AndroidTutorialsConstants.DATABASE_TABLE, columns, AndroidTutorialsConstants.KEY_ID+ "="+rowId
				, null, null, null, null);
		if (null != cursor) {
			cursor.moveToFirst();
			String name = cursor.getString(1);
			return name;
		}
		return null;
	}
	
	public String getPhoneNumber(long rowId) {
		String[] columns = new String[] {
				AndroidTutorialsConstants.KEY_ID,
				AndroidTutorialsConstants.CONTACT_NAME,
				AndroidTutorialsConstants.PHONE_NUMBER
			};
		Cursor cursor = sqLiteDatabase.query(AndroidTutorialsConstants.DATABASE_TABLE, columns, AndroidTutorialsConstants.KEY_ID+ "="+rowId
				, null, null, null, null);
		if (null != cursor) {
			cursor.moveToFirst();
			String phone = cursor.getString(2);
			return phone;
		}
		return null;
	}
	
	public void deleteEntry(long rowId) {
		sqLiteDatabase.delete(AndroidTutorialsConstants.DATABASE_TABLE, AndroidTutorialsConstants.KEY_ID + "=" + rowId, null);
	}
	
	private static class DatabaseOpenHelper extends SQLiteOpenHelper {

		public DatabaseOpenHelper(Context context) {
			super(context, AndroidTutorialsConstants.DATABASE_NAME, null, 
						AndroidTutorialsConstants.DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + AndroidTutorialsConstants.DATABASE_TABLE
					+ " (" + AndroidTutorialsConstants.KEY_ID 
					+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ AndroidTutorialsConstants.CONTACT_NAME + " TEXT NOT NULL, "
					+ AndroidTutorialsConstants.PHONE_NUMBER + " TEXT NOT NULL);");
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + AndroidTutorialsConstants.DATABASE_TABLE);
			onCreate(db);
			
		}
		
	}

}
