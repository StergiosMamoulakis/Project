package com.example.intered.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dollar;
    TextView toEuro;
    Button btn;
    double d;
    double e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar=(EditText)findViewById(R.id.dollar);
        btn=(Button)findViewById(R.id.btn);
        toEuro=(TextView)findViewById(R.id.toEuro);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                d=Double.parseDouble(dollar.getText().toString());
                e=0.858398572*d;
                toEuro.setText(String.valueOf(e));


            }
        });


    }
}
