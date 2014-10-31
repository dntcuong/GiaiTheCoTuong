package com.kloesen.giaithe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

public class MainActivity extends Activity {

	static int currentViewID = 0;
	
	@Override
	public void setContentView(int layoutResID) {
		currentViewID = layoutResID;
		super.setContentView(layoutResID);
	}
	@Override
	public void setContentView(View view) {
		currentViewID = view.getId();
		super.setContentView(view);
	}
	@Override
	public void setContentView(View view, LayoutParams params) {
		currentViewID = view.getId();
		super.setContentView(view, params);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainactivity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onBackPressed() {

		switch (currentViewID) {
		case R.layout.mainactivity_play:
			setContentView(R.layout.mainactivity_menu);
			break;

		default:
			super.onBackPressed();
			break;
		}
		
	}
	
	
	public void onClickButton(View v) {

		if (v.getId() == R.id.menuactivity_buttonPlay) {
			v.setBackgroundResource(R.drawable.menuactivity_buttonplay_press);
			setContentView(R.layout.mainactivity_play);
	        v.setBackgroundResource(R.drawable.menuactivity_buttonplay);
		}else{
			Toast.makeText(this, "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
		}
	}
	
}
