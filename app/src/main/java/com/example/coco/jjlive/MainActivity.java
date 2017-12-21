package com.example.coco.jjlive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn_live;//直播
    private Button mBtn_look_live;//观看直播

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查找控件
        mBtn_live =  findViewById(R.id.mBtn_live);
        mBtn_look_live =  findViewById(R.id.mBtn_look_live);

        //添加按钮的点击事件
        mBtn_live.setOnClickListener(this);
        mBtn_look_live.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {//点击按钮跳转到相应的界面
        switch (v.getId()) {
            case R.id.mBtn_live:
                startActivity(new Intent(this, Live.class));
                break;
            case R.id.mBtn_look_live:
                startActivity(new Intent(this, LookLive.class));
                break;
        }
    }
}
