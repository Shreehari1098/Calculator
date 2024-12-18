package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiplication extends AppCompatActivity {

    Button bak,bt;
    EditText et1,et2;
    TextView tv;
    String getNum1,getNum2,result;
    int n1,n2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);
        bak=(Button) findViewById(R.id.back);
        bt=(Button) findViewById(R.id.mul);

        et1=(EditText)findViewById(R.id.num1);
        et2=(EditText)findViewById(R.id.num2);

        tv=(TextView)findViewById(R.id.result);
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                n1=Integer.parseInt(getNum1);
                getNum2=et2.getText().toString();
                n2=Integer.parseInt(getNum2);

                res=n1*n2;

                result=String.valueOf(res);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
    }
}