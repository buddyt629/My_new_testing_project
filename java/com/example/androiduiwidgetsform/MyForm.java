package com.example.androiduiwidgetsform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    EditText et_name, et_password, et_phone;
    RadioButton rb_male, rb_female;
    CheckBox cb_android, cb_java, cb_python;
    Spinner sp_cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        et_name=(EditText) findViewById(R.id.et_name);
        et_password=(EditText) findViewById(R.id.et_password);
        et_phone=(EditText) findViewById(R.id.et_phone);

        rb_male=(RadioButton) findViewById(R.id.rb_male);
        rb_female=(RadioButton) findViewById(R.id.rb_female);

        cb_android=(CheckBox) findViewById(R.id.cb_android);
        cb_java=(CheckBox) findViewById(R.id.cb_java);
        cb_python=(CheckBox) findViewById(R.id.cb_python);

        sp_cities=(Spinner) findViewById(R.id.sp_cities);
    }

    public void getAllValues(View view)
    {
        // --------------get values from edittext--------------------
        String name=et_name.getText().toString();
        String password=et_password.getText().toString();
        String phoneno=et_phone.getText().toString();

        // --------------get values from radio buttons -----------------------
        String gender="";
        if(rb_male.isChecked())
        {
            gender=rb_male.getText().toString();
        }
        if(rb_female.isChecked())
        {
            gender=rb_female.getText().toString();
        }

        //-----------------get values from checkbox --------------------------
        String interest="";
        if(cb_android.isChecked())
        {
            interest += cb_android.getText().toString()+"\n";
        }
        if(cb_java.isChecked())
        {
            interest += cb_java.getText().toString()+"\n";
        }
        if(cb_python.isChecked())
        {
            interest += cb_python.getText().toString()+"\n";
        }

        //--------------------get value from spinner --------------------------

        String city=sp_cities.getSelectedItem().toString();

        // ------------------- print all values in toast ----------------------

        String res=name+"\n"+phoneno+"\n"+password+"\n"+gender+"\n"+interest+"\n"+city;
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}