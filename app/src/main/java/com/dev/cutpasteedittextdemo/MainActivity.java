package com.dev.cutpasteedittextdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public GoEditText etData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etData = (GoEditText) findViewById(R.id.main_et);
        etData.addListener(new GoEditTextListener() {
            @Override
            public void onUpdate() {
                if (etData.getText().toString().length() > 2000) {
                    Toast.makeText(MainActivity.this, "Bio must be at or below 2000 characters", Toast.LENGTH_SHORT).show();
                    etData.setText("");
                }
            }
        });
    }
}
