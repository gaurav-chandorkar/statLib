package com.grv.statlibapp;

import android.os.Bundle;
import android.widget.TextView;

import com.grv.statlib.CentralTendency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 15; i++) {
            numbers.add(r.nextInt(7) + 1);
        }

        double mean = CentralTendency.arithmeticMean(numbers).doubleValue();
        //double median = CentralTendency.median(numbers);
        // ArrayList<Integer> mode = CentralTendency.mode(numbers);

        Collections.sort(numbers);

        String res = String.format(Locale.ENGLISH, "Numbers:\n\n%s\nMean: %.1f\nMedian: %.1f\nMode: %s\n",
                numbers, mean, 33d, 44d);


        textView.setText(res);

    }
}
