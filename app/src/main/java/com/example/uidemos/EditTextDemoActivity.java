package com.example.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditTextDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_demo);
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
