package com.example.androiduiwidgetsthree;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerDemoTwo extends AppCompatActivity {

    TextView tv_time;
    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_demo_two);

        tv_time=(TextView) findViewById(R.id.tv_time);

        Calendar c=Calendar.getInstance();
        int hour=c.get(Calendar.HOUR);
        int min=c.get(Calendar.MINUTE);

        tv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePickerDialog=new TimePickerDialog(TimePickerDemoTwo.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourr, int minn) {
                        tv_time.setText(hourr+" : "+minn);
                    }
                }, hour,min, true);
                timePickerDialog.show();
            }
        });
    }
}