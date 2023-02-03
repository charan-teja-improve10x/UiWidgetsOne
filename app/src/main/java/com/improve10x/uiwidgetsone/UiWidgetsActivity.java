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
  Button seekBarBtn;
  Button ratingBarBtn;
  Button datePickerBtn;
  Button timePickerBtn;
  SeekBar musicSb;
  RatingBar ratingBarRb;
  DatePicker calenderDp;
  TimePicker clockTp;
  TextView progressTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_widgets);
        intiateAllComponents();
        hideUiComponents();
        handleSeekBarBtn();
        handleRatingBarBtn();
        handleDatePickerBtn();
        handleTimePickerBtn();
        handleSubmitBtn();
    }

    private void intiateAllComponents() {
        submitBtn = findViewById(R.id.submit_btn);
        seekBarBtn = findViewById(R.id.seek_bar_btn);
        ratingBarBtn = findViewById(R.id.ratingbar_btn);
        datePickerBtn = findViewById(R.id.datepicker_btn);
        timePickerBtn = findViewById(R.id.timepicker_btn);
        musicSb = findViewById(R.id.music_sb);
        ratingBarRb = findViewById(R.id.ratingbar_rb);
        calenderDp = findViewById(R.id.calender_dp);
        clockTp = findViewById(R.id.clock_tp);
        progressTxt = findViewById(R.id.progress_txt);
    }

    private void hideUiComponents() {
        musicSb.setVisibility(View.GONE);
        ratingBarRb.setVisibility(View.GONE);
        calenderDp.setVisibility(View.GONE);
        clockTp.setVisibility(View.GONE);
        submitBtn.setVisibility(View.GONE);
        progressTxt.setVisibility(View.GONE);
    }

    private void handleSeekBarBtn() {
       seekBarBtn.setOnClickListener(v -> {
           musicSb.setVisibility(View.VISIBLE);
           submitBtn.setVisibility(View.VISIBLE);
           progressTxt.setText(" ");
           progressTxt.setVisibility(View.VISIBLE);
           ratingBarRb.setVisibility(View.GONE);
           calenderDp.setVisibility(View.GONE);
           clockTp.setVisibility(View.GONE);
       });
    }

    private void handleRatingBarBtn() {
        ratingBarBtn.setOnClickListener(v -> {
            ratingBarRb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText(" ");
            progressTxt.setVisibility(View.VISIBLE);
            musicSb.setVisibility(View.GONE);
            calenderDp.setVisibility(View.GONE);
            clockTp.setVisibility(View.GONE);
        });
    }

    private void handleDatePickerBtn() {
        datePickerBtn.setOnClickListener(v -> {
           calenderDp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText(" ");
            progressTxt.setVisibility(View.VISIBLE);
            musicSb.setVisibility(View.GONE);
            ratingBarRb.setVisibility(View.GONE);
            clockTp.setVisibility(View.GONE);
        });
    }

    private void handleTimePickerBtn() {
        timePickerBtn.setOnClickListener(v -> {
            clockTp.setIs24HourView(true);
            clockTp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText(" ");
            progressTxt.setVisibility(View.VISIBLE);
            musicSb.setVisibility(View.GONE);
            ratingBarRb.setVisibility(View.GONE);
            calenderDp.setVisibility(View.GONE);
        });
    }
    private void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
          if (musicSb.getVisibility() == View.VISIBLE){
              int progress = musicSb.getProgress();
              progressTxt.setText(progress + " ");
          }
          if (ratingBarRb.getVisibility() == View.VISIBLE){
              String rating = String.valueOf(ratingBarRb.getRating());
              progressTxt.setText(rating);
          }
          if (calenderDp.isShown() == true){
              String date = String.valueOf(calenderDp.getDayOfMonth());
              String month = String.valueOf(calenderDp.getMonth()+1);
              String year = String.valueOf(calenderDp.getYear());
              progressTxt.setText(date + " / " + month + " /" + year);
          }
          if (clockTp.isShown() == true){
              String hours = String.valueOf(clockTp.getCurrentHour());
              String minutes = String.valueOf(clockTp.getCurrentMinute());
              progressTxt.setText(hours + " : " + minutes);
          }
        });
    }
}