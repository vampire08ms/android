package com.example.gundam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	public Button button = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// NotificationManager nm = (NotificationManager)
				// getSystemService(Context.NOTIFICATION_SERVICE);
				// @SuppressWarnings("deprecation")
				// Notification n = new Notification(R.drawable.ic_launcher,
				// "Hello,there!", System.currentTimeMillis());
				// n.flags = Notification.FLAG_AUTO_CANCEL;
				//
				// n.setLatestEventInfo(this, "Hello,there!",
				// "Hello,there,I'm john.", null);
				// nm.notify(1, n);

				Intent intent = new Intent();
				intent.setClass(MainActivity.this, MainActivity2.class);
				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

}
