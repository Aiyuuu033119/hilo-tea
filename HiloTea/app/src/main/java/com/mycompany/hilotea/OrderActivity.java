package com.mycompany.hilotea;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import java.util.*;
import android.content.*;

public class OrderActivity extends Activity
{	

	LinearLayout m1,m2,m3,m4,m5;
	LinearLayout fr1,fr2,fr3,fr4,fr5;
	LinearLayout b1,b2,b3,b4,b5;
	LinearLayout ff1,ff2,ff3,ff4,ff5;
	LinearLayout c1,c2,c3,c4,c5;
	LinearLayout empty, total_card;

	TextView m1_q_2,m2_q_2,m3_q_2,m4_q_2,m5_q_2;
	TextView fr1_q_2,fr2_q_2,fr3_q_2,fr4_q_2,fr5_q_2;
	TextView b1_q_2,b2_q_2,b3_q_2,b4_q_2,b5_q_2;
	TextView ff1_q_2,ff2_q_2,ff3_q_2,ff4_q_2,ff5_q_2;
	TextView c1_q_2,c2_q_2,c3_q_2,c4_q_2,c5_q_2;

	TextView m1_p_2,m2_p_2,m3_p_2,m4_p_2,m5_p_2;
	TextView fr1_p_2,fr2_p_2,fr3_p_2,fr4_p_2,fr5_p_2;
	TextView b1_p_2,b2_p_2,b3_p_2,b4_p_2,b5_p_2;
	TextView ff1_p_2,ff2_p_2,ff3_p_2,ff4_p_2,ff5_p_2;
	TextView c1_p_2,c2_p_2,c3_p_2,c4_p_2,c5_p_2;

    TextView total_item_2;
	public Intent window = new Intent();

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);

		String orders = getIntent().getStringExtra("complete");

		m1 = (LinearLayout)findViewById(R.id.m1_list_2);
		m2 = (LinearLayout)findViewById(R.id.m2_list_2);
		m3 = (LinearLayout)findViewById(R.id.m3_list_2);
		m4 = (LinearLayout)findViewById(R.id.m4_list_2);
		m5 = (LinearLayout)findViewById(R.id.m5_list_2);

		fr1 = (LinearLayout)findViewById(R.id.fr1_list_2);
		fr2 = (LinearLayout)findViewById(R.id.fr2_list_2);
		fr3 = (LinearLayout)findViewById(R.id.fr3_list_2);
		fr4 = (LinearLayout)findViewById(R.id.fr4_list_2);
		fr5 = (LinearLayout)findViewById(R.id.fr5_list_2);

		b1 = (LinearLayout)findViewById(R.id.b1_list_2);
		b2 = (LinearLayout)findViewById(R.id.b2_list_2);
		b3 = (LinearLayout)findViewById(R.id.b3_list_2);
		b4 = (LinearLayout)findViewById(R.id.b4_list_2);
		b5 = (LinearLayout)findViewById(R.id.b5_list_2);

		ff1 = (LinearLayout)findViewById(R.id.ff1_list_2);
		ff2 = (LinearLayout)findViewById(R.id.ff2_list_2);
		ff3 = (LinearLayout)findViewById(R.id.ff3_list_2);
		ff4 = (LinearLayout)findViewById(R.id.ff4_list_2);
		ff5 = (LinearLayout)findViewById(R.id.ff5_list_2);

		c1 = (LinearLayout)findViewById(R.id.c1_list_2);
		c2 = (LinearLayout)findViewById(R.id.c2_list_2);
		c3 = (LinearLayout)findViewById(R.id.c3_list_2);
		c4 = (LinearLayout)findViewById(R.id.c4_list_2);
		c5 = (LinearLayout)findViewById(R.id.c5_list_2);

		m1_q_2 = (TextView)findViewById(R.id.m1_q_2);
		m2_q_2 = (TextView)findViewById(R.id.m2_q_2);
		m3_q_2 = (TextView)findViewById(R.id.m3_q_2);
		m4_q_2 = (TextView)findViewById(R.id.m4_q_2);
		m5_q_2 = (TextView)findViewById(R.id.m5_q_2);

		m1_p_2 = (TextView)findViewById(R.id.m1_p_2);
		m2_p_2 = (TextView)findViewById(R.id.m2_p_2);
		m3_p_2 = (TextView)findViewById(R.id.m3_p_2);
		m4_p_2 = (TextView)findViewById(R.id.m4_p_2);
		m5_p_2 = (TextView)findViewById(R.id.m5_p_2);


		fr1_q_2 = (TextView)findViewById(R.id.fr1_q_2);
		fr2_q_2 = (TextView)findViewById(R.id.fr2_q_2);
		fr3_q_2 = (TextView)findViewById(R.id.fr3_q_2);
		fr4_q_2 = (TextView)findViewById(R.id.fr4_q_2);
		fr5_q_2 = (TextView)findViewById(R.id.fr5_q_2);

		fr1_p_2 = (TextView)findViewById(R.id.fr1_p_2);
		fr2_p_2 = (TextView)findViewById(R.id.fr2_p_2);
		fr3_p_2 = (TextView)findViewById(R.id.fr3_p_2);
		fr4_p_2 = (TextView)findViewById(R.id.fr4_p_2);
		fr5_p_2 = (TextView)findViewById(R.id.fr5_p_2);

		b1_q_2 = (TextView)findViewById(R.id.b1_q_2);
		b2_q_2 = (TextView)findViewById(R.id.b2_q_2);
		b3_q_2 = (TextView)findViewById(R.id.b3_q_2);
		b4_q_2 = (TextView)findViewById(R.id.b4_q_2);
		b5_q_2 = (TextView)findViewById(R.id.b5_q_2);

		b1_p_2 = (TextView)findViewById(R.id.b1_p_2);
		b2_p_2 = (TextView)findViewById(R.id.b2_p_2);
		b3_p_2 = (TextView)findViewById(R.id.b3_p_2);
		b4_p_2 = (TextView)findViewById(R.id.b4_p_2);
		b5_p_2 = (TextView)findViewById(R.id.b5_p_2);

		ff1_q_2 = (TextView)findViewById(R.id.ff1_q_2);
		ff2_q_2 = (TextView)findViewById(R.id.ff2_q_2);
		ff3_q_2 = (TextView)findViewById(R.id.ff3_q_2);
		ff4_q_2 = (TextView)findViewById(R.id.ff4_q_2);
		ff5_q_2 = (TextView)findViewById(R.id.ff5_q_2);

		ff1_p_2 = (TextView)findViewById(R.id.ff1_p_2);
		ff2_p_2 = (TextView)findViewById(R.id.ff2_p_2);
		ff3_p_2 = (TextView)findViewById(R.id.ff3_p_2);
		ff4_p_2 = (TextView)findViewById(R.id.ff4_p_2);
		ff5_p_2 = (TextView)findViewById(R.id.ff5_p_2);

		c1_q_2 = (TextView)findViewById(R.id.c1_q_2);
		c2_q_2 = (TextView)findViewById(R.id.c2_q_2);
		c3_q_2 = (TextView)findViewById(R.id.c3_q_2);
		c4_q_2 = (TextView)findViewById(R.id.c4_q_2);
		c5_q_2 = (TextView)findViewById(R.id.c5_q_2);

		c1_p_2 = (TextView)findViewById(R.id.c1_p_2);
		c2_p_2 = (TextView)findViewById(R.id.c2_p_2);
		c3_p_2 = (TextView)findViewById(R.id.c3_p_2);
		c4_p_2 = (TextView)findViewById(R.id.c4_p_2);
		c5_p_2 = (TextView)findViewById(R.id.c5_p_2);

		empty = (LinearLayout)findViewById(R.id.empty_2);
		total_card = (LinearLayout)findViewById(R.id.cartLinearLayout5_2);
        total_item_2 = (TextView)findViewById(R.id.total_item_2);

        hidePanel(empty);
		hidePanel(total_card);
		
		hidePanel(m1);
		hidePanel(m2);
		hidePanel(m3);
		hidePanel(m4);
		hidePanel(m5);

		hidePanel(fr1);
		hidePanel(fr2);
		hidePanel(fr3);
		hidePanel(fr4);
		hidePanel(fr5);

		hidePanel(b1);
		hidePanel(b2);
		hidePanel(b3);
		hidePanel(b4);
		hidePanel(b5);

		hidePanel(ff1);
		hidePanel(ff2);
		hidePanel(ff3);
		hidePanel(ff4);
		hidePanel(ff5);

		hidePanel(c1);
		hidePanel(c2);
		hidePanel(c3);
		hidePanel(c4);
		hidePanel(c5);

		int total = 0;
		int price = 0;
		int quanty = 0;

		int m1_pieces = 0;
		int m2_pieces = 0;
		int m3_pieces = 0;
		int m4_pieces = 0;
		int m5_pieces = 0;

		int fr1_pieces = 0;
		int fr2_pieces = 0;
		int fr3_pieces = 0;
		int fr4_pieces = 0;
		int fr5_pieces = 0;

		int b1_pieces = 0;
		int b2_pieces = 0;
		int b3_pieces = 0;
		int b4_pieces = 0;
		int b5_pieces = 0;

		int ff1_pieces = 0;
		int ff2_pieces = 0;
		int ff3_pieces = 0;
		int ff4_pieces = 0;
		int ff5_pieces = 0;		

		int c1_pieces = 0;
		int c2_pieces = 0;
		int c3_pieces = 0;
		int c4_pieces = 0;
		int c5_pieces = 0;

		String[] arrOfStr = orders.split("-");
		
        if(arrOfStr!=null){
            for (String a: arrOfStr){
                switch(a){
                    case "m1":{
                            m1_pieces++;
                            price = 85 * m1_pieces;
                            quanty = 1 * m1_pieces;
                            total = total + 85;
                            m1_p_2.setText("PHP "+Integer.toString(price)+".00");
                            m1_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(m1);
                            break;
                        }
                    case "m2":{
                            m2_pieces++;
                            price = 85 * m2_pieces;
                            quanty = 1 * m2_pieces;
                            total = total + 85;
                            m2_p_2.setText("PHP "+Integer.toString(price)+".00");
                            m2_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(m2);
                            break;
                        }
                    case "m3":{
                            m3_pieces++;
                            price = 55 * m3_pieces;
                            quanty = 1 * m3_pieces;
                            total = total + 55;
                            m3_p_2.setText("PHP "+Integer.toString(price)+".00");
                            m3_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(m3);
                            break;
                        }
                    case "m4":{
                            m4_pieces++;
                            price = 75 * m4_pieces;
                            quanty = 1 * m4_pieces;
                            total = total + 75;
                            m4_p_2.setText("PHP "+Integer.toString(price)+".00");
                            m4_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(m4);
                            break;
                        }
                    case "m5":{
                            m5_pieces++;
                            price = 95 * m5_pieces;
                            quanty = 1 * m5_pieces;
                            total = total + 95;
                            m5_p_2.setText("PHP "+Integer.toString(price)+".00");
                            m5_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(m5);
                            break;
                        }
                    case "fr1":{
                            fr1_pieces++;
                            price = 55 * fr1_pieces;
                            quanty = 1 * fr1_pieces;
                            total = total + 55;
                            fr1_p_2.setText("PHP "+Integer.toString(price)+".00");
                            fr1_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(fr1);
                            break;
                        }
                    case "fr2":{
                            fr2_pieces++;
                            price = 65 * fr2_pieces;
                            quanty = 1 * fr2_pieces;
                            total = total + 65;
                            fr2_p_2.setText("PHP "+Integer.toString(price)+".00");
                            fr2_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(fr2);
                            break;
                        }
                    case "fr3":{
                            fr3_pieces++;
                            price = 65 * fr3_pieces;
                            quanty = 1 * fr3_pieces;
                            total = total + 65;
                            fr3_p_2.setText("PHP "+Integer.toString(price)+".00");
                            fr3_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(fr3);
                            break;
                        }
                    case "fr4":{
                            fr4_pieces++;
                            price = 60 * fr4_pieces;
                            quanty = 1 * fr4_pieces;
                            total = total + 60;
                            fr4_p_2.setText("PHP "+Integer.toString(price)+".00");
                            fr4_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(fr4);
                            break;
                        }
                    case "fr5":{
                            fr5_pieces++;
                            price = 70 * fr5_pieces;
                            quanty = 1 * fr5_pieces;
                            total = total + 70;
                            fr5_p_2.setText("PHP "+Integer.toString(price)+".00");
                            fr5_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(fr5);
                            break;
                        }
                    case "b1":{
                            b1_pieces++;
                            price = 45 * b1_pieces;
                            quanty = 1 * b1_pieces;
                            total = total + 45;
                            b1_p_2.setText("PHP "+Integer.toString(price)+".00");
                            b1_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(b1);
                            break;
                        }
                    case "b2":{
                            b2_pieces++;
                            price = 55 * b2_pieces;
                            quanty = 1 * b2_pieces;
                            total = total + 55;
                            b2_p_2.setText("PHP "+Integer.toString(price)+".00");
                            b2_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(b2);
                            break;
                        }
                    case "b3":{
                            b3_pieces++;
                            price = 55 * b3_pieces;
                            quanty = 1 * b3_pieces;
                            total = total + 55;
                            b3_p_2.setText("PHP "+Integer.toString(price)+".00");
                            b3_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(b3);
                            break;
                        }
                    case "b4":{
                            b4_pieces++;
                            price = 60 * b4_pieces;
                            quanty = 1 * b4_pieces;
                            total = total + 60;
                            b4_p_2.setText("PHP "+Integer.toString(price)+".00");
                            b4_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(b4);
                            break;
                        }
                    case "b5":{
                            b5_pieces++;
                            price = 80 * b5_pieces;
                            quanty = 1 * b5_pieces;
                            total = total + 80;
                            b5_p_2.setText("PHP "+Integer.toString(price)+".00");
                            b5_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(b5);
                            break;
                        }
                    case "ff1":{
                            ff1_pieces++;
                            price = 35 * ff1_pieces;
                            quanty = 1 * ff1_pieces;
                            total = total + 35;
                            ff1_p_2.setText("PHP "+Integer.toString(price)+".00");
                            ff1_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(ff1);
                            break;
                        }
                    case "ff2":{
                            ff2_pieces++;
                            price = 35 * ff2_pieces;
                            quanty = 1 * ff2_pieces;
                            total = total + 35;
                            ff2_p_2.setText("PHP "+Integer.toString(price)+".00");
                            ff2_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(ff2);
                            break;
                        }
                    case "ff3":{
                            ff3_pieces++;
                            price = 35 * ff3_pieces;
                            quanty = 1 * ff3_pieces;
                            total = total + 35;
                            ff3_p_2.setText("PHP "+Integer.toString(price)+".00");
                            ff3_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(ff3);
                            break;
                        }
                    case "ff4":{
                            ff4_pieces++;
                            price = 35 * ff4_pieces;
                            quanty = 1 * ff4_pieces;
                            total = total + 35;
                            ff4_p_2.setText("PHP "+Integer.toString(price)+".00");
                            ff4_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(ff4);
                            break;
                        }
                    case "ff5":{
                            ff5_pieces++;
                            price = 35 * ff5_pieces;
                            quanty = 1 * ff5_pieces;
                            total = total + 35;
                            ff5_p_2.setText("PHP "+Integer.toString(price)+".00");
                            ff5_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(ff5);
                            break;
                        }
                    case "c1":{
                            c1_pieces++;
                            price = 70 * c1_pieces;
                            quanty = 1 * c1_pieces;
                            total = total + 70;
                            c1_p_2.setText("PHP "+Integer.toString(price)+".00");
                            c1_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(c1);
                            break;
                        }
                    case "c2":{
                            c2_pieces++;
                            price = 70 * c2_pieces;
                            quanty = 1 * c2_pieces;
                            total = total + 70;
                            c2_p_2.setText("PHP "+Integer.toString(price)+".00");
                            c2_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(c2);
                            break;
                        }
                    case "c3":{
                            c3_pieces++;
                            price = 70 * c3_pieces;
                            quanty = 1 * c3_pieces;
                            total = total + 70;
                            c3_p_2.setText("PHP "+Integer.toString(price)+".00");
                            c3_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(c3);
                            break;
                        }
                    case "c4":{
                            c4_pieces++;
                            price = 70 * c4_pieces;
                            quanty = 1 * c4_pieces;
                            total = total + 70;
                            c4_p_2.setText("PHP "+Integer.toString(price)+".00");
                            c4_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(c4);
                            break;
                        }
                    case "c5":{
                            c5_pieces++;
                            price = 70 * c5_pieces;
                            quanty = 1 * c5_pieces;
                            total = total + 70;
                            c5_p_2.setText("PHP "+Integer.toString(price)+".00");
                            c5_q_2.setText(Integer.toString(quanty)+"x");
                            showPanel(c5);
                            break;
                        }
                }


		    }

        }

        if(total==0){
		    showPanel(empty);  
        }else{
            showPanel(total_card);
            total_item_2.setText("PHP "+Integer.toString(total)+".00");  
        }

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
		parameter.setMargins(0, 0, 0, 10);
		show.setLayoutParams(parameter);

	}

	public LinearLayout layout(String text){
		LinearLayout layout = null;
		return layout;
	}


}
