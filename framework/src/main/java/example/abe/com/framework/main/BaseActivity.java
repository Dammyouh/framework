package example.abe.com.framework.main;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import example.abe.com.framework.viewinject.ViewInjectUtils;

public abstract class BaseActivity extends AppCompatActivity {

    protected Handler uiHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        ViewInjectUtils.inject(this);
        initData();
        initView();
    }

    abstract public int getLayoutID();

    abstract public void initData();

    abstract public void initView();
}
