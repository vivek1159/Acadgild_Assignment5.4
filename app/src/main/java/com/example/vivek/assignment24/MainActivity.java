package com.example.vivek.assignment24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UserName;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText) findViewById(R.id.UserName);


        LoginButton = (Button) findViewById(R.id.LoginButton);

    }

    public void onClickLogin(View v) {
        String username = UserName.getText().toString();

        if (!(username.length() < 1)) {
            Intent i = new Intent(MainActivity.this, Welcome.class);
            i.putExtra("Name", "Welcome " + username);
            startActivity(i);
        } else {
            UserName.setError("Username cannot be blank");
        }
    }
}