package com.example.eventtransfertest03;

import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.app.Activity;

public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MyButton myButton=(MyButton) this.findViewById(R.id.myBtn);
		myButton.setOnTouchListener(new OnTouchListener(){
			public boolean onTouch(View v,MotionEvent event){
				System.out.println("监听器中的触摸事件触发了!");
				return false;
			}
		}); 
	}
     
	public boolean onTouchEvent(MotionEvent event){
		System.out.println("MyButton中触摸事件触发了!");
		return false;
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
