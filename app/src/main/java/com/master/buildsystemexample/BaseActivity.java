package com.master.buildsystemexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.mcxiaoke.packer.helper.PackerNg;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 如果没有找到渠道信息或遇到错误，默认返回的是""
        // com.mcxiaoke.packer.helper.PackerNg
        String channel = PackerNg.getChannel(this);
        new AlertDialog.Builder(this).setMessage("channel:" + channel).create().show();
    }
}
