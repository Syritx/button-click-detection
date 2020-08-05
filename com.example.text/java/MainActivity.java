package com.example.text;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView textComponent = findViewById(R.id.textlabel);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
        
            @Override public void onClick(View v) {
                textComponent.setText("HI");
            }
        });
    }
}
