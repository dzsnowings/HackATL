package com.example.android.accelaccess;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MessageActivity extends AppCompatActivity {
    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        final Button mMessageButton = (Button) findViewById(R.id.button_message);

        mMessageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click++;
                        System.out.println("click="+click);
                        switch (click % 3) {
                            case 1:
                                mMessageButton.setText("Please pick me up from school.");
                                break;
                            case 2:
                                mMessageButton.setText("I love you!");
                                break;
                            case 0:
                                mMessageButton.setText("Call me");
                                break;
                            default:
                                setContentView(R.layout.activity_message);
                        }
                    }
                });

        mMessageButton.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        setContentView(R.layout.activity_textdad);
                        return true;
                    }
                });
    }
}
