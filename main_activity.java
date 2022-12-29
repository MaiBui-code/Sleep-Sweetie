
	 
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
// Java Program to Display
// current hour and minute

// Importing java Date class libraries
import java.util.Calendar;
import java.util.Formatter;
import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

	public class main_activity extends Activity {

	
	private View _bg__main_ek2;
	private ImageView background;
	private ImageView home_button;
	private TextView time;
	private ImageView sun;
	private ImageView moon;
	private ImageView status_bar;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);


		_bg__main_ek2 = (View) findViewById(R.id._bg__main_ek2);
		background = (ImageView) findViewById(R.id.background);
		home_button = (ImageView) findViewById(R.id.home_button);
		time = (TextView) findViewById(R.id.time);
		sun = (ImageView) findViewById(R.id.sun);
		moon = (ImageView) findViewById(R.id.moon);

		//create the interval to run the functions after each seconds
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				time.setText(actualTime());
			}
		};
		Timer timer = new Timer();
		long delay = 0;
		long intevalPeriod = 1 * 1000;

		// schedules the task to be run in an interval
		timer.scheduleAtFixedRate(task, delay,
				intevalPeriod);

		//when click the sun or moon --> navigate to schedule_activity
		sun.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), schedule_activity.class);
				startActivity(nextScreen);

			}
		});

		moon.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), schedule_activity.class);
				startActivity(nextScreen);

			}
		});

		home_button.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);

			}
		});
	}
	//Create the actual time replacing the 11:11pm
	public String actualTime() {

		// Create Formatter class object
		Formatter Hour = new Formatter();

		// Creating a calendar
		Calendar calendar = Calendar.getInstance();

		// Displaying hour using Format class using format
		// specifiers
		// '%tl' for hours and '%tM' for minutes
		Hour.format("%tl:%tM", calendar,
				calendar);
		return Hour.toString();
	}


}
