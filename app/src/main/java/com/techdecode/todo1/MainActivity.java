package com.techdecode.todo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);

        button1=(Button) findViewById(R.id.my_day);
        button2=(Button) findViewById(R.id.tasks);
        button3=(Button) findViewById(R.id.physics);
        button4=(Button) findViewById(R.id.maths);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openactivity_myday();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openactivity_tasks();
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openactivity_phy();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openactivity_maths();
            }
        });


    }

    public void openactivity_myday(){
        Intent intent=new Intent(this,myday.class);
        startActivity(intent);
    }
    public void openactivity_tasks(){
        Intent intent=new Intent(this,tasks.class);
        startActivity(intent);
    }

    public void openactivity_phy(){
        Intent intent=new Intent(this,physics.class);
        startActivity(intent);
    }

    public void openactivity_maths(){
        Intent intent=new Intent(this,maths.class);
        startActivity(intent);
    }

}