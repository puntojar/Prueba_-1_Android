package com.mayistik.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView1;
	private TextView textView2;
	private EditText editText1;
	private EditText editText2;
	private RadioButton radio0;
	private RadioButton radio1;
	private RadioButton radio2;
	private RadioButton	radio3;
	private Button calcular;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText1 = (EditText)findViewById(R.id.editText1);
		editText2 = (EditText)findViewById(R.id.editText2);
		textView1 = (TextView)findViewById(R.id.textView1);
		textView2 = (TextView)findViewById(R.id.textView2);
		radio0 = (RadioButton)findViewById(R.id.radio0);
		radio1 = (RadioButton)findViewById(R.id.radio1);
		radio2 = (RadioButton)findViewById(R.id.radio2);
		radio3 = (RadioButton)findViewById(R.id.radio3);
		calcular = (Button)findViewById(R.id.calcular);
		
	}
}
