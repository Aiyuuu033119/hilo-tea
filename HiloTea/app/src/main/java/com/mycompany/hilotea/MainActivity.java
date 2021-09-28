package com.mycompany.hilotea;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	LinearLayout start;
	Intent newWindow = new Intent();
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toast.makeText(getApplicationContext(),"Welcome to Hilo Tea!",Toast.LENGTH_LONG).show();
		start = (LinearLayout)findViewById(R.id.start_btn);
		
		start.setOnClickListener(new OnClickListener(){ 
			@Override 
			public void onClick(View view){ 
				newWindow.setClass(getApplicationContext(), HomeActivity.class);
				newWindow.putExtra("great", "Have fun Hilo Tears!");
				startActivity(newWindow);
			} 
		}); 
    }
}
