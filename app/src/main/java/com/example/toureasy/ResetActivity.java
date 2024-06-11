package com.example.toureasy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {
    TextView username;
    EditText password,repassword;
    Button confirm;
    DBHelper MyDB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        username=findViewById(R.id.username_reset_text);
        password= findViewById(R.id.password_reset);
        repassword=findViewById(R.id.repassword_reset);
        confirm=findViewById(R.id.btnconfirm);
        MyDB = new DBHelper(this);

        Intent intent = getIntent();
        username.setText(intent.getStringExtra("username"));
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user =username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();
                Boolean check=validateinfo(pass,repass);
                if(check==true){

                if(pass.equals(repass)) {

                    Boolean checkpasswordupdate = MyDB.updatepassword(user, pass);
                    if (checkpasswordupdate == true) {
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);
                        Toast.makeText(ResetActivity.this, "Password Updated Successfully", Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        Toast.makeText(ResetActivity.this, "Password Not matching", Toast.LENGTH_SHORT).show();
                    }
                }

                }
            }
        });

    }

    private Boolean validateinfo(String pass, String repass) {
        if(pass.length()<=5){
            password.requestFocus();
            password.setError("minimum 6 charactered");
            return false;
        }
        else if(!repass.equals(pass))
        {
            repassword.requestFocus();
            repassword.setError("enter correct password");
            return false;
        }
        else
        {
            return true;
        }
    }
}



