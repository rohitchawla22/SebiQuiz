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

public class level3 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level3);

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
		editor.putString("score3", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level3.this, QuizMenu.class);
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q7. In context with the banking, Intermediation cost refers to __________________");
		a1.setText("Sales and administration expense");
		a2.setText("Total operating expense");
		a3.setText("Total non-interest expense");
		a4.setText("None of these");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level3.this, "INCORRECT: \nIn context with the banking, Intermediation cost refers to Total operating expense",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.b:
					Toast.makeText(level3.this, "CORRECT: \nIn context with the banking, Intermediation cost refers to Total operating expense",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					ty();
					break;
				case R.id.c:
					Toast.makeText(level3.this, "INCORRECT: \nIn context with the banking, Intermediation cost refers to Total operating expense",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				case R.id.d:
					Toast.makeText(level3.this, "INCORRECT: \nIn context with the banking, Intermediation cost refers to Total operating expense",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q6. Which in the below list is correct about an Equity Fund?");
		a1.setText("Gives fixed returns");
		a2.setText("Invests primarily in Shares");
		a3.setText("Invests in both debt and shares");
		a4.setText("Assures growth in value");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nInvests primarily in shares",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level3.this,
							"CORRECT: \nInvests primarily in shares",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nInvests primarily in shares",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q7();
					break;
				case R.id.d:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nInvests primarily in shares",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		que.setText("Q5. Which was the first Indian company to list on NASDAQ?");
		a1.setText("Infosys");
		a2.setText("Satyam");
		a3.setText("Hindustan Lever");
		a4.setText("Indian Oil");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level3.this, "CORRECT: \nInfosys was the first company to list on NASDAQ",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.b:
					Toast.makeText(level3.this, "INCORRECT: \nInfosys was the first company to list on NASDAQ",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level3.this, "INCORRECT: \nInfosys was the first company to list on NASDAQ",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q6();
					break;
		    	case R.id.d:
					Toast.makeText(level3.this, "INCORRECT: \nInfosys was the first company to list on NASDAQ",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		que.setText("Q4. What is full form of NEAT which is the online trading system of the National Stock Exchange?");
		a1.setText("New Exchange for Automated Trading");
		a2.setText("National Exchange for Automated Trading");
		a3.setText("National Exchange for Automatic Trading");
		a4.setText("New Exchange for Automatic Trading");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level3.this, "INCORRECT: \nNEAT stands for National Exchange for Automated Training",
							Toast.LENGTH_LONG).show();
					q5();
					break;
				case R.id.b:
					Toast.makeText(level3.this, "CORRECT: \nNEAT stands for National Exchange for Automated Training",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a2.setChecked(false);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level3.this, "INCORRECT: \nNEAT stands for National Exchange for Automated Training",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q5();
					break;
				case R.id.d:
					Toast.makeText(level3.this, "INCORRECT: \nNEAT stands for National Exchange for Automated Training",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		que.setText("Q3. Which was the first Indian company to list on NYSE?");
		a1.setText("IDBI Bank");
		a2.setText("Axis Bank");
		a3.setText("ICICI Bank");
		a4.setText("City Bank");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nICICI was the first Indian Comapny to be listed on NYSE.",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nICICI was the first Indian Comapny to be listed on NYSE.",
							Toast.LENGTH_LONG).show();

					
					a2.setChecked(false);
					
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level3.this,
							"CORRECT: \nICICI was the first Indian Comapny to be listed on NYSE.",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
					q4();
					break;
				case R.id.d:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nICICI was the first Indian Comapny to be listed on NYSE.",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
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
		que.setText("Q2. There are three exchanges in China among them are Hong Kong Stock Exchange and Shanghai Stock Exchange. Which is the third one?");
		a1.setText("National Shenzhen Stock Exchange");
		a2.setText("Shenzhen Stock Embassy");
		a3.setText("Shenzhen Stock Exchange");
		a4.setText("Chinese Stock Exchange");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level3.this, "INCORRECT: \nHong Kong Stock Exhange, Shanghai Stock Exchange and Shenzhen Stock Exchange are the tree exchanges in China",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level3.this, "INCORRECT: \nHong Kong Stock Exhange, Shanghai Stock Exchange and Shenzhen Stock Exchange are the tree exchanges in China",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q3();
					break;
				case R.id.c:
					Toast.makeText(level3.this, "CORRECT: \nHong Kong Stock Exhange, Shanghai Stock Exchange and Shenzhen Stock Exchange are the tree exchanges in China",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a3.setChecked(false);
					q3();
					break;
				case R.id.d:
					Toast.makeText(level3.this, "INCORRECT: \nHong Kong Stock Exhange, Shanghai Stock Exchange and Shenzhen Stock Exchange are the tree exchanges in China",
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
		que.setText("Q1. Which refers to the “Statement of Financial Position” as per the Financial Statements released under IFRS?");
		a1.setText("Balance Sheet");
		a2.setText("Income Statment");
		a3.setText("Profit and Loss Statement");
		a4.setText("Fund Flow Statement");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level3.this,
							"CORRECT: \nAs per the Financial Statements Balance Sheet refers to the “Statement of Financial Position”",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nnAs per the Financial Statements Balance Sheet refers to the “Statement of Financial Position”",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nnAs per the Financial Statements Balance Sheet refers to the “Statement of Financial Position”",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q2();
					break;
				case R.id.d:
					Toast.makeText(
							level3.this,
							"INCORRECT: \nnAs per the Financial Statements Balance Sheet refers to the “Statement of Financial Position”",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q2();
					break;
				
				}
			}
		});
	}

}