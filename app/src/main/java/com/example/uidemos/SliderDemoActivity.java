package com.example.uidemos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SliderDemoActivity extends AppCompatActivity {

    TextView tvProgressLabel1;
    TextView tvProgressLabel2;
    TextView tvProgressLabel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_demo);


        // set a change listener on the SeekBar1
        SeekBar seekBar1Red = findViewById(R.id.seekBar1Red);
        seekBar1Red.setOnSeekBarChangeListener(seekBarChangeListener);

        int progress1 = seekBar1Red.getProgress();
        tvProgressLabel1 = findViewById(R.id.textView1Red);
        tvProgressLabel1.setText("Progress: " + progress1);

        // set a change listener on the SeekBar2
        SeekBar seekBar2Green = findViewById(R.id.seekBar2Green);
        seekBar2Green.setOnSeekBarChangeListener(seekBarChangeListener);

        int progress2 = seekBar1Red.getProgress();
        tvProgressLabel2 = findViewById(R.id.textView1Red);
        tvProgressLabel2.setText("Progress: " + progress2);

        // set a change listener on the SeekBar2
        SeekBar seekBar3Blue = findViewById(R.id.seekBar3Blue);
        seekBar3Blue.setOnSeekBarChangeListener(seekBarChangeListener);

        int progress3 = seekBar1Red.getProgress();
        tvProgressLabel3 = findViewById(R.id.textView1Red);
        tvProgressLabel3.setText("Progress: " + progress3);



    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            tvProgressLabel1.setText("Progress: " + progress);
            tvProgressLabel2.setText("Progress: " + progress);
            tvProgressLabel3.setText("Progress: " + progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }

    public void okayButtonClick(View view){
        //Intent intent = new Intent (this, MainActivity.class);
        //NumberPicker np = findViewById(R.id.np);
        //String message = np.toString().valueOf(numberPickerNumber);
        //intent.putExtra(EXTRA_MESSAGE, message).toString();
        //startActivity(intent);
    }

    public void cancelButtonClick(View view){
        //Intent intent = new Intent (this, MainActivity.class);
        //startActivity(intent);
    }
};
}
