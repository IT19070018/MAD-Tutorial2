package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(tag: "Lifecycle", msg: "onCreate() invoked");

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(tag: "Lifecycle", msg:"onStart() invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag:"Lifecycle", msg:"onRestart() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag:"Lifecycle", msg"onPause() provoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag: "Lifecycle", msg:"onStop() provoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag:"Lifecycle", msg:"onDestroy() provoked");
    }
}