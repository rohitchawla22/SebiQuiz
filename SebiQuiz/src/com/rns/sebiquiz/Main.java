package com.rns.sebiquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ImageButton start = (ImageButton) findViewById(R.id.start);
		ImageButton about = (ImageButton) findViewById(R.id.about);
		ImageButton htp = (ImageButton) findViewById(R.id.htp);

		htp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
				builder.setTitle("How To Play");
				builder.setMessage("\t\t Thank you for using SEBI Quiz \n\n\n\t\t\t\t\t The SEBI Quiz game has 6 levels, all having mixed questions related to general terms and knowledge of Finance and Securities Markets, with some increase in level of difficulty as the level progresses.\n\nThis is a single answer type Multiple Choice Question, so there will be only 1 correct answer.\n\nEach correct question will give you 1 point and each wrong will give you a 0.\n\nYour final score will be displayed on the QuizMenu page. \n\nPlease Note: This application will not require use of neither your GPS nor your internet connection. \n\nThis application abides by the Privacy Protection Clause, i.e. Does not access information regarding user's personal information. ");
				builder.setCancelable(true);
				builder.setNeutralButton("OK",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								dialog.cancel();
							}
						});

				builder.create().show();
			}
		});
      
	   about.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
				builder.setTitle("About");
				builder.setMessage("\t\t Thank you for using SEBI Quiz \n\n\t\tThis Application has been made for the intent of making learning of Securities Market and Financial Education easy.\n\n\t\t\t\t\t\t\t\t\t\t\t CREATED BY: \n\t\t\t\t\t\t\t\t\t\t\t\t\t Sravan Ch\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t and \n\t\t\t\t\t\t\t\t\t\t\t Rishabh Banga");
				builder.setCancelable(true);
				builder.setNeutralButton("OK",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								dialog.cancel();
							}
						});

				builder.create().show();
			}
		});
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Main.this, QuizMenu.class);
				startActivity(i);
			}
		});
	}
}
