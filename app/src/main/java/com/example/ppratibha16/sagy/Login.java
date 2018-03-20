package com.example.ppratibha16.sagy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button login;
    EditText name,password;
    TextView info;
    int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        info=(TextView)findViewById(R.id.textView2);
        login=(Button)findViewById(R.id.button);
        info.setText("no of attempts remaining :3");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
     void validate(String username,String userpassword)
    {
        if( (username.equals("admin")) && (userpassword.equals("1234"))) {
            Intent intent = new Intent(Login.this, SelectCategory.class);
            startActivity(intent);
        }
        else{
            counter--;
            info.setText("no of attempts remaining:" +String.valueOf(counter));
            if(counter == 0)
                login.setEnabled(false);

        }
    }
}
