package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends AppCompatActivity {

    EditText et_my_phone;
    TextView tv_my_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

        et_my_phone=(EditText) findViewById(R.id.et_phone);
    }

    public void openCustomToast(View view)
    {
        LayoutInflater lf=getLayoutInflater();
        View layout=lf.inflate(R.layout.layout_custom_toast_design, (ViewGroup) findViewById(R.id.ct_linearid));

        tv_my_phone=(TextView) layout.findViewById(R.id.tv_phone);

        String phno=et_my_phone.getText().toString();
        tv_my_phone.setText(phno);

        Toast t=new Toast(getApplicationContext());
        //t.setGravity(Gravity.CENTER, 0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
}