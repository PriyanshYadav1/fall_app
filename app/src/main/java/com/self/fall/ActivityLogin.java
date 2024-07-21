package com.self.fall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Login_button), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText username,password;
        Button login;

        username = findViewById(R.id.username_text);
        password = findViewById(R.id.password_text);
        login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this,MainActivity.class);
                startActivity(intent);

               String username_input = username.getText().toString().toLowerCase();
               String password_input = password.getText().toString();

               if (username_input == "jack" && password_input == "123")
               {
                   Toast.makeText(ActivityLogin.this,"Login Successful", Toast.LENGTH_SHORT);
               }
               else
               {
                   Toast.makeText(ActivityLogin.this,"Invalid Credentials",Toast.LENGTH_SHORT);
               }
            }
        });
    }
}