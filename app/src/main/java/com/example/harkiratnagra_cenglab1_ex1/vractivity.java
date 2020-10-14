package com.example.harkiratnagra_cenglab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class vractivity extends AppCompatActivity {
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vractivity);
        text= (TextView)findViewById(R.id.activity);
        text.setText(getString(R.string.vr_tag)+getString(R.string.create));
    }

    public void onStart()
    {
        super.onStart();
        text.setText(getString(R.string.vr_tag)+getString(R.string.start));
        Log.d(getString(R.string.vr_tag), getString(R.string.start));
    }

    public void onStop()
    {
        super.onStop();
        text.setText(getString(R.string.vr_tag)+getString(R.string.stop));
        Log.d(getString(R.string.vr_tag), getString(R.string.stop));
    }

    public void onDestroy()
    {
        super.onDestroy();
        text.setText(getString(R.string.vr_tag)+getString(R.string.destroy));
        Log.d(getString(R.string.vr_tag), getString(R.string.destroy));
    }

}