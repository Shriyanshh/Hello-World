package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        // button customization

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Color change
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
    // User can tap a button to change the color of the background view
        findViewById(R.id.ChangeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.yellow));

            }
        });
        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.ChangeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");

            }
        });
        // User can tap on the background view to reset all views to default settings.
      findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              textView.setText("Hello from Shri!");
              textView.setTextColor(getResources().getColor(R.color.black));
              findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.green));
          }
      });

      findViewById(R.id.ChangecustomTextButton).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
              if (userEnteredText.isEmpty()) {
                  textView.setText("Enter your own text!");
              } else {
                  textView.setText(userEnteredText);
              }
          }
      });
    }
}
