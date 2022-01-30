package com.thv.hoangvu.Emusic.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.thv.hoangvu.appnhac.R;

public class Login extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnSubmit;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo2);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvRegister = findViewById(R.id.tvRegister);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String pass = etPassword.getText().toString();

                if(checkLogin(username,pass))
                {
                    clearText();
                    Intent intent = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(), "Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else{
                    clearText();
                    Toast.makeText(getBaseContext(), "Tài khoản hoặc mật khẩu không đúng",Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),Register.class);
                startActivity(intent);
            }
        });

    }

    private void clearText()
    {
        etUsername.setText("");
        etPassword.setText("");
    }

    private void showSuccess()
    {

    }

    public boolean checkLogin(String p1, String p2)
    {
        if(p1.equals("demo123"))
        {
            if(p2.equals("123456")|| p2.equals("hoangvu1"))
                return true;

        }
        return true;
    }
}