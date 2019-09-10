package com.udemy.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);

        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){

                    Toast.makeText(getApplicationContext(),"CheckBox is Enable",Toast.LENGTH_LONG).show();

                }else {

                    Toast.makeText(getApplicationContext(),"CheckBox is Disable",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
