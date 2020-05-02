package com.example.android.accelaccess;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {
    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        final Button mCallButton = (Button) findViewById(R.id.button_call);

        mCallButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click++;
                        System.out.println("click="+click);
                        switch (click % 3) {
                            case 1:
                                mCallButton.setText("Long press to call MOM");
                                break;
                            case 2:
                                mCallButton.setText("Long press to call DAD");
                                break;
                            case 0:
                                mCallButton.setText("Long press to call CARETAKER");
                                break;
                            default:
                                setContentView(R.layout.activity_call);
                        }
                    }
                });

        mCallButton.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        setContentView(R.layout.activity_callmom);
                        return true;
                    }
                });
    }
}
