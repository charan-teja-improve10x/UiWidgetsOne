package com.improve10x.uiwidgetsone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class UiWidgetsActivity extends AppCompatActivity {
    Button submitBtn;
    Button ratingBarBtn;
    Button seekBarBtn;
    Button datePickerBtn;
    Button timePickerBtn;
    TextView progressTxt;
    SeekBar musicSb;
    RatingBar ratingBarRb;
    DatePicker calenderDp;
    TimePicker clockTp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_widgets);
        handleInitin();
        handleSubmitBtn();
        handleSeekBarBtn();
        handleRatingBarBtn();
        handleDatePickerBtn();
        handleTimePickerBtn();

    }

    private void handleInitin() {
        seekBarBtn = findViewById(R.id.seek_bar_btn);
        progressTxt = findViewById(R.id.progress_txt);
        submitBtn = findViewById(R.id.submit_btn);
        musicSb = findViewById(R.id.music_sb);
        ratingBarBtn = findViewById(R.id.ratingbar_btn);
        ratingBarRb = findViewById(R.id.ratingbar_rb);
        datePickerBtn = findViewById(R.id.datepicker_btn);
        calenderDp = findViewById(R.id.calender_dp);
        timePickerBtn = findViewById(R.id.timepicker_btn);
        clockTp = findViewById(R.id.clock_tp);
    }

    public void handleSeekBarBtn() {
        seekBarBtn.setOnClickListener(view -> {
            musicSb.setVisibility(View.VISIBLE);
            ratingBarRb.setVisibility(View.GONE);
            calenderDp.setVisibility(View.GONE);
            clockTp.setVisibility(View.GONE);
        });
    }

    public void handleRatingBarBtn() {
        ratingBarBtn.setOnClickListener(v -> {
            ratingBarRb.setVisibility(View.VISIBLE);
            musicSb.setVisibility(View.GONE);
            calenderDp.setVisibility(View.GONE);
            clockTp.setVisibility(View.GONE);
        });
    }

    public void handleDatePickerBtn() {
        datePickerBtn.setOnClickListener(v -> {
            calenderDp.setVisibility(View.VISIBLE);
            ratingBarRb.setVisibility(View.GONE);
            musicSb.setVisibility(View.GONE);
            clockTp.setVisibility(View.GONE);
        });
    }

    public void handleTimePickerBtn() {
        timePickerBtn.setOnClickListener(v -> {
            clockTp.setIs24HourView(true);
            clockTp.setVisibility(View.VISIBLE);
            calenderDp.setVisibility(View.GONE);
            ratingBarRb.setVisibility(View.GONE);
            musicSb.setVisibility(View.GONE);
        });
    }

    private void handleSubmitBtn() {
        submitBtn.setOnClickListener(view -> {
            int progress = musicSb.getProgress();
            progressTxt.setText(progress + " ");
            String rating = String.valueOf(ratingBarRb.getRating());
            progressTxt.setText(rating);
            String year = String.valueOf(calenderDp.getYear());
            String month = String.valueOf(calenderDp.getMonth());
            String date = String.valueOf(calenderDp.getDayOfMonth());
            progressTxt.setText(date + " / " + month + " / " + year);
            clockTp.setIs24HourView(true);
            String hour = String.valueOf(clockTp.getCurrentHour());
            String minute = String.valueOf(clockTp.getCurrentMinute());
            progressTxt.setText(hour + " : " + minute);

        });
    }
}