package example.abe.com.android.activity.ipc;

import android.content.Intent;
import android.view.View;

import com.example.OnClick;

import example.abe.com.android.R;
import example.abe.com.android.activity.ipc.aidl.AidlActivity;
import example.abe.com.android.activity.ipc.messenger.MessengerActivity;
import example.abe.com.framework.main.BaseActivity;

public class IpcActivity extends BaseActivity {

    @Override
    public int getLayoutID(){
        return R.layout.activity_ipc;
    }

    @Override
    public void initData() {
    }

    @Override
    public void initView() {
    }

    @OnClick({R.id.act_messenger_btn_messenger, R.id.act_messenger_btn_aidl})
    public void onBtnClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.act_messenger_btn_messenger:
                intent.setClass(this, MessengerActivity.class);
                break;
            case R.id.act_messenger_btn_aidl:
                intent.setClass(this, AidlActivity.class);
                break;
        }
        startActivity(intent);
    }
}
