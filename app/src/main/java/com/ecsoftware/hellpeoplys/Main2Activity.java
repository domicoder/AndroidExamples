package com.ecsoftware.hellpeoplys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvCed;
    private TextView tvAddress;
    private TextView tvAge;
    private TextView tvNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showInfo();
    }

    private void showInfo(){

        Bundle data = getIntent().getExtras();

        tvName = (TextView) findViewById(R.id.txtvYourName);
        tvName.setText(data.getString("id_name")+" "+data.getString("id_lastName"));

        tvCed = (TextView) findViewById(R.id.txtvCed_Actv2);
        tvCed.setText(String.valueOf(data.getString("id_ced")));

        tvAddress = (TextView) findViewById(R.id.txtvAddress_Actv2);
        tvAddress.setText(data.getString("id_address"));

        tvAge = (TextView) findViewById(R.id.txtvAge_Actv2);
        tvAge.setText(String.valueOf(data.getString("id_age")));

        tvNumber = (TextView) findViewById(R.id.txtvNumber_Actv2);
        tvNumber.setText(String.valueOf(data.getString("id_number")));

    }

    public void showMain1(View view){
        finish();
    }

}
