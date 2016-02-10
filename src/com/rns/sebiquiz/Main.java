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
		ImageButton faq = (ImageButton) findViewById(R.id.faq);

		faq.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
				builder.setTitle("Frequently Asked Questions");
				builder.setMessage("\t\t Thank you for using SEBI Quiz \n\n\n\t\t\t\t\t\t\t\t\t\t\t\t This Quiz type Android Application \n\t\t\t\t\t\t\t\t\t\t\t\t\t Sravan Ch\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t and \n\t\t\t\t\t\t\t\t\t\t\t Rohit Chawla");
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
				builder.setMessage("\t\t Thank you for using SEBI Quiz \n\n\t\tThis Application has been made for the intent of making learning of Securities Market and Financial Education easy.\n\n\t\t\t\t\t\t\t\t\t\t\t CREATED BY: \n\t\t\t\t\t\t\t\t\t\t\t\t\t Sravan Ch\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t and \n\t\t\t\t\t\t\t\t\t\t\t Rohit Chawla");
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
