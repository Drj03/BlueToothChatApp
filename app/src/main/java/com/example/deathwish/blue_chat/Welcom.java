package com.example.deathwish.blue_chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Welcom extends AppCompatActivity {
  private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
       name=findViewById(R.id.user_name);
    }



    public void btActivity(View view) {
       Intent intent=new Intent(getApplicationContext(),BtChat.class);
       intent.putExtra("userName",name.getText().toString());
       startActivity(intent);
       finish();
    }
}
