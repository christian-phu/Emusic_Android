package com.thv.hoangvu.Emusic.Fragment;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thv.hoangvu.appnhac.R;

public class Settings extends AppCompatActivity {

    EditText etPass1, etPass2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        etPass1 = findViewById(R.id.etPass);
        etPass2 = findViewById(R.id.etPass2);
        btnSubmit = findViewById(R.id.btnSubmit);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pas1= etPass1.getText().toString().trim();
                String pas2 = etPass2.getText().toString().trim();
                if(checkPass(pas1,pas2))
                {
                    showSuccess();
                    Intent intent = new Intent();
                    setResult(RESULT_OK,intent);
                    finish();
                }
                else{
                    Toast.makeText(getBaseContext(), "Xác nhận mật khẩu không khớp ",Toast.LENGTH_SHORT).show();
                    clearText();
                }
            }
        });


    }

    public boolean checkPass(String p1, String p2)
    {
        return p1.equals(p2);
    }
    private void clearText()
    {
        etPass1.setText("");
        etPass2.setText("");
    }

    private void showSuccess()
    {
        clearText();
        Toast.makeText(getBaseContext(), "Thay đổi mật khẩu thành công",Toast.LENGTH_SHORT).show();
    }
}