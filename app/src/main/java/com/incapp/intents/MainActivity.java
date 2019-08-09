package com.incapp.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonIntentSend, buttonIntentView, buttonCameraIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIntentSend = findViewById(R.id.button_intent_send);
        buttonIntentView = findViewById(R.id.button_intent_view);
        buttonCameraIntent = findViewById(R.id.button_camera_intent);

//        This code is commented too to check Git. (Aakash)
//        buttonIntentSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_TEXT, "Hello World");
//
//                startActivity(intent);
//            }
//        });

//        This code is commented to test Git.
//        buttonIntentView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//
//                intent.setData(Uri.parse("https://www.google.co.in"));
//
//                startActivity(intent);
//            }
//        });

        buttonCameraIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
    }
}
