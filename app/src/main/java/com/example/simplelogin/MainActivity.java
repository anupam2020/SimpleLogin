package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private TextView display;
    private Button res;
    private Button log;
    private Button cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= (EditText) findViewById(R.id.nme);
        pass= (EditText) findViewById(R.id.password);
        display= (TextView) findViewById(R.id.dis);
        res= (Button) findViewById(R.id.reset);
        log= (Button) findViewById(R.id.login);
        cl= (Button) findViewById(R.id.close);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((name.getText().toString().equals(null) || name.getText().toString().equals("")) && (pass.getText().toString().equals(null) || pass.getText().toString().equals("")))
                {
                    display.setText("Please enter your Name and Password!");
                }
                else if(name.getText().toString().equals(null)||name.getText().toString().equals(""))
                {
                    display.setText("Please enter your Name!");
                }
                else if(pass.getText().toString().equals(null)||pass.getText().toString().equals(""))
                {
                    display.setText("Please enter your Password!");
                }
                else
                {
                    display.setText("Welcome, "+name.getText().toString()+"!");
                }
            }
        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText("");
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText("");
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name.setText("");
                pass.setText("");
                display.setText("");
            }
        });

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}
