
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home_page
	 *	@date 		0
	 *	@title 		Home Page
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class spash_activity extends Activity {

	
	private View __bg__spash_ek2;
	private ImageView logonyaaaaaaaaaaa;
	private TextView tumbuh;
	private TextView v_1_0_2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.spash);

		
		__bg__spash_ek2 = (View) findViewById(R.id.__bg__spash_ek2);
		logonyaaaaaaaaaaa = (ImageView) findViewById(R.id.logonyaaaaaaaaaaa);
		tumbuh = (TextView) findViewById(R.id.tumbuh);
		v_1_0_2 = (TextView) findViewById(R.id.v_1_0_2);
	
		
		__bg__spash_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	