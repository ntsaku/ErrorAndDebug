package com.example.naosan.erroranddebug;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.textView);

        Log.d("ANDROID", textView.toString()); // デバッグ用に追加する

//        textView = null;

        Log.d("ANDROID", textView.toString()); // デバッグ用に追加する

        textView.setText("Hello Android");

    }
}