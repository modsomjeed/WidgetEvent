package com.example.widgetevent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	EditText editText1;
	EditText editText2;
	
	CheckBox checkBox1;
	CheckBox checkBox2;
	
	RadioButton radioButton1;
	RadioButton radioButton2;
	
	RatingBar ratingBar1;
	
	RadioGroup radioGroup1;
	
	Button button1;
	Button button2;
	Button button3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		
		radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
		radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
		
		ratingBar1 = (RatingBar) findViewById(R.id.ratingBar1);
		
		radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()) {
        case R.id.button1:
          // it was the first button
        	Toast.makeText(this, 
        			editText1.getText() +","+
        			editText2.getText() +","+
        			checkBox1.isChecked() +","+
        			checkBox2.isChecked() +","+
        			radioButton1.isChecked() +","+
        			radioButton2.isChecked() +","+
        			ratingBar1.getRating() +","+
        			radioGroup1.getCheckedRadioButtonId()
        			, Toast.LENGTH_LONG).show();
        	
          break;
        case R.id.button2:
          // it was the second button
        	editText1.setText("");
        	editText2.setText("");
        	
        	checkBox1.setChecked(false);
        	checkBox1.setChecked(false);
        	
        	radioButton1.setChecked(false);
        	radioButton2.setChecked(false);
        	
        	ratingBar1.setRating(0.0f);
        	
          break;
        case R.id.button3:
            // it was the second button
            break;

      }
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
