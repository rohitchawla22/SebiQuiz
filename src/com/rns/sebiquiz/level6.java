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

public class level6 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level6);

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
		editor.putString("score6", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level6.this, QuizMenu.class);
					startActivity(i);
				}
			}
		};
		timer.start();
		
	}
	
	public void q10() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q10. Which among the following is correct regarding progressive Tax ?");
		a1.setText("Surcharge levied on taxes for development works");
		a2.setText("Rate of tax increased for increased value or volume");
		a3.setText("Getting burden of tax passed on to general customeINR");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n Rate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);
					ty();
					
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"CORRECT: \n Rate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n Rate of tax increased for increased value or volume",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				}
			}
		});
	}
	
	

	public void q9() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q9. Which among the following is correct regarding BPLR or benchmark prime lending rate?");
		a1.setText("It is lowest interest rate below PLR charged by a bank from the best customer of the financial year");
		a2.setText("It is highest interest rate above PLR charged by a bank from the any customer of the financial year");
		a3.setText("None of the above");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \n BPLR is lowest interest rate below PLR charged by a bank from the best customer of the financial year",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q10();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \n BPLR is lowest interest rate below PLR charged by a bank from the best customer of the financial year",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q10();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \n BPLR is lowest interest rate below PLR charged by a bank from the best customer of the financial year",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q10();
					break;
				}
			}
		});
	}
	
	
	
	public void q8() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q8. What is the main function of banking department of Reserve Bank of India?");
		a1.setText("To do banking business with customeINR");
		a2.setText("To provide liquidity to the economy and absorb liquidity");
		a3.setText("To issue the currency in circulation and it s withdrawal from circulation");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n To issue the currency in circulation and it's withdrawal from circulation",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q9();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n To issue the currency in circulation and it's withdrawal from circulation",
							Toast.LENGTH_LONG).show();

					
					a2.setChecked(false);
					
					q9();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"CORRECT: \n To issue the currency in circulation and it's withdrawal from circulation",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
					q9();
					break;
				}
			}
		});
	}

	
	
	
	public void q7() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q7. As we know that RBI has two departments Issue Department and Banking Department. Which among them is responsible for maintaining a Minimum reserve system against printing of currency notes?");
		a1.setText("Issue Department");
		a2.setText("Banking Department");
		a3.setText("Both of Them");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q8();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q8();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q8();
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q6. Which among the following sentence is true?");
		a1.setText("RBI introduced Repos & Revenue Repos in 1992");
		a2.setText("RBI Introduced Repos in 1992 & Revenue Repos in 1996");
		a3.setText("RBI introduced Repos & Revenue Repos in 1996");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n RBI Introduced Repos in 1992 & Revenue Repos in 1996",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"CORRECT: \n RBI Introduced Repos in 1992 & Revenue Repos in 1996",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n RBI Introduced Repos in 1992 & Revenue Repos in 1996",
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q5. Which among the following helps RBI to manage liquidity conditions in the economy with banks having an avenue to surplus funds or avail funds?");
		a1.setText("Repos");
		a2.setText("Revenue repos");
		a3.setText("Money market Mutual Funds");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \n Repos are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \n Repos are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \n Repos are money market insrtuments which allow banks and financial instituions to sell secruities to an investor with an agreement to repurchase at specified rate and date",
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q4. Recently we came to know that Treasury Bills which are short term (upto one year) borrowing instruments of the Government of India are also being issued frequently under the Market Stabilization Scheme (MSS). They are available for minimum amount of ___?");
		a1.setText("\u20B9 25, 000");
		a2.setText("\u20B9 40, 000");
		a3.setText("\u20B9 50, 000");
		a4.setText("They are key instruments of credit in the unorganized money market in India");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \n \u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondar market",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \n \u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondar market",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \n \u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondar market",
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q3. Which among the following correctly defines Hundi?");
		a1.setText("They are slips on paper presented to the customer while purchasing goods");
		a2.setText("They are accounts of unorganized sector in India");
		a3.setText("They are key instruments of credit in the unorganized money market in India");
		a4.setText("They are key instruments of credit in the unorganized money market in India");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n C is the correct definition",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n C is the correct definition",
							Toast.LENGTH_LONG).show();

					
					a2.setChecked(false);
					
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"CORRECT: \n C is the correct definition",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q2. What is the full form of SEBI? ");
		a1.setText("Security and Exchanging Board of India");
		a2.setText("Securities and Exchange Board of India");
		a3.setText("Sensitive and Exchange Board of India");
		a4.setText("Sensitive and Exchange Board of Indonesia");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level6.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "CORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					q3();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q3();
					break;
				case R.id.d:
					Toast.makeText(level6.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q1. What does SENSEX stands for?");
		a1.setText("Sensitive index");
		a2.setText("Sense index");
		a3.setText("Sensible index");
		a4.setText("Senseless index");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"CORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q2();
					break;
				case R.id.d:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q2();
					break;
				
				}
			}
		});
	}

}