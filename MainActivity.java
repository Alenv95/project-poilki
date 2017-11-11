package ru.example.python.napominalka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView textView = (TextView)findViewById(R.id.text);


    public void onClick(View view) {

        textView.setText(R.string.string2);
    }



}
