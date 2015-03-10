package com.test.ipkcalculator.ipkcalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.test.ipkcalculator.ipkcalculator.ViewController.Settings.SettingsActivity;
import com.test.ipkcalculator.ipkcalculator.ViewController.General.ChooseBinusianActivity;


public class MainActivity extends ActionBarActivity {
    private ImageView logoImageView;
    private Button startButton;
    private Button settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoImageView = (ImageView) findViewById(R.id.logoImageView);
        startButton = (Button) findViewById(R.id.startButton);
        settingButton = (Button) findViewById(R.id.settingsButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ChooseBinusianActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SettingsActivity.class);
                MainActivity.this.startActivity(myIntent);

            }
        });
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {


    }



//        @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
