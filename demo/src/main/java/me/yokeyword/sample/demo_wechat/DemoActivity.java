package me.yokeyword.sample.demo_wechat;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.sample.R;

/**
 * 仿微信交互方式Demo   tip: 多使用右上角的"查看栈视图"
 * Created by YoKeyword on 16/6/30.
 */
public class DemoActivity extends SupportActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_OK);
                finish();
            }
        });

    }

}
