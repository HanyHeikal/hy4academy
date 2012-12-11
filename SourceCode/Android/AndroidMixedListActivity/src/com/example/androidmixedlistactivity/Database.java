package com.example.androidmixedlistactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidmixedlistactivity.database.DatabaseHandler;

public class Database extends Activity implements OnClickListener {

	EditText nameEditText;
	EditText phoneEditText;
	TextView dbListTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.database);
		nameEditText = (EditText) findViewById(R.id.nameId);
		phoneEditText = (EditText) findViewById(R.id.phoneNumberId);
		dbListTextView = (TextView) findViewById(R.id.dbListId);
		findViewById(R.id.addContactId).setOnClickListener(this);
		findViewById(R.id.contactListId).setOnClickListener(this);
		findViewById(R.id.firstContactId).setOnClickListener(this);
		findViewById(R.id.deleteContactId).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		DatabaseHandler databaseHandler = new DatabaseHandler(this);
		switch (v.getId()) {
		case R.id.addContactId:
			try {
				String name = nameEditText.getText().toString();
				String phoneNumber = phoneEditText.getText().toString();
				databaseHandler.open();
				databaseHandler.createEntry(name, phoneNumber);
				databaseHandler.close();
				Toast.makeText(
						this,
						nameEditText.getText().toString()
								+ " has been inserted successfully.",
						Toast.LENGTH_LONG).show();
			} catch (Exception e) {
				String error = e.toString();
				Toast.makeText(this, error, Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.contactListId:
			databaseHandler.open();
			String contacts = databaseHandler.getData();
			databaseHandler.close();
			Toast.makeText(this, contacts + " has been retrieved successfully.",
					Toast.LENGTH_LONG).show();
			dbListTextView.setText(contacts);
			break;
		case R.id.firstContactId:
			try {
				databaseHandler.open();
				String phoneNumber = databaseHandler.getPhoneNumber(1);
				databaseHandler.close();
				Toast.makeText(this, "First Number is: " + phoneNumber,
						Toast.LENGTH_LONG).show();
				dbListTextView.setText(phoneNumber);
			} catch (Exception e) {
				Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.deleteContactId:
			try {
				databaseHandler.open();
				databaseHandler.deleteEntry(1);
				databaseHandler.close();
				Toast.makeText(this, "First Number is deleted.",
						Toast.LENGTH_LONG);
			} catch (Exception e) {
				Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
			}

			break;
		}

	}
}
