package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;

public class DadJoke extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_dad_joke, findViewById(R.id.content_frame)); // Inflate the specific layout for DadJokeActivity

        TextView jokeTextView = findViewById(R.id.joke_text_view);
        jokeTextView.setText("Why don't skeletons fight each other? They don't have the guts.");
    }
}
