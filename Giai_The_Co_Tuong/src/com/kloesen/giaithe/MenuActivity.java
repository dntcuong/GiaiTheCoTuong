package com.kloesen.giaithe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
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
	
	
	public void buttonPlayActionPerform(View v){
		
		Button buttonPlay = (Button) findViewById(R.id.menuactivity_buttonPlay);
		
		buttonPlay.setBackgroundResource(R.drawable.menuactivity_buttonplay_press);
		
		Intent i=new Intent(getBaseContext(),PlayActivity.class);
        startActivity(i);
	}
	
	public void onClickButton(View v) {
		 
		Toast.makeText(this, "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
	}
	
}
