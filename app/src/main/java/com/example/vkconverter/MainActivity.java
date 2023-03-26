package com.example.vkconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText=findViewById(R.id.editText3);
        textView = findViewById(R.id.textView);
        textView=findViewById((R.id.textView2));
        textView=findViewById((R.id.textView4));
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converting the Data", Toast.LENGTH_SHORT).show();

                //storing the value in string
                String s = editText.getText().toString();
                int a = Integer.parseInt(s);
                double miles = a/1.609;
                textView.setText("the value is"+miles);

            }
        });


    }
}