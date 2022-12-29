
	 
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

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;


import android.os.PowerManager;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;
import android.widget.TimePicker;

import 	android.util.Pair;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.widget.SwitchCompat;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

	public class schedule_activity extends Activity implements  CompoundButton.OnCheckedChangeListener {

	
	private View _bg__schedule_ek2;
	private ImageView image_bg;
	private ImageView schedule_box;
	private TextView time3;
	private TextView time2;
	private TextView question_button;
	private TextView add_button;
	private SwitchCompat toggle1;
	private SwitchCompat toggle2;
	private SwitchCompat toggle3;
	private View wrap_Monday;
	private TextView s;
	private View rectangle_25_ek1;
	private View rectangle_25_ek2;
	private TextView s_ek1;
	private TextView s_ek2;
	private TextView s_ek3;
	private TextView time1;
	private TextView s_ek4;
	private TextView s_ek5;
	private View on_off_1;
	private View rectangle_24_ek2;
	private View rectangle_25_ek4;
	private TextView s_ek6;
	private View rectangle_25_ek5;
	private TextView s_ek7;
	private View rectangle_25_ek6;
	private View rectangle_25_ek7;
	private TextView s_ek8;
	private TextView s_ek9;
	private View rectangle_25_ek8;
	private TextView s_ek10;
	private View rectangle_25_ek9;
	private TextView s_ek11;
	private View ellipse_12_ek2;
	private TextView s_ek12;
	private View rectangle_24_ek3;
	private View ellipse_12_ek3;
	private View rectangle_25_ek10;
	private TextView s_ek13;
	private View rectangle_25_ek11;
	private TextView s_ek14;
	private TextView wednesday_ek1;
	private TextView s_ek15;
	private View rectangle_25_ek12;
	private TextView s_ek16;
	private View days_button_ek14;
	private TextView s_ek17;
	private ImageView vector_9_ek1;
	private ImageView home_button;

	//add the variable to hold each time_block
	private RelativeLayout time_block_1;
	private RelativeLayout time_block_2;
	private RelativeLayout time_block_3;

	private PendingIntent intent1;
	private PendingIntent intent2;
	private PendingIntent intent3;
	private AlarmManager alarmManager;

	private PowerManager pm;
	boolean isScreenOn;
	//variable for timeDialog
	//int hour, minute;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);
		createNotificationChannel();



		_bg__schedule_ek2 = (View) findViewById(R.id._bg__schedule_ek2);
		image_bg = (ImageView) findViewById(R.id.image_bg);
		schedule_box = (ImageView) findViewById(R.id.schedule_box);

		time1 = (TextView) findViewById(R.id.time1);
		time3 = (TextView) findViewById(R.id.time3);
		time2 = (TextView) findViewById(R.id.time2);
		question_button = (TextView) findViewById(R.id.question_button);
		add_button = (TextView) findViewById(R.id.add_button);

		 toggle1 = (SwitchCompat) findViewById(R.id.toggle1);
		 toggle2 = (SwitchCompat) findViewById(R.id.toggle2);
		 toggle3 = (SwitchCompat) findViewById(R.id.toggle3);

//		if (toggle1.isChecked()){
//			intent1 = setTimer(view, time1);
//		}
		wrap_Monday = (View) findViewById(R.id.wrap_Monday);
		s = (TextView) findViewById(R.id.s);
		rectangle_25_ek1 = (View) findViewById(R.id.rectangle_25_ek1);
		rectangle_25_ek2 = (View) findViewById(R.id.rectangle_25_ek2);
		s_ek1 = (TextView) findViewById(R.id.s_ek1);
		s_ek2 = (TextView) findViewById(R.id.s_ek2);
		s_ek3 = (TextView) findViewById(R.id.s_ek3);
		s_ek4 = (TextView) findViewById(R.id.s_ek4);
		s_ek5 = (TextView) findViewById(R.id.s_ek5);
		on_off_1 = (View) findViewById(R.id.on_off_1);
		rectangle_25_ek4 = (View) findViewById(R.id.rectangle_25_ek4);
		s_ek6 = (TextView) findViewById(R.id.s_ek6);
		rectangle_25_ek5 = (View) findViewById(R.id.rectangle_25_ek5);
		s_ek7 = (TextView) findViewById(R.id.s_ek7);
		rectangle_25_ek6 = (View) findViewById(R.id.rectangle_25_ek6);
		rectangle_25_ek7 = (View) findViewById(R.id.rectangle_25_ek7);
		s_ek8 = (TextView) findViewById(R.id.s_ek8);
		s_ek9 = (TextView) findViewById(R.id.s_ek9);
		rectangle_25_ek8 = (View) findViewById(R.id.rectangle_25_ek8);
		s_ek10 = (TextView) findViewById(R.id.s_ek10);
		rectangle_25_ek9 = (View) findViewById(R.id.rectangle_25_ek9);
		s_ek11 = (TextView) findViewById(R.id.s_ek11);
		rectangle_25_ek10 = (View) findViewById(R.id.rectangle_25_ek10);
		s_ek13 = (TextView) findViewById(R.id.s_ek13);
		rectangle_25_ek11 = (View) findViewById(R.id.rectangle_25_ek11);
		s_ek14 = (TextView) findViewById(R.id.s_ek14);
		wednesday_ek1 = (TextView) findViewById(R.id.wednesday_ek1);
		s_ek15 = (TextView) findViewById(R.id.s_ek15);
		rectangle_25_ek12 = (View) findViewById(R.id.rectangle_25_ek12);
		s_ek16 = (TextView) findViewById(R.id.s_ek16);
		days_button_ek14 = (View) findViewById(R.id.days_button_ek14);
		s_ek17 = (TextView) findViewById(R.id.s_ek17);
		home_button = (ImageView) findViewById(R.id.home_button);

		//add 3 time block variables
		time_block_1 = (RelativeLayout) findViewById(R.id.time_block_1);
		time_block_2 = (RelativeLayout) findViewById(R.id.time_block_2);
		time_block_3 = (RelativeLayout) findViewById(R.id.time_block_3);

		home_button.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent nextScreen = new Intent(getApplicationContext(), main_activity.class);
				startActivity(nextScreen);


			}
		});


		//when click time_block: move to the pick_hours page
		time_block_1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				popTimePicker(v, time1);
			}
		});

		time_block_2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				popTimePicker(v, time2);
			}
		});

		time_block_3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				popTimePicker(v, time3);
			}
		});

		toggle1.setOnCheckedChangeListener(this);

		toggle2.setOnCheckedChangeListener(this);

		toggle3.setOnCheckedChangeListener(this);
	}

		private void createNotificationChannel() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
			CharSequence name = "foxandroidReminderChannel";
			String description = "Channel for Alarm Manager";
			int importance = NotificationManager.IMPORTANCE_HIGH;
			NotificationChannel channel = new NotificationChannel("foxandroid", name, importance);
			channel.setDescription(description);

			NotificationManager notificationManager = getSystemService(NotificationManager.class);
			notificationManager.createNotificationChannel(channel);
			}
		}
		public int[] parseTime (TextView view){
			int[] convertTime = new int[2];
			String t = String.valueOf(view.getText());
			String[] parse= t.split(":");
			int hour = Integer.parseInt(parse[0]);
			parse= parse[1].split(" ");
			int minute = Integer.parseInt(parse[0]);
			System.out.println(t);
			if (parse[1].equals("PM")){
				if (hour == 12){
					hour = 12;
				}
				else{
					hour += 12;
				}

			}
			if ((hour == 12) && (parse[1].equals("AM"))){
				hour = 0;
			}
			convertTime[0] = hour;
			convertTime[1] = minute;
			return convertTime;
		}
		public void popTimePicker(View view, TextView time){
			int[] convertTime = parseTime(time);
			int hour = convertTime[0];
			int minute = convertTime[1];
			TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener()
			{
				@Override
				public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute ){
					int hour = selectedHour;
					int minute = selectedMinute;
					boolean isPM = (hour >= 12);
					time.setText(String.format("%02d:%02d %s", (hour == 12 || hour == 0) ? 12 : hour % 12, minute, isPM ? "PM" : "AM"));
					updateAlarms();
				}
			};
			int style = AlertDialog.THEME_HOLO_DARK;
			TimePickerDialog timePickerDialog = new TimePickerDialog(this,style, onTimeSetListener, hour, minute, false);
			timePickerDialog.show();
			//System.out.println("show");
		}
		public PendingIntent setTimer(TextView time){
			int[] convertTime = parseTime(time);
			int hour = convertTime[0];
			int minute = convertTime[1];
			Date date = new Date();

			Calendar cal_alarm = Calendar.getInstance();
			Calendar cal_now = Calendar.getInstance();


			cal_now.setTime(date);
			cal_alarm.setTime(date);

			cal_alarm.setTimeInMillis(System.currentTimeMillis());
			cal_alarm.set(Calendar.HOUR_OF_DAY, hour);
			cal_alarm.set(Calendar.MINUTE, minute);
			cal_alarm.set(Calendar.SECOND, 0);

//
//			Date print = cal_alarm.getTime();
//			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//			String strDate = dateFormat.format(print);
//			System.out.println("Time now: " + strDate);


			if (cal_alarm.before(cal_now)){
				cal_alarm.add(Calendar.DATE,1);
			}
			Intent intent = new Intent(schedule_activity.this, AlarmNotification.class);
			PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);
			alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal_alarm.getTimeInMillis(),
					AlarmManager.INTERVAL_FIFTEEN_MINUTES, pendingIntent);
			Toast.makeText(this, "Alarm set successfully", Toast.LENGTH_SHORT).show();

			return pendingIntent;
		}

		public void updateAlarms() {
			if (intent1!=null){
				alarmManager.cancel(intent1);
			}
			if (toggle1.isChecked()) {
				intent1 = setTimer(time1);
			}
			if (intent2!=null){
				alarmManager.cancel(intent2);
			}
			if (toggle2.isChecked()) {
				intent2 = setTimer(time2);
			}
			if (intent3!=null){
				alarmManager.cancel(intent3);
			}
			if (toggle3.isChecked()) {
				intent3 = setTimer(time3);
			}
		}

			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				updateAlarms();
			}
}
	
	
