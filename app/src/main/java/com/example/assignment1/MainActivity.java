package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    Button btn1,btn2;
    String str1,str2,str3,str4,str5,str6,str7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) this.findViewById(R.id.textView);
        t2= (TextView) this.findViewById(R.id.textView2);
        t3= (TextView) this.findViewById(R.id.textView3);
        t4= (TextView) this.findViewById(R.id.textView5);
        t5= (TextView) this.findViewById(R.id.textView4);
        btn1= (Button) this.findViewById(R.id.button);
        btn2= (Button) this.findViewById(R.id.button2);


        Intent intent= getIntent();
        str1 = intent.getStringExtra("Name");
        t1.setText(str1);


        str2 = intent.getStringExtra("Mail_me");
        btn2.setText("MAIL_ME");

        str3 = intent.getStringExtra("Number");
        btn1.setText("CALL_ME");

        str4 = intent.getStringExtra("Description");
        t2.setText(str4);

        str5 = intent.getStringExtra("Final Degree");
        t3.setText(str5);

        str6 = intent.getStringExtra("Skill");
        t4.setText(str6);

        str7 = intent.getStringExtra("Experience");
        t5.setText(str7);

    }

    public void call(View view)
    {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+ str3));
        startActivity(intent);


    }


    public void mail(View view) {
        String[] sl={str2};
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("email"));
        intent.putExtra(Intent.EXTRA_EMAIL,sl);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
        intent.setType("text/plain");
        Intent chooser= Intent.createChooser(intent,"Launch mail");
        startActivity(intent);
    }
}