package com.example.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.example.uidemos.PickerDemoActivity.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SampleActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "++ ON CREATE ++");
        setContentView(R.layout.activity_main);

        // Get the Intent that started this activity and extract the string
       // Intent intent = getIntent();
        //String message = intent.getI;

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.numberPickerNumber);
        //textView.setText(message);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(TAG, "++ ON START ++");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "+ ON RESUME +");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG, "- ON PAUSE -");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "-- ON STOP --");
    }

    public void pickerDemoButtonClick(View view){
        Intent intent = new Intent (this, PickerDemoActivity.class);
        startActivity(intent);
    }

    public void editTextDemoButtonClick(View view){
        Intent intent = new Intent (this, EditTextDemoActivity.class);
        startActivity(intent);
    }

    public void sliderDemoButtonClick(View view){
        Intent intent = new Intent (this, SliderDemoActivity.class);
        startActivity(intent);
    }

}
