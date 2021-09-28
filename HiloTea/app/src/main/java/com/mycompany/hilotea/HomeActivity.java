package com.mycompany.hilotea;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.view.View.*;
import java.util.*;
import android.content.*;
import android.animation.*;
import java.io.*;

public class HomeActivity extends Activity
{
	LinearLayout milktea_tabs, frape_tabs, burger_tabs, fries_tabs, chicken_tabs;
	LinearLayout milktea_layout, frape_layout, burger_layout, fries_layout, chicken_layout;

	LinearLayout m1, m2, m3, m4, m5;	
	LinearLayout fr1, fr2, fr3, fr4, fr5;
	LinearLayout b1, b2, b3, b4, b5;
	LinearLayout ff1, ff2, ff3, ff4, ff5;
	LinearLayout c1, c2, c3, c4, c5;

	public String orders = "";
	public String place_orders = "";
	
	public Intent window = new Intent();

	LinearLayout cartIcon, orderIcon;

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
		
		String great = getIntent().getStringExtra("great");
		if(great!=null){
			Toast.makeText(getApplicationContext(),great,Toast.LENGTH_LONG).show();
		}
		
		String getOrders = getIntent().getStringExtra("orders");
		cartAdded(getOrders);

		String complete = getIntent().getStringExtra("complete");
		orderComplete(complete);


		//initilize tabs btn
		milktea_tabs = (LinearLayout)findViewById(R.id.milktea_tabs);
		frape_tabs = (LinearLayout)findViewById(R.id.frape_tabs);
		burger_tabs = (LinearLayout)findViewById(R.id.burger_tabs);
		fries_tabs = (LinearLayout)findViewById(R.id.fries_tabs);
		chicken_tabs = (LinearLayout)findViewById(R.id.chicken_tabs);

		//initilize layout tabs
		milktea_layout = (LinearLayout)findViewById(R.id.milktea_layout);
		frape_layout = (LinearLayout)findViewById(R.id.frape_layout);
		burger_layout = (LinearLayout)findViewById(R.id.burger_layout);
		fries_layout = (LinearLayout)findViewById(R.id.fries_layout);
		chicken_layout = (LinearLayout)findViewById(R.id.chicken_layout);

		//initilize milktea
		m1 = (LinearLayout)findViewById(R.id.m1);
		m2= (LinearLayout)findViewById(R.id.m2);
		m3= (LinearLayout)findViewById(R.id.m3);
		m4= (LinearLayout)findViewById(R.id.m4);
		m5= (LinearLayout)findViewById(R.id.m5);

		//initilize milktea
		fr1 = (LinearLayout)findViewById(R.id.fr1);
		fr2= (LinearLayout)findViewById(R.id.fr2);
		fr3= (LinearLayout)findViewById(R.id.fr3);
		fr4= (LinearLayout)findViewById(R.id.fr4);
		fr5= (LinearLayout)findViewById(R.id.fr5);

		//initilize milktea
		b1 = (LinearLayout)findViewById(R.id.b1);
		b2= (LinearLayout)findViewById(R.id.b2);
		b3= (LinearLayout)findViewById(R.id.b3);
		b4= (LinearLayout)findViewById(R.id.b4);
		b5= (LinearLayout)findViewById(R.id.b5);

		//initilize milktea
		ff1 = (LinearLayout)findViewById(R.id.ff1);
		ff2= (LinearLayout)findViewById(R.id.ff2);
		ff3= (LinearLayout)findViewById(R.id.ff3);
		ff4= (LinearLayout)findViewById(R.id.ff4);
		ff5= (LinearLayout)findViewById(R.id.ff5);

		//initilize milktea
		c1 = (LinearLayout)findViewById(R.id.c1);
		c2= (LinearLayout)findViewById(R.id.c2);
		c3= (LinearLayout)findViewById(R.id.c3);
		c4= (LinearLayout)findViewById(R.id.c4);
		c5= (LinearLayout)findViewById(R.id.c5);

		showPanel(milktea_layout);
		hidePanel(frape_layout);
		hidePanel(burger_layout);
		hidePanel(fries_layout);
		hidePanel(chicken_layout);

		tabClick(milktea_tabs, milktea_layout, frape_layout, burger_layout, fries_layout, chicken_layout);
		tabClick(frape_tabs, frape_layout, milktea_layout, burger_layout, fries_layout, chicken_layout);
		tabClick(burger_tabs, burger_layout, frape_layout, milktea_layout, fries_layout, chicken_layout);
		tabClick(fries_tabs, fries_layout, frape_layout, burger_layout, milktea_layout, chicken_layout);
		tabClick(chicken_tabs, chicken_layout, frape_layout, burger_layout, fries_layout, milktea_layout);

		orderClick(m1, "m1");
		orderClick(m2, "m2");
		orderClick(m3, "m3");
		orderClick(m4, "m4");
		orderClick(m5, "m5");

		orderClick(fr1, "fr1");
		orderClick(fr2, "fr2");
		orderClick(fr3, "fr3");
		orderClick(fr4, "fr4");
		orderClick(fr5, "fr5");

		orderClick(b1, "b1");
		orderClick(b2, "b2");
		orderClick(b3, "b3");
		orderClick(b4, "b4");
		orderClick(b5, "b5");

		orderClick(ff1, "ff1");
		orderClick(ff2, "ff2");
		orderClick(ff3, "ff3");
		orderClick(ff4, "ff4");
		orderClick(ff5, "ff5");

		orderClick(c1, "c1");
		orderClick(c2, "c2");
		orderClick(c3, "c3");
		orderClick(c4, "c4");
		orderClick(c5, "c5");

		cartIcon = (LinearLayout)findViewById(R.id.cart_icon);

		cartIcon.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view){
				window.setClass(getApplicationContext(), CartActivity.class);
				window.putExtra("complete", place_orders);
				window.putExtra("orders", orders);
				startActivity(window);	
			}
		});
		
		orderIcon = (LinearLayout)findViewById(R.id.box_icon);
		
		orderIcon.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view){
				window.setClass(getApplicationContext(), OrderActivity.class);
				window.putExtra("complete", place_orders);
				startActivity(window);	
			}
		});
	}
	
	public void orderComplete(final String placeOrder){
		if(placeOrder!=null){
			place_orders = placeOrder;
		}
	}
	
	public void cartAdded(final String getOrders){
		if(getOrders!=null){
			orders = getOrders;
		}
	}

	public void orderClick(LinearLayout active, final String text){
		active.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View view){
					String name = "";
					String price = ""; 
					String details = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent euismod ipsum lectus, non vestibulum urna ultrices ut.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent euismod ipsum lectus, non vestibulum urna ultrices ut.";

					switch(text){
						case "m1":{
								name = "Yellow Pearl Milktea";
								price = "85";
								break;
							}
						case "m2":{
								name = "Chocolate Milktea";
								price = "85";
								break;
							}
						case "m3":{
								name = "Taho Milktea";
								price = "85";
								break;
							}
						case "m4":{
								name = "Original Milktea";
								price = "75";
								break;
							}
						case "m5":{
								name = "Mango Graham Milktea";
								price = "95";
								break;
							}
						case "fr1":{
								name = "Classic Coffee Frappe";
								price = "55";
								break;
							}
						case "fr2":{
								name = "Gingerbread Frappe";
								price = "65";
								break;
							}
						case "fr3":{
								name = "Epriso Chip Frappe";
								price = "65";
								break;
							}
						case "fr4":{
								name = "Shamrock Shake";
								price = "60";
								break;
							}
						case "fr5":{
								name = "Straberry Shake";
								price = "70";
								break;
							}
						case "b1":{
								name = "Classic Burger";
								price = "45";
								break;
							}
						case "b2":{
								name = "Egg Burger";
								price = "55";
								break;
							}
						case "b3":{
								name = "Cheese Burger";
								price = "55";
								break;
							}
						case "b4":{
								name = "Chicken Burger";
								price = "60";
								break;
							}
						case "b5":{
								name = "Double Burger";
								price = "80";
								break;
							}
						case "ff1":{
								name = "Classic French Fries";
								price = "35";
								break;
							}
						case "ff2":{
								name = "Cheese French Fries";
								price = "35";
								break;
							}
						case "ff3":{
								name = "Barbeque French Fries";
								price = "35";
								break;
							}
						case "ff4":{
								name = "Cream n Sour French Fries";
								price = "35";
								break;
							}
						case "ff5":{
								name = "Chili Barbeque French Fries";
								price = "35";
								break;
							}
						case "c1":{
								name = "Parmession Chicken";
								price = "70";
								break;
							}
						case "c2":{
								name = "Hot n Spicy Chicken";
								price = "70";
								break;
							}
						case "c3":{
								name = "Cheesy Chicken";
								price = "70";
								break;
							}
						case "c4":{
								name = "Chicken Barbeque";
								price = "70";
								break;
							}
						case "c5":{
								name = "Chicken Teriyaki";
								price = "70";
								break;
							}
					}

					window.setClass(getApplicationContext(), DetailsActivity.class);
					window.putExtra("complete", place_orders);
					window.putExtra("orders", orders);
					window.putExtra("key", text);
					window.putExtra("name", name);
					window.putExtra("price", price);
					window.putExtra("details", details);
					startActivity(window);

				}
			});
	}

	public void tabClick(LinearLayout active, final LinearLayout l1, final LinearLayout l2, final LinearLayout l3, final LinearLayout l4, final LinearLayout l5){
		active.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View view){
					showPanel(l1);
					hidePanel(l2);
					hidePanel(l3);
					hidePanel(l4);
					hidePanel(l5);
				}
			});
	}

	public void hidePanel(LinearLayout hide){
		hide.setVisibility(View.GONE);

		RelativeLayout.LayoutParams parameter =  (RelativeLayout.LayoutParams) hide.getLayoutParams();
		parameter.setMargins(600, 0, 0, 0);
		hide.setLayoutParams(parameter);

	}

	public void showPanel(LinearLayout show){
		show.setVisibility(View.VISIBLE);
		RelativeLayout.LayoutParams parameter =  (RelativeLayout.LayoutParams) show.getLayoutParams();
		parameter.setMargins(0, 0, 0, 0);
		show.setLayoutParams(parameter);
	}

}
