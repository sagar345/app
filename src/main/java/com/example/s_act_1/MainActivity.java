package com.example.s_act_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView s_bg2=findViewById(R.id.s_bg2);
        Button b1=findViewById(R.id.s_b_1);
        Button b2=findViewById(R.id.s_b_2);
        Button b3=findViewById(R.id.s_b_3);
        Button b4=findViewById(R.id.s_b_4);

        RelativeLayout s_Ract1=findViewById(R.id.s_Ract1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nut_lev=new Intent(MainActivity.this,s_act_2.class);
                startActivity(nut_lev);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rda=new Intent(MainActivity.this,s_act_3.class);
                startActivity(rda);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Diet=new Intent(MainActivity.this,s_act_4.class);
                startActivity(Diet);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Physical=new Intent(MainActivity.this,s_act_5.class);
                startActivity(Physical);
            }
        });


    }
}