package com.example.coco.jjlive;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.widget.VideoView;

/**
 * Created by coco on 2017/12/21.
 */

public class LookLive extends Activity implements View.OnClickListener {
    private String path = "";
    private VideoView mVideoView;
    private EditText mEditText;
    private Button mStartBtn;
    private Button mStopBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.look_live);
        if (!LibsChecker.checkVitamioLibs(this)) {
            return;
        }
        mEditText = findViewById(R.id.url);
        mVideoView =  findViewById(R.id.surface_view);
        mStartBtn =  findViewById(R.id.start);
        mStopBtn = findViewById(R.id.stop);

        mStartBtn.setOnClickListener(this);
        mStopBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                path = mEditText.getText().toString();
                if (!TextUtils.isEmpty(path)) {
                    mVideoView.setVideoPath(path);
                }
                break;
            case R.id.stop:
                mVideoView.stopPlayback();
                break;
        }
    }


}
