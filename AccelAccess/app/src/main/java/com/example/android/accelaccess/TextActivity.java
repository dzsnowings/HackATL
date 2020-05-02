package com.example.android.accelaccess;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TextActivity extends AppCompatActivity {
    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        final Button mTextButton = (Button) findViewById(R.id.button_text);

        mTextButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click++;
                        System.out.println("click="+click);
                        switch (click % 3) {
                            case 1:
                                mTextButton.setText("Long press to text MOM");
                                break;
                            case 2:
                                mTextButton.setText("Long press to text DAD");
                                break;
                            case 0:
                                mTextButton.setText("Long press to text CARETAKER");
                                break;
                            default:
                                setContentView(R.layout.activity_text);
                        }
                    }
                });

        mTextButton.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        setContentView(R.layout.activity_message);
                        return true;
                    }
                });
    }
}
