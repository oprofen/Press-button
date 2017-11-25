package com.example.mo.press_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PressingActivity extends AppCompatActivity implements View.OnClickListener {

    Button mMainButton;
    TextView mWhatShouldBeShown;
    MyToast myToast;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressing);

        myToast = new MyToast();
        mMainButton = findViewById(R.id.main_button);
        mWhatShouldBeShown = findViewById(R.id.tv_what_sh_b_shown);
        mMainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.main_button) {
            Toast t = myToast.mToast;
            t.setText(count + "");
            t.show();
            mWhatShouldBeShown.setText(new StringBuffer(mWhatShouldBeShown.getText()).append("").append(count));
            count++;
            return;
        }
    }

    private class MyToast {
        Toast mToast;

        MyToast() {
            mToast = Toast.makeText(PressingActivity.this, "", Toast.LENGTH_LONG);
        }

    }
}
