package com.thv.hoangvu.Emusic.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thv.hoangvu.appnhac.R;

public class Register extends AppCompatActivity {

    EditText etUsername, etPass1, etPass2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.etUsername);
        etPass1 = findViewById(R.id.etPassword);
        etPass2 = findViewById(R.id.etCPassword);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String pass1 = etPass1.getText().toString();
                String pass2 = etPass2.getText().toString();

                if(checkRegister(username,pass1,pass2))
                {
                    clearText();
                    Intent intent = new Intent(getBaseContext(),Login.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(), "Đăng ký thành công",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else{
                    clearText();
                    Toast.makeText(getBaseContext(), "Xác nhận mật khẩu không đúng",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    private void clearText()
    {
        etUsername.setText("");
        etPass1.setText("");
        etPass2.setText("");
    }

    private void showSuccess()
    {

    }
    private boolean checkRegister(String u, String p1, String p2)
    {
        if(p1.equals(p2))
        {
            return true;
        }
        return false;
    }
}