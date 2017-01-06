package com.lx.marquee.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lx.marquee.R;
import com.lx.marquee.view.MarqueeLinearLayout;

public class MainActivity extends AppCompatActivity {

    private MarqueeLinearLayout leftMarqueeLinearLayout;
    private MarqueeLinearLayout rightMarqueeLinearLayout;
    private MarqueeLinearLayout upMarqueeLinearLayout;
    private MarqueeLinearLayout downMarqueeLinearLayout;
    private Button btnStart;
    private Button btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftMarqueeLinearLayout = (MarqueeLinearLayout) findViewById(R.id.leftMarqueeLinearLayout);
        rightMarqueeLinearLayout = (MarqueeLinearLayout) findViewById(R.id.rightMarqueeLinearLayout);
        upMarqueeLinearLayout = (MarqueeLinearLayout) findViewById(R.id.upMarqueeLinearLayout);
        downMarqueeLinearLayout = (MarqueeLinearLayout) findViewById(R.id.downMarqueeLinearLayout);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leftMarqueeLinearLayout.startMarquee();
                rightMarqueeLinearLayout.startMarquee();
                upMarqueeLinearLayout.startMarquee();
                downMarqueeLinearLayout.startMarquee();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leftMarqueeLinearLayout.pause();
                rightMarqueeLinearLayout.reset();
                upMarqueeLinearLayout.reset();
                downMarqueeLinearLayout.reset();
            }
        });

    }
}
