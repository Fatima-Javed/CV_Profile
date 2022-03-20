package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    EditText t1,t2,t3,t4,t5,t6,t7,t8;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) this.findViewById(R.id.cv);
        t1 = (EditText) this.findViewById(R.id.name);
        t2 = (EditText) this.findViewById(R.id.email);
        t3 = (EditText) this.findViewById(R.id.number);
        t4 = (EditText) this.findViewById(R.id.des);
        t5 = (EditText) this.findViewById(R.id.fd);
        t6 = (EditText) this.findViewById(R.id.skill);
        t7 = (EditText) this.findViewById(R.id.exp);
        btn =(Button) this.findViewById(R.id.btn);


    }

    public void demo(View view)
    {
        Intent intent= new Intent(this,MainActivity.class);
        intent.putExtra("Name", t1.getText().toString());
        intent.putExtra("Mail_me",t2.getText().toString());
        intent.putExtra("Number",t3.getText().toString());
        intent.putExtra("Description",t4.getText().toString());
        intent.putExtra("Final Degree",t5.getText().toString());
        intent.putExtra("Skill",t6.getText().toString());
        intent.putExtra("Experience",t7.getText().toString());
        startActivity(intent);
    }
}