package com.bit2016.seekbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView( R.layout.activity_main );

        ((SeekBar)findViewById(R.id.seekBar)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ((TextView) findViewById(R.id.textView)).setText("Current Volume : " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // 터치가 시작했을 때
                Log.d("MainActivity", "onStartTrackingTouch() called");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // 터치를 뗄 때
                Log.d("MainActivity", "onStopTrackingTouch() called");
            }
        });
    }

}
