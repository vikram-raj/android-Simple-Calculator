package com.Vikram.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity {
	
	EditText result;
	int i;
	double temp;
	double num;
	public String str =""; 
	Character operation = 'o'; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		result = (EditText)findViewById(R.id.result);
	}
						
	private void insert(int j) {
		str = str+Integer.toString(j);
		num = Integer.valueOf(str).intValue();
		result.setText(str);
		
	}
	
	private void calculate(){
		if(operation == '+')
			num = temp + num;
		else if(operation == '-')
			num = temp - num;
		else if(operation == '/') {
				num = temp/num;
		}
		
		else if(operation == '*')
			num = temp * num;
		
		else if(operation == '^')
			num = Math.pow(temp, num);
		
		result.setText("" +num);
	}

	private void clr() {
		str = "";
		operation = 'o';
		num = 0;
		temp = 0;
		result.setText("");
	}
	
	private void prfrm() {
		str ="";
		temp = num;
	}
	
	public void btn1Click(View v){
		insert(1);
	}
	
	public void btn2Click(View v){
		insert(2);
	}
	
	public void btn3Click(View v){
		insert(3);
	}
	
	public void btn4Click(View v){
		insert(4);
	}
	
	public void btn5Click(View v){
		insert(5);
	}
	
	public void btn6Click(View v){
		insert(6);
	}
	
	public void btn7Click(View v){
		insert(7);
	}
	
	public void btn8Click(View v){
		insert(8);
	}
	
	public void btn9Click(View v){
		insert(9);
	}
	
	public void btn0Click(View v){
		insert(0);
	}
	
	public void btnplusClick(View v){
		prfrm();
		operation = '+';
	}
	
	public void btnminusClick(View v){
		prfrm();
		operation = '-';
	}
	
	public void btndivideClick(View v){
		prfrm();
		operation = '/';
	}
	
	public void btnmultiClick(View v){
		prfrm();
		operation = '*';
	}
	
	public void btnsqrtClick(View v){
		num = Math.sqrt(num);
		result.setText("" +num);
	}
	
	public void btnsqrClick(View v){
		prfrm();
		operation = '^';
	}
	
	public void btnequalClick(View v){
		calculate();
	}
	
	public void btnclearClick(View v){
		clr();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_calculator, menu);
		return true;
	}

}
