package com.example.toureasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText username,email, password,repassword;
    TextView signin;
    Button signup;
    DBHelper DB;
    DBHelper3 DB3;
//    passHelper passR;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        email = (EditText) findViewById(R.id.EmailID);
        signin = (TextView) findViewById(R.id.btnsignin);
        signup = (Button) findViewById(R.id.btnsignup);
        DB = new DBHelper(this);
        DB3 = new DBHelper3(this);
//        passR = new passHelper();

        SharedPreferences sharedPreferences = getSharedPreferences(LoginActivity.SHARED_PREF_NAME,0);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                String em = email.getText().toString();


                //if(user.equals("")||pass.equals("")||repass.equals("")){
                  //  Toast.makeText(RegisterActivity.this,"Please enter all fields",Toast.LENGTH_SHORT).show();
              //  }else{
                Boolean check=validateinfo(user,pass,em,repass);
                if(check==true){
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user,pass,em);

                            if(insert==true){
//                                Toast.makeText(MainActivity.this,"Registered successfully!",Toast.LENGTH_SHORT).show();
//                                passR.setUsername(user);
                                DB.sourceInsert();
                                DB3.destinationInsert();
                                DB3.insertDistance();

                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString(KEY_NAME,user);
                                editor.putBoolean("firstRun",true);
                                editor.apply();
                                editor.commit();
                                finish();

                                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(RegisterActivity.this,"Registration failed",Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(RegisterActivity.this,"User already exists",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(RegisterActivity.this,"Password does'nt match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    private boolean validateinfo(String user, String pass, String em, String repass) {
        if(user.length()==0){
            username.requestFocus();
            username.setError("FIELD CANNOT BE EMPTY");
            return false;
        } else if (!user.matches("[a-zA-Z]+"))
        {
            username.requestFocus();
            username.setError("Enter Only Alphabetical Character");
            return false;
        }
        else if (em.length()==0)
        {
            email.requestFocus();
            email.setError("Field Cannot be Empty");
            return false;
        }// else if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
        else if (!em.matches("[a-zA-Z0-9._-]+@+gmail.com+"))
        {
            email.requestFocus();
            email.setError("Enter Valid Email");
            return false;
        } else if (pass.length()<=5) {
            password.requestFocus();
            password.setError("Minimum 6 Charactered");
            return false;
        } else  {
            return true;
        }
    }
}