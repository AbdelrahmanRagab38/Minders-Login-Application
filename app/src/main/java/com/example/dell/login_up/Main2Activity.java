package com.example.dell.login_up;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

 constraintLayout=(ConstraintLayout)findViewById(R.id.background);
constraintLayout.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        String[]color1={
                 "#66a3ff",
                "#80dfff",
                "#5d5dd5",
                "#9933ff",
                "#ffff4d"

        };

        String[]color2={
                "#9966ff",
                "#ff33cc",
                "#cc6699",
                "#66ff33",
                "#993399"

        };
        Random random =new Random();
        GradientDrawable gradientDrawable=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor(color1[random.nextInt(6)]),Color.parseColor(color2[random.nextInt(6)])});
        constraintLayout.setBackgroundDrawable(gradientDrawable);


        return false;
    }
});

        TextView txtv=(TextView)findViewById(R.id.previewMail);
        Bundle b=getIntent().getExtras();
        String usermail=b.getString("mail");
        txtv.setText(usermail);

    }
}
