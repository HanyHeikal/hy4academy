package com.example.androidmixedlistactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonActivity extends Activity implements OnClickListener {

	private static int counter = 0;
	EditText result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        
        Bundle bundle = getIntent().getExtras();
        String date = bundle.getString("date");
        
        TextView dateTextView = (TextView) findViewById(R.id.dateId);
        dateTextView.setText(date);
        
        result = (EditText) findViewById(R.id.resultDisplay);
       
        // first way
        Button incButton = (Button) findViewById(R.id.incrementId);
        //second way
        Button decButton = (Button) findViewById(R.id.decrementId);
        decButton.setOnClickListener(this);
        
        //third way
        findViewById(R.id.multiplyId).setOnClickListener(this);
        findViewById(R.id.divideId).setOnClickListener(this);
        findViewById(R.id.sendResultId).setOnClickListener(this);
        
        incButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				++counter;
				result.setText("Result is " + counter);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_button, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.decrementId:
			--counter;
			result.setText("Result is " + counter);
			break;
		case R.id.multiplyId:
			counter = counter * 2;
			result.setText("Result is " + counter);
			break;
		case R.id.divideId:
			counter = counter / 2;
			result.setText("Result is " + counter);
			break;
		case R.id.sendResultId:
			Intent resultIntent = new Intent();
			Bundle resultBundle = new Bundle();
			String counterString = String.valueOf(counter);
			resultBundle.putString("answer", counterString);
			resultIntent.putExtras(resultBundle);
			setResult(RESULT_OK, resultIntent);
			finish();
			break;
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		System.out.println("onPause() method exectued.");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		System.out.println("onStop() method executed.");
	}
	
	
} 