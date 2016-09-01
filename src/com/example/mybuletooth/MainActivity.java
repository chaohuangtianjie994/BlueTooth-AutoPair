package com.example.mybuletooth;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	
	/** Called when the activity is first created. */ 
	private Button autopairbtn=null;
	private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		autopairbtn=(Button) findViewById(R.id.button1);
		autopairbtn.setOnClickListener(this);
		
	}
	
	//设置按钮的监听方法
	@Override
	public void onClick(View arg0) {
		
		if (!bluetoothAdapter.isEnabled())
		{
				bluetoothAdapter.enable();//异步的，不会等待结果，直接返回。
		}else{
				bluetoothAdapter.startDiscovery();
			 }
		
	}
}
