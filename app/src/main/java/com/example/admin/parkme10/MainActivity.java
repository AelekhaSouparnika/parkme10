package com.example.admin.parkme10;

import android.app.AlertDialog;
import android.content.Intent;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegister(View view){
        Intent i1=new Intent(this,Register.class);
        startActivity(i1);

    }
    public void onSecurity(View view){
       email=(EditText) findViewById(R.id.editText2);
        password=(EditText) findViewById(R.id.editText3);
        String em=email.getText().toString();
        String pass=password.getText().toString();
        if (em.equals("")|| pass.equals("")){
            Toast.makeText(this,"Enter any input",Toast.LENGTH_SHORT).show();
        }
        else if (em.equals("123")&& pass.equals("123")){

            Intent i2 = new Intent(this,Security.class);
            startActivity(i2);
        }
        else
        {
            Toast.makeText(this,"Invalid inputs",Toast.LENGTH_SHORT).show();

        }

    }
    public void onCustomer(View view){
        Intent i3=new Intent(this,Customer.class);
        startActivity(i3);
    }



}