package com.example.androidmixedlistactivity.database;

import com.example.androidmixedlistactivity.constants.AndroidTutorialsConstants;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler {

	private DatabaseOpenHelper databaseOpenHelper;
	private final Context context;
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

	public long createEntry(String name, String hotness) {
		ContentValues contentValues = new ContentValues();
		contentValues.put(AndroidTutorialsConstants.CONTACT_NAME, name);
		contentValues.put(AndroidTutorialsConstants.PHONE_NUMBER, hotness);
		return sqLiteDatabase.insert(AndroidTutorialsConstants.DATABASE_TABLE,
				null, contentValues);
	}

	public String getData() {
		String[] columns = new String[] { AndroidTutorialsConstants.KEY_ID,
				AndroidTutorialsConstants.CONTACT_NAME,
				AndroidTutorialsConstants.PHONE_NUMBER };
		Cursor cursor = sqLiteDatabase.query(
				AndroidTutorialsConstants.DATABASE_TABLE, columns, null, null,
				null, null, null);
		StringBuilder sb = new StringBuilder();
		int rowInt = cursor.getColumnIndex(AndroidTutorialsConstants.KEY_ID);
		int nameInt = cursor
				.getColumnIndex(AndroidTutorialsConstants.CONTACT_NAME);
		int phoneNumberInt = cursor
				.getColumnIndex(AndroidTutorialsConstants.PHONE_NUMBER);

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			sb.append(cursor.getString(rowInt)).append(" ")
					.append(cursor.getString(nameInt)).append(" ")
					.append(cursor.getString(phoneNumberInt)).append("\n");
		}
		return sb.toString();
	}

	public String getName(long rowId) throws SQLException {
		String[] columns = new String[] { AndroidTutorialsConstants.KEY_ID,
				AndroidTutorialsConstants.CONTACT_NAME,
				AndroidTutorialsConstants.PHONE_NUMBER };
		Cursor cursor = sqLiteDatabase.query(
				AndroidTutorialsConstants.DATABASE_TABLE, columns,
				AndroidTutorialsConstants.KEY_ID + "=" + rowId, null, null, null,
				null);
		if (cursor != null) {
			cursor.moveToFirst();
			String name = cursor.getString(1);
			return name;
		}
		return null;
	}

	public String getPhoneNumber(long rowId) throws SQLException {
		String[] columns = new String[] { AndroidTutorialsConstants.KEY_ID,
				AndroidTutorialsConstants.CONTACT_NAME,
				AndroidTutorialsConstants.PHONE_NUMBER };
		Cursor cursor = sqLiteDatabase.query(
				AndroidTutorialsConstants.DATABASE_TABLE, columns,
				AndroidTutorialsConstants.KEY_ID + "=" + rowId, null, null, null,
				null);
		if (cursor != null) {
			cursor.moveToFirst();
			String phoneNumber = cursor.getString(2);
			return phoneNumber;
		}
		return null;
	}

	public void updateEntry(long rowId, String name, String phoneNumber)
			throws SQLException {
		ContentValues contentValuesUpdate = new ContentValues();
		contentValuesUpdate.put(AndroidTutorialsConstants.CONTACT_NAME, name);
		contentValuesUpdate.put(AndroidTutorialsConstants.PHONE_NUMBER,
				phoneNumber);
		sqLiteDatabase.update(AndroidTutorialsConstants.DATABASE_TABLE,
				contentValuesUpdate, AndroidTutorialsConstants.KEY_ID + "="
						+ rowId, null);
	}

	public void deleteEntry(long lRow1) throws SQLException {
		sqLiteDatabase.delete(AndroidTutorialsConstants.DATABASE_TABLE,
				AndroidTutorialsConstants.KEY_ID + "=" + lRow1, null);
	}

	// Database OpenHelper Class
	private static class DatabaseOpenHelper extends SQLiteOpenHelper {

		public DatabaseOpenHelper(Context context) {
			super(context, AndroidTutorialsConstants.DATABASE_NAME, null,
					AndroidTutorialsConstants.DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + AndroidTutorialsConstants.DATABASE_TABLE
					+ " (" + AndroidTutorialsConstants.KEY_ID
					+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ AndroidTutorialsConstants.CONTACT_NAME + " TEXT NOT NULL, "
					+ AndroidTutorialsConstants.PHONE_NUMBER + " TEXT NOT NULL);");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS "
					+ AndroidTutorialsConstants.DATABASE_TABLE);
			onCreate(db);
		}
	}

}
