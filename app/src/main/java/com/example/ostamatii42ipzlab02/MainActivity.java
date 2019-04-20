package com.example.ostamatii42ipzlab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText =(EditText)findViewById(R.id.editText);

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        String text = editText.getText().toString();
        intent.putExtra("value", text);
        Intent chooser = Intent.createChooser(intent, text);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }
    }

    public void onClickSendTo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}
