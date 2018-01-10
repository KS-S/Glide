package cn.ks.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.ks.fastglide.TestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtils.toast(this, "hahaha");
    }
}
