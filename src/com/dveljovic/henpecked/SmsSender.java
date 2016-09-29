package com.dveljovic.henpecked;

import android.app.Activity;
import android.app.PendingIntent;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class SmsSender {

	private static String phoneNumber = "123456789";
	
	private static SmsManager smsManager = SmsManager.getDefault();
	
	public static void sendSMS(View v)
    {  
        smsManager.sendTextMessage(phoneNumber, null, (String)((Button)v).getText(), null, null);        
    }    
	
}
