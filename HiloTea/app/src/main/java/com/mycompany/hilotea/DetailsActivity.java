package com.mycompany.hilotea;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class DetailsActivity extends Activity
{
	
	TextView name, price, details;
	LinearLayout setImg, cart_btn;
	Intent intent = new Intent();
	
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
		
		final String complete = getIntent().getStringExtra("complete");
		String orders = getIntent().getStringExtra("orders");
		String key = getIntent().getStringExtra("key");
		String name_key = getIntent().getStringExtra("name");
		String price_key = getIntent().getStringExtra("price");
		String details_key = getIntent().getStringExtra("details");
		
		name = (TextView)findViewById(R.id.name);
		price= (TextView)findViewById(R.id.price);
		details = (TextView)findViewById(R.id.details);
		setImg = (LinearLayout)findViewById(R.id.img_order);
		cart_btn = (LinearLayout)findViewById(R.id.cart_btn);
		
		name.setText(name_key);
		price.setText("PHP "+price_key+".00");
		details.setText(details_key);
		
		imgDisplay(setImg, key);
		
		orders+=key+"-";
		addToCart(cart_btn, intent, orders, complete, name_key);
	}
	
	public void addToCart(LinearLayout selector, final Intent window, final String orders, final String complete, final String name_key){
		selector.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View view){
					Toast.makeText(getApplicationContext(),"The "+name_key+" has been added to cart",Toast.LENGTH_LONG).show();
					window.setClass(getApplicationContext(), HomeActivity.class);					
					window.putExtra("complete", complete);
					window.putExtra("orders", orders);
					startActivity(window);
				}
			});		
	}
	
	public void imgDisplay(LinearLayout img, String text){
		
		switch(text){
			case "m1":{
					img.setBackgroundResource(R.drawable.m1_img);
					break;
				}
			case "m2":{
					img.setBackgroundResource(R.drawable.m2_img);
					break;
				}
			case "m3":{
					img.setBackgroundResource(R.drawable.m3_img);
					break;
				}
			case "m4":{
					img.setBackgroundResource(R.drawable.m4_img);
					break;
				}
			case "m5":{
					img.setBackgroundResource(R.drawable.m5_img);
					break;
				}
			case "fr1":{
				img.setBackgroundResource(R.drawable.fr1_img);
					break;
				}
			case "fr2":{
					img.setBackgroundResource(R.drawable.fr2_img);
					break;
				}
			case "fr3":{
					img.setBackgroundResource(R.drawable.fr3_img);
					break;
				}
			case "fr4":{
					img.setBackgroundResource(R.drawable.fr4_img);
					break;
				}
			case "fr5":{
					img.setBackgroundResource(R.drawable.fr5_img);
					break;
				}
			case "b1":{
					img.setBackgroundResource(R.drawable.b1_img);
					break;
				}
			case "b2":{
					img.setBackgroundResource(R.drawable.b2_img);
					break;
				}
			case "b3":{
					img.setBackgroundResource(R.drawable.b3_img);
					break;
				}
			case "b4":{
					img.setBackgroundResource(R.drawable.b4_img);
					break;
				}
			case "b5":{
					img.setBackgroundResource(R.drawable.b5_img);
					break;
				}
			case "ff1":{
					img.setBackgroundResource(R.drawable.ff1_img);
					break;
				}
			case "ff2":{
					img.setBackgroundResource(R.drawable.ff2_img);
					break;
				}
			case "ff3":{
					img.setBackgroundResource(R.drawable.ff3_img);
					break;
				}
			case "ff4":{
					img.setBackgroundResource(R.drawable.ff4_img);
					break;
				}
			case "ff5":{
					img.setBackgroundResource(R.drawable.ff5_img);
					break;
				}
			case "c1":{
					img.setBackgroundResource(R.drawable.c1_img);
					break;
				}
			case "c2":{
					img.setBackgroundResource(R.drawable.c2_img);
					break;
				}
			case "c3":{
					img.setBackgroundResource(R.drawable.c3_img);
					break;
				}
			case "c4":{
					img.setBackgroundResource(R.drawable.c4_img);
					break;
				}
			case "c5":{
					img.setBackgroundResource(R.drawable.c5_img);
					break;
				}
		}
		
	}
}
