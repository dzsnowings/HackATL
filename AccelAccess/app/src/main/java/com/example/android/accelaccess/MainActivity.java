package com.example.android.accelaccess;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button mStartButton = (Button) findViewById(R.id.button_start);

        mStartButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click++;
                        switch (click % 5) {
                            case 1:
                                mStartButton.setText("Long press to CALL");
                                break;
                            case 2:
                                mStartButton.setText("Long press to TEXT");
                                break;
                            case 3:
                                mStartButton.setText("Long press to navigate to MUSIC");
                                break;
                            case 4:
                                mStartButton.setText("Long press to navigate to TEST");
                                break;
                            case 0:
                                mStartButton.setText("Long press to navigate to COMMAND SETTINGS");
                                break;
                            default:
                                setContentView(R.layout.activity_main);
                        }
                    }
                });

        mStartButton.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        Intent intent;
                        switch (click % 5) {
                            case 1:
                                setContentView(R.layout.activity_call);
                                intent = new Intent(MainActivity.this, CallActivity.class);
                                MainActivity.this.startActivity(intent);
                                break;
                            case 2:
                                setContentView(R.layout.activity_text);
                                intent = new Intent(MainActivity.this, TextActivity.class);
                                MainActivity.this.startActivity(intent);
                                break;
                            case 3:
                                setContentView(R.layout.activity_music);
                                intent = new Intent(MainActivity.this, MusicActivity.class);
                                MainActivity.this.startActivity(intent);
                                break;
                            case 4:
                                setContentView(R.layout.activity_test);
                                break;
                            case 0:
                                setContentView(R.layout.activity_settings);
                                break;
                            default:
                                setContentView(R.layout.activity_main);
                        }
                        return true;
                    }
                });
    }
}
