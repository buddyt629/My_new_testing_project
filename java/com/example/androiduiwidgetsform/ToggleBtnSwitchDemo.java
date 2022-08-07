package com.example.androiduiwidgetsform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleBtnSwitchDemo extends AppCompatActivity {

    ToggleButton wifi_togglebtn;
    Switch wifi_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn_switch_demo);

        wifi_togglebtn=(ToggleButton) findViewById(R.id.wifi_togglebtn);
        wifi_switch= (Switch) findViewById(R.id.wifi_switch);
    }

    public void getValueFromToggleBtn(View view)
    {
        if(wifi_togglebtn.isChecked())
        {
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }
    }

    public void getValueFromSwitch(View view)
    {
        if(wifi_switch.isChecked())
        {
            Toast.makeText(this, "Wifii Onn", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wifii Offf", Toast.LENGTH_SHORT).show();
        }
    }
}