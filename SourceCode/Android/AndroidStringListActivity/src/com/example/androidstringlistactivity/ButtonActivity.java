package com.example.androidstringlistactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class ButtonActivity extends Activity implements OnClickListener {

	private static int counter = 0;
	EditText result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        
        result = (EditText) findViewById(R.id.resultDisplay);
       
        // first way
        Button incButton = (Button) findViewById(R.id.incrementId);
        //second way
        Button decButton = (Button) findViewById(R.id.decrementId);
        decButton.setOnClickListener(this);
        
        //third way
        findViewById(R.id.multiplyId).setOnClickListener(this);
        findViewById(R.id.divideId).setOnClickListener(this);
        
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
		}
	}
} 