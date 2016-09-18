package com.example.admin.parkme10;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 17-Sep-16.
 */
public class Security extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security);
        AlertDialog alertDialog=new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Status");
        alertDialog.setMessage("Successfull");
        alertDialog.show();

    }

}
