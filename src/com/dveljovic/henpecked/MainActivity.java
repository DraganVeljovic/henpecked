package com.dveljovic.henpacked;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button01, button02, button03, button04, button05;
	
	private static String number = "tel:123456789";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button01 = (Button) findViewById(R.id.Button01);
        button02 = (Button) findViewById(R.id.Button02);
        button03 = (Button) findViewById(R.id.Button03);
        button04 = (Button) findViewById(R.id.Button04);
        button05 = (Button) findViewById(R.id.Button05);
        
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	SMSSender.sendSMS(v);
            }
        });
        
        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	SMSSender.sendSMS(v);
            }
        });
        
        button03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	SMSSender.sendSMS(v);
            }
        });
        
        button04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	SMSSender.sendSMS(v);
            }
        });
        
        button05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try
                {
                	Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(number));
                	startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    Log.e("henpecked", "SMS failed", e);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
