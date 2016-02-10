package com.rns.sebiquiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizMenu extends Activity implements OnClickListener {
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		data = getSharedPreferences(level1.filename, 0);
		data = getSharedPreferences(level2.filename, 0);
		data = getSharedPreferences(level3.filename, 0);
		data = getSharedPreferences(level4.filename, 0);
		data = getSharedPreferences(level5.filename, 0);
		data = getSharedPreferences(level6.filename, 0);
		String scorereturn1 = data.getString("score1", "PREVIOUS SCORE: NONE");
		String scorereturn2 = data.getString("score2", "PREVIOUS SCORE: NONE");
		String scorereturn3 = data.getString("score3", "PREVIOUS SCORE: NONE");
		String scorereturn4 = data.getString("score4", "PREVIOUS SCORE: NONE");
		String scorereturn5 = data.getString("score5", "PREVIOUS SCORE: NONE");
		String scorereturn6 = data.getString("score6", "PREVIOUS SCORE: NONE");
		ImageButton l1 = (ImageButton) findViewById(R.id.level1);
		ImageButton l2 = (ImageButton) findViewById(R.id.level2);
		ImageButton l3 = (ImageButton) findViewById(R.id.level3);
		ImageButton l4 = (ImageButton) findViewById(R.id.level4);
		ImageButton l5 = (ImageButton) findViewById(R.id.level5);
		ImageButton l6 = (ImageButton) findViewById(R.id.level6);
		TextView l1t = (TextView) findViewById(R.id.l1);
		TextView l2t = (TextView) findViewById(R.id.l2);
		TextView l3t = (TextView) findViewById(R.id.l3);
		TextView l4t = (TextView) findViewById(R.id.l4);
		TextView l5t = (TextView) findViewById(R.id.l5);
		TextView l6t = (TextView) findViewById(R.id.l6);
		
		l1t.setText(scorereturn1);
		l1.setOnClickListener(this);
		l2t.setText(scorereturn2);
		l2.setOnClickListener(this);
		l3t.setText(scorereturn3);
		l3.setOnClickListener(this);
		l4t.setText(scorereturn4);
		l4.setOnClickListener(this);
		l5t.setText(scorereturn5);
		l5.setOnClickListener(this);
		l6t.setText(scorereturn6);
		l6.setOnClickListener(this);
	}
	
	public void onClick (View v){
		switch(v.getId()){
		case  R.id.level1:
			Intent i1 = new Intent(QuizMenu.this, level1.class);
			startActivity(i1);
		break;
		case  R.id.level2:
			Intent i2 = new Intent(QuizMenu.this, level2.class);
			startActivity(i2);
			break;
		case  R.id.level3:
			Intent i3 = new Intent(QuizMenu.this, level3.class);
			startActivity(i3);
			break;
		case  R.id.level4:
			Intent i4 = new Intent(QuizMenu.this, level4.class);
			startActivity(i4);
			break;
		case  R.id.level5:
			Intent i5 = new Intent(QuizMenu.this, level5.class);
			startActivity(i5);
			break;
		case  R.id.level6:
			Intent i6 = new Intent(QuizMenu.this, level6.class);
			startActivity(i6);
			break;
		}
	}

}
