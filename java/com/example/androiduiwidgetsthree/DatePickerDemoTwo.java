package com.example.androiduiwidgetsthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePickerDemoTwo extends AppCompatActivity {

    DatePicker datepicker_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_demo_two);

        datepicker_two=(DatePicker) findViewById(R.id.datepicker_two);
    }

    public void getDayMonthYear(View view)
    {
        int month=datepicker_two.getMonth();
        float year=datepicker_two.getYear();
        int day=datepicker_two.getDayOfMonth();

        Toast.makeText(this, "Month : "+(month+1)+" - "+day+" - "+year, Toast.LENGTH_SHORT).show();

        //=============get current date and time========================
//        Calendar c=Calendar.getInstance();
//
//        int day=c.get(Calendar.DAY_OF_MONTH);
//        int month=c.get(Calendar.MONTH);
//        int year=c.get(Calendar.YEAR);

        //Toast.makeText(this, "Month : "+(month+1)+" - "+day+" - "+year, Toast.LENGTH_SHORT).show();
    }
}