package com.example.admin.parkme10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 17-Sep-16.
 */
public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void onPreregister(View view){
        Intent i4=new Intent(this,MainActivity.class);
        startActivity(i4);
    }

}
