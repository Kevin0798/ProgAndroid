package com.example.loginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText EmailText;
    private EditText PasswordText;
    private Button Loginbtn;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailText = findViewById(R.id.EmailText);
        PasswordText = findViewById(R.id.PasswordText);
        Loginbtn = findViewById(R.id.LoginBtn);

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EmailText.getText().toString().matches(emailPattern)){
                    if (!EmailText.getText().toString().isEmpty() && !PasswordText.getText().toString().isEmpty() ){
                        openActivity();
                    }

                }
                if (EmailText.getText().toString().isEmpty()&& !PasswordText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Email is empty !", Toast.LENGTH_SHORT).show();
                }
                if (!EmailText.getText().toString().isEmpty() && PasswordText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password is empty !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Email and Password is empty !", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }
    public void openActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
