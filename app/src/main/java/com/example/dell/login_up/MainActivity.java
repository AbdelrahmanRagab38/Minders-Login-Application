package com.example.dell.login_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnActivity2;
Button btnsplashActivity;


TextView tweettxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity2=findViewById(R.id.btnActivity2);
        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                EditText usermail=(EditText) findViewById(R.id.email_reg);
                Intent myfirstintent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle b =new Bundle();
                b.putString("mail",usermail.getText().toString());

                myfirstintent.putExtras(b);
                startActivity(myfirstintent);

            }
        });
        tweettxt=findViewById(R.id.tweter2);
        tweettxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MYTWEETINTENT=new Intent(MainActivity.this,login.class);
                startActivity(MYTWEETINTENT);

            }
        });

        btnsplashActivity=findViewById(R.id.button3);
btnsplashActivity.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent splashIntent=new Intent(MainActivity.this,splash.class);
        startActivity(splashIntent);
    }
});
    }
}
