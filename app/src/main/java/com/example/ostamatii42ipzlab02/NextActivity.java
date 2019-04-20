package com.example.ostamatii42ipzlab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Bundle arguments = getIntent().getExtras();
        String value = arguments.get("value").toString();

        TextView valText = (TextView)findViewById(R.id.textViewNA);

        valText.setText(value);

    }
}
