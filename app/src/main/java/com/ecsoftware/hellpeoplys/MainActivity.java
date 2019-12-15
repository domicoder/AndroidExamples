package com.ecsoftware.hellpeoplys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtxtName;
    private EditText edtxtLastName;
    private EditText edtxtCed;
    private EditText edtxtAddress;
    private EditText edtxtAge;
    private EditText edtxtNumber;

    String name, lastName, address, age, ced, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showActivitySystem(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        createPerson();
        intent.putExtra("id_name", name);
        intent.putExtra("id_lastName", lastName);
        intent.putExtra("id_address", address);
        intent.putExtra("id_age", age);
        intent.putExtra("id_ced", ced);
        intent.putExtra("id_number", number);

        if (!validateCed() | !validateAge() | !validateNumber()){
            return;
        }

        startActivity(intent);

    }

    private void createPerson(){

        edtxtName = (EditText) findViewById(R.id.edtxtName);
        name = edtxtName.getText().toString().trim();

        edtxtLastName = (EditText) findViewById(R.id.edtxtLastName);
        lastName = edtxtLastName.getText().toString();

        edtxtCed = (EditText) findViewById(R.id.edtxtCed);
        ced = edtxtCed.getText().toString().trim();

        edtxtAddress = (EditText) findViewById(R.id.edtxtAddress);
        address = edtxtAddress.getText().toString().trim();

        edtxtAge = (EditText) findViewById(R.id.edtxtAge);
        age = edtxtAge.getText().toString().trim();

        edtxtNumber = (EditText) findViewById(R.id.edtxtNumber);
        number = edtxtNumber.getText().toString().trim();

    }

    private boolean validateCed() {

        String cedula = edtxtCed.getText().toString().trim();

        if (cedula.isEmpty()) {
            edtxtCed.setError("Field is empty.");
            return false;
        } else if (cedula.length() > 11) {
            edtxtCed.setError("Cedula too long.");
            return false;
        } else if (cedula.length() < 11){
            edtxtCed.setError("Cedula too short.");
            return false;
        } else{
            edtxtCed.setError(null);
            return true;
        }

    }

    private boolean validateAge(){

        String age = edtxtAge.getText().toString().trim();

        if (age.isEmpty()){
            edtxtAge.setError("Field is empty.");
            return false;
        } else if (age.length() > 2){
            edtxtAge.setError("Age too long.");
            return false;
        }else{
            edtxtAge.setError(null);
            return true;
        }
    }

    private boolean validateNumber(){

        String number = edtxtNumber.getText().toString().trim();

        if (number.isEmpty()){
            edtxtNumber.setError("Field is empty.");
            return false;
        } else if (number.length() > 10){
            edtxtNumber.setError("Number too long.");
            return false;
        } else if (number.length() < 10){
            edtxtNumber.setError("Number too short.");
            return false;
        }else{
            edtxtNumber.setError(null);
            return true;
        }
    }

}
