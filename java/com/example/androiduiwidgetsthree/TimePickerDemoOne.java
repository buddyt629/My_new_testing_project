package com.example.androiduiwidgetsthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerDemoOne extends AppCompatActivity {

    TimePicker timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_demo_one);

        timepicker=(TimePicker) findViewById(R.id.timepicker);

        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hours, int min) {
                Toast.makeText(TimePickerDemoOne.this, ""+hours+" : "+min, Toast.LENGTH_SHORT).show();
            }
        });
    }
}