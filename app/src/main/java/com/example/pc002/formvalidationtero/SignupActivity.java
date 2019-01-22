package com.example.pc002.formvalidationtero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText etUsername, etPassword, etConfirm, etFullName;
    String username, password, FullName, confirm;
    int formsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirm = findViewById(R.id.etConfirm);
        etFullName = findViewById(R.id.etFullName);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_cancel, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()) {
           case R.id.btnSave:

               formsuccess = 4;

               username = etUsername.getText().toString();
               password = etPassword.getText().toString();
               confirm = etConfirm.getText().toString();
               FullName = etFullName.getText().toString();

               if(username.equals("")) {
                   etUsername.setError("This field is required");
                   formsuccess--;
               }

                   if(password.equals("")) {
                       etPassword.setError("This field is required");
                       formsuccess--;
               }

               if(!confirm.equals(password)) {
                   etConfirm.setError("Password Not Match");
                   formsuccess--;
               }

                       if(FullName.equals("")) {
                           etFullName.setError("This field is required");
                           formsuccess--;
               }


               Toast.makeText(this, "Validate Form Test", Toast.LENGTH_SHORT).show();
               break;
           case R.id.btnCancel:
               this.finish();
               break;
       }



        return super.onOptionsItemSelected(item);
    }
}