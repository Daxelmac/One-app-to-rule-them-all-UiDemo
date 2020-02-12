package com.example.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

public class PickerDemoActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.UiDemo.MESSAGE";

    //int numberPickerNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_demo);

        //Get the widgets reference from XML layout
        final TextView tv = findViewById(R.id.tv);
        NumberPicker np = findViewById(R.id.np);

        //Setting Color of text string
        tv.setTextColor(Color.parseColor("#ffd32b3b"));

        //setting min and max value for Number picker
        np.setMaxValue(100);
        np.setMinValue(0);
        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(false);

        //Set a value change listener for NumberPicker
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                //Display the newly selected number from picker
                tv.setText("Selected Number : " + newVal);

                //numberPickerNumber = newVal;
            }
        });
    }

    public void okayButtonClick(View view){
        //Intent intent = new Intent (this, MainActivity.class);
        //NumberPicker np = findViewById(R.id.np);
        //String message = np.toString().valueOf(numberPickerNumber);
        //intent.putExtra(EXTRA_MESSAGE, message).toString();
        //startActivity(intent);
    }

    public void cancelButtonClick(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
