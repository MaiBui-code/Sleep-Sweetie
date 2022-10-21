
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		schedule
	 *	@date 		Monday 10th of October 2022 08:32:53 PM
	 *	@title 		Sleep (Screens)
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package exportkit.figma;
//package com.raj.timepickerscroll;



import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TimePicker;

	public class pick_hours_activity extends Activity {

	
	private View _bg__pick_hours_ek2;
	private ImageView image_6;
	private TextView _0;
	private TextView _29;
	private TextView _30;
	private TextView _31;
	private TextView _1;
	private TextView _2;
	private ImageView vector_10;
	private ImageView vector_11;
	private ImageView vector_12;
	private ImageView vector_13;
	private TextView __;
	private TextView pm;
	private ImageView vector_14;
	private TextView am;
	private View ellipse_13;
	private TextView s_ek18;
	private View ellipse_13_ek1;
	private TextView s_ek19;
	private View ellipse_13_ek2;
	private TextView s_ek20;
	private View ellipse_13_ek3;
	private TextView s_ek21;
	private View ellipse_13_ek4;
	private TextView s_ek22;
	private View ellipse_13_ek5;
	private TextView s_ek23;
	private View ellipse_13_ek6;
	private TextView s_ek24;
	private ImageView _307692789_491831092502669_2658396862767040473_n_1_ek1;
	private ImageView back;
	private TextView schedule_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pick_hours);

		
		_bg__pick_hours_ek2 = (View) findViewById(R.id._bg__pick_hours_ek2);
		image_6 = (ImageView) findViewById(R.id.image_6);
		_0 = (TextView) findViewById(R.id._0);
		_29 = (TextView) findViewById(R.id._29);
		_30 = (TextView) findViewById(R.id._30);
		_31 = (TextView) findViewById(R.id._31);
		_1 = (TextView) findViewById(R.id._1);
		_2 = (TextView) findViewById(R.id._2);
		vector_10 = (ImageView) findViewById(R.id.vector_10);
		vector_11 = (ImageView) findViewById(R.id.vector_11);
		vector_12 = (ImageView) findViewById(R.id.vector_12);
		vector_13 = (ImageView) findViewById(R.id.vector_13);
		__ = (TextView) findViewById(R.id.__);
		pm = (TextView) findViewById(R.id.pm);
		vector_14 = (ImageView) findViewById(R.id.vector_14);
		am = (TextView) findViewById(R.id.am);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		s_ek18 = (TextView) findViewById(R.id.s_ek18);
		ellipse_13_ek1 = (View) findViewById(R.id.ellipse_13_ek1);
		s_ek19 = (TextView) findViewById(R.id.s_ek19);
		ellipse_13_ek2 = (View) findViewById(R.id.ellipse_13_ek2);
		s_ek20 = (TextView) findViewById(R.id.s_ek20);
		ellipse_13_ek3 = (View) findViewById(R.id.ellipse_13_ek3);
		s_ek21 = (TextView) findViewById(R.id.s_ek21);
		ellipse_13_ek4 = (View) findViewById(R.id.ellipse_13_ek4);
		s_ek22 = (TextView) findViewById(R.id.s_ek22);
		ellipse_13_ek5 = (View) findViewById(R.id.ellipse_13_ek5);
		s_ek23 = (TextView) findViewById(R.id.s_ek23);
		ellipse_13_ek6 = (View) findViewById(R.id.ellipse_13_ek6);
		s_ek24 = (TextView) findViewById(R.id.s_ek24);
		_307692789_491831092502669_2658396862767040473_n_1_ek1 = (ImageView) findViewById(R.id._307692789_491831092502669_2658396862767040473_n_1_ek1);
		back = (ImageView) findViewById(R.id.back);
		schedule_ek3 = (TextView) findViewById(R.id.schedule_ek3);
	
		
		back.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), schedule_activity.class);
				startActivity(nextScreen);
			
		
			}
		});

		//custom code goes here
		//create a time picker


	}

}
	
	