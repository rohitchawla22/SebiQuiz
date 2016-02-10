package com.rns.sebiquiz;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class level4 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level4);

		q1();

	}

	public void ty(){
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		
		
		score.setVisibility(View.INVISIBLE);
		option.setVisibility(View.INVISIBLE);
		que.setText("SCORE: " +sc);
		data = getSharedPreferences(filename, 0);
		SharedPreferences.Editor editor = data.edit();
		editor.putString("score4", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level4.this, QuizMenu.class);
					startActivity(i);
				}
			}
		};
		timer.start();
		
	}
	
	public void q7() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q7.Which among the following helps RBI to manage liquidity conditions in the economy with banks having an avenue to surplus funds or avail funds?");
		a1.setText("Repos");
		a2.setText("Reverse Repos");
		a3.setText("Money market Mutual Funds");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level4.this, "CORRECT: \nRepos. They are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.b:
					Toast.makeText(level4.this, "INCORRECT: \nRepos. They are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					ty();
					break;
				case R.id.c:
					Toast.makeText(level4.this, "INCORRECT: \nRepos. They are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				}
			}
		});
	}
	
	
	public void q6() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q6. CAC 40 is the prominent stock index of which country?");
		a1.setText("France");
		a2.setText("India");
		a3.setText("China");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level4.this,
							"CORRECT: \nCAC 40 is the prominent stock index of France",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a1.setChecked(false);

					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level4.this,
							"CORRECT: \nCAC 40 is the prominent stock index of France",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level4.this,
							"INCORRECT: \nCAC 40 is the prominent stock index of France",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q7();
					break;
				}
			}
		});
	}
	
	public void q5() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q5. As we know that RBI has two departments Issue Department and Banking Department . Which among them is responsible for maintaining a Minimum reserve system against printing of currency notes?");
		a1.setText("Issue Department");
		a2.setText("Banking Department");
		a3.setText("Both of them");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level4.this, "CORRECT: \nIssue Department is responsible for maintaining a Minimum reserve system against printing of currency notes",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.b:
					Toast.makeText(level4.this, "INCORRECT: \nIssue Department is responsible for maintaining a Minimum reserve system against printing of currency notes",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level4.this, "INCORRECT: \nIssue Department is responsible for maintaining a Minimum reserve system against printing of currency notes",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q6();
					break;
			
				}
			}
		});
	}
	
	public void q4() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q4. Many a times we read the word Glocalization which means a combination of localization and globalization. Which among the following is a best example of globalization in India?");
		a1.setText("McDonald");
		a2.setText("KFC");
		a3.setText("Starbucks");
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level4.this, "CORRECT: \nMcDonald is the best example for Glocalization in India",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.b:
					Toast.makeText(level4.this, "INCORRECT: \nMcDonald is the best example for Glocalization in India",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level4.this, "INCORRECT: \nMcDonald is the best example for Glocalization in India",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q5();
					break;
				}
			}
		});
	}
	public void q3() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q3. Which among the following is correct regarding Progressive Tax? ");
		a1.setText("Surcharge levied on taxes for development works");
		a2.setText("Rate of tax increased for increased value or volume");
		a3.setText("Getting burden of tax passed on to general customers");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level4.this,
							"INCORRECT: \nRate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level4.this,
							"CORRECT: \nRate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();

					sc++;
					score.setText("SCORE: " + sc);	
					a2.setChecked(false);
					
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level4.this,
							"INCORRECT: \nRate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q4();
					break;
				}
			}
		});
	}


	
	
	public void q2() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q2. What is the main function of banking department of Reserve Bank of India?");
		a1.setText("To do banking business with customers");
		a2.setText("To provide liquidity to the economy and absorb liquidity");
		a3.setText("To issue the currency in circulation and its withdrawal from circulation");
	

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level4.this, "INCORRECT: \nMain function of banking department of Reserve Bank of India is to issue the currency in circulation and its withdrawal from circulation",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level4.this, "INCORRECT: \nMain function of banking department of Reserve Bank of India is to issue the currency in circulation and its withdrawal from circulation",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q3();
					break;
				case R.id.c:
					Toast.makeText(level4.this, "CORRECT: \nMain function of banking department of Reserve Bank of India is to issue the currency in circulation and its withdrawal from circulation",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a3.setChecked(false);
					q3();
					break;
				
				}
			}
		});
	}

	public void q1() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		
		score.setText("SCORE: " + sc);
		que.setText("Q1. What is the equity of Reserve bank of India in National Housing Bank ?");
		a1.setText("49%");
		a2.setText("51%");
		a3.setText("100%");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level4.this,
							"INCORRECT: \nRBI have an equity of 100% in National Housing Bank",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level4.this,
							"INCORRECT: \nRBI have an equity of 100% in National Housing Bank",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level4.this,
							"CORRECT: \nRBI have an equity of 100% in National Housing Bank",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
					q2();
					break;
				
				}
			}
		});
	}

}