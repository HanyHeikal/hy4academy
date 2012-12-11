package com.example.androidtutorials;

import com.example.androidtutorials.database.DatabaseHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
		// TODO Auto-generated method stub
		DatabaseHandler databaseHandler = new DatabaseHandler(this);
		switch(v.getId()) {
		case R.id.addContactId:
			String name = nameEditText.getText().toString();
			String phoneNumber = phoneEditText.getText().toString();
			databaseHandler.open();
			databaseHandler.createEntry(name, phoneNumber);
			databaseHandler.close();
			Toast.makeText(this, name + " has been added to database", Toast.LENGTH_LONG).show();
			break;
		case R.id.contactListId:
			databaseHandler.open();
			String contacts = databaseHandler.retrieveData();
			databaseHandler.close();
			dbListTextView.setText(contacts);
			Toast.makeText(this, contacts + " has been retrieved from database", Toast.LENGTH_LONG).show();
			break;
		case R.id.firstContactId:
			databaseHandler.open();
			String n = databaseHandler.getName(1);
			String p = databaseHandler.getPhoneNumber(1);
			databaseHandler.close();
			Toast.makeText(this, "The phone number for " + n+ " is " + p, Toast.LENGTH_LONG).show();
			break;
		case R.id.deleteContactId:
			databaseHandler.open();
			databaseHandler.deleteEntry(2);
			databaseHandler.close();
			Toast.makeText(this, "Deletion has been executed.", Toast.LENGTH_LONG).show();
			break;
			
		}
		
	}

}
